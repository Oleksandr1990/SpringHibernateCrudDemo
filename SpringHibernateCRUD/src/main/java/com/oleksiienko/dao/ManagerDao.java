package com.oleksiienko.dao;

import java.util.List;

import com.oleksiienko.model.Manager;

public interface ManagerDao {
	public void add(Manager manager);
	public void edit(Manager manager);
	public void delete(int managerId);
	public Manager getManager(int managerId);
	public List<Manager> getAllManagers();
}
