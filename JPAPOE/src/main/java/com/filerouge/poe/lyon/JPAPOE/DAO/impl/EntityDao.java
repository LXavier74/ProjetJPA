package com.filerouge.poe.lyon.JPAPOE.DAO.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.filerouge.poe.lyon.JPAPOE.model.Client;

public abstract class EntityDao <T>{
private Dao dao = null;

public EntityDao(Dao dao) {
	super();
	this.dao = dao;
}

public T add(T p) {
	EntityManager em = null;
	try {
		em = dao.newEntityManager();
		em.persist(p); //Insert
		em.getTransaction().commit();
		return(p);
	} finally {
		dao.CloseEntityManager(em);
	}
}

public void update(T p)
{
	EntityManager em = null;
	try {
		em = dao.newEntityManager();
		em.merge(p); //Fupdate
		em.getTransaction().commit();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		dao.CloseEntityManager(em);
	}
}

public void remove(Class <T> eClass, Object pk)
{
	EntityManager em = null;
	try {
		em = dao.newEntityManager();
		T p = em.find(eClass,pk);
		em.remove(em);; //Delte
		em.getTransaction().commit();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		dao.CloseEntityManager(em);
	}
}
public T find(Class <T> eClass, Object pk)
{
	EntityManager em = null;
	try {
		em = dao.newEntityManager();
		return em.find(eClass, pk);
	} finally {
		dao.CloseEntityManager(em);
	}
}
public List<T> findAll(Class <T> eClass) {
EntityManager em = null;
try {
em = dao.newEntityManager();
String query = "SELECT p FROM "+eClass.getSimpleName()+" p";
TypedQuery<T> q = em.createQuery(query, eClass);
return q.getResultList();
} finally {
dao.CloseEntityManager(em);
}
}

public List<T> requeteNamed(Class <T> eClass, String requete) {
EntityManager em = null;
try {
em = dao.newEntityManager();
TypedQuery<T> q = em.createNamedQuery(requete, eClass);
return q.getResultList();
} finally {
dao.CloseEntityManager(em);
}
}

public List<T> requeteNamed(Class <T> eClass, String requete, Object...param) {
EntityManager em = null;
try {
em = dao.newEntityManager();
TypedQuery<T> q = em.createNamedQuery(requete, eClass);
int i =1;
for (Object p : param) {
	q.setParameter(i, p);
	i++;
}

return q.getResultList();
} finally {
dao.CloseEntityManager(em);
}
}
}
