package com.oleksiienko.service;

import java.util.List;

import com.oleksiienko.model.Manager;

public interface ManagerService {
	public void add(Manager manager);
	public void edit(Manager manager);
	public void delete(int managerId);
	public Manager getManager(int managerId);
	public List<Manager> getAllManagers();
}
