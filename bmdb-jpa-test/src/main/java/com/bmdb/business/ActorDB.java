package com.bmdb.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.bmdb.db.DBUtil;

public class ActorDB {
	public static Actor getActorById(int userID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
			Actor user = em.find(Actor.class, userID);

			return user;
		} finally {
			em.close();
			// DBUtil.closeEMF();
		}

	}

	public static List<Actor> getAll() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		List<Actor> actors = new ArrayList<>();
		try {
			Query q = em.createQuery("SELECT a FROM Actor a");
			actors = q.getResultList();

		} finally {
			em.close();
			// DBUtil.closeEMF();
		}
		return actors;
	}

	public static boolean delete(Actor a) {
		boolean success = false;
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			Actor a2 = em.find(Actor.class, a.getId());
			em.merge(a2);
			em.remove(a2);
			trans.commit();
			success = true;
		} catch (Exception e) {
			System.out.println(e);
			trans.rollback();
		} finally {
			em.close();
		}

		return success;
	}
}
