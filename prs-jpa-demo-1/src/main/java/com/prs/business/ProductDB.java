package com.prs.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.prs.db.DBUtil;

public class ProductDB {
	public static Product getProductById(int productID) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
			Product product = em.find(Product.class, productID);

			return product;
		} finally {
			em.close();
			// DBUtil.closeEMF();
		}

	}

	public static List<Product> getAll() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		List<Product> products = new ArrayList<>();
		try {
			Query q = em.createQuery("SELECT p FROM Product p");
			products = q.getResultList();

		} finally {
			em.close();
			// DBUtil.closeEMF();
		}
		return products;
	}

	public static boolean delete(Product p) {
		boolean success = false;
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			Product p2 = em.find(Product.class, p.getId());
			em.merge(p2);
			em.remove(p2);
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
