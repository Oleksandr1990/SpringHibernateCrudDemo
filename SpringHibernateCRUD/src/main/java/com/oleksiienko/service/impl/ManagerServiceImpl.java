package com.oleksiienko.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oleksiienko.dao.ManagerDao;
import com.oleksiienko.model.Manager;
import com.oleksiienko.service.ManagerService;




@Service
public class ManagerServiceImpl implements ManagerService{
	@Autowired
	private ManagerDao managerDao;
	
	@Transactional
	public void add(Manager manager) {
		managerDao.add(manager);
	}

	@Transactional
	public void edit(Manager manager) {
		managerDao.edit(manager);	}

	@Transactional
	public void delete(int managerId) {
		managerDao.delete(managerId);
	}

	@Transactional
	public Manager getManager(int managerId) {
		return managerDao.getManager(managerId);
	
	}

	@Transactional
	public List<Manager> getAllManagers() {
	return managerDao.getAllManagers();
	}

}
