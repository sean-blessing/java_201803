package com.bmdb.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.bmdb.db.DBUtil;

public class MovieDB {
	public static Movie getMovieById(int userID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
			Movie user = em.find(Movie.class, userID);

			return user;
		} finally {
			em.close();
			// DBUtil.closeEMF();
		}

	}

	public static List<Movie> getAll() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		List<Movie> movies = new ArrayList<>();
		try {
			Query q = em.createQuery("SELECT m FROM Movie m");
			movies = q.getResultList();

		} finally {
			em.close();
			// DBUtil.closeEMF();
		}
		return movies;
	}

	public static boolean delete(Movie m) {
		boolean success = false;
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			Movie m2 = em.find(Movie.class, m.getId());
			em.merge(m2);
			em.remove(m2);
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
