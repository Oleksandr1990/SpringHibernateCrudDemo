package com.oleksiienko.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oleksiienko.dao.ManagerDao;
import com.oleksiienko.model.Manager;




@Repository
public class ManagerDaoimpl implements ManagerDao {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Manager manager) {
		session.getCurrentSession().save(manager);
		
	}

	@Override
	public void edit(Manager manager) {
		session.getCurrentSession().update(manager);
	}

	@Override
	public void delete(int managerId) {
		
		session.getCurrentSession().delete(getManager(managerId));
	}

	@Override
	public Manager getManager(int managerId) {
		return (Manager)session.getCurrentSession().get(Manager.class, managerId);
	}

	@Override
	public List<Manager> getAllManagers() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Manager").list();
	}

}
