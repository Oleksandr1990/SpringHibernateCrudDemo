package com.oleksiienko.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.oleksiienko.model.Manager;
import com.oleksiienko.service.ManagerService;

@Controller
public class ManagerController {
	@Autowired
	private ManagerService managerService;
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Manager manager = new Manager();
		map.put("manager", manager);
		map.put("managerList", managerService.getAllManagers());
		return "manager";
	}
	@RequestMapping(value="/manager.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Manager manager, BindingResult result, @RequestParam String action, Map<String, Object> map){
			Manager managerResult = new Manager();
			switch(action.toLowerCase()){
			case "add":
				managerService.add(manager);
				managerResult = manager;
				break;
			case "edit":
				managerService.edit(manager);
				managerResult = manager;
				break;
			case "delete":
				managerService.delete(manager.getManagerId());
				managerResult = new Manager();
				break;
			case "search":
				Manager searchedManager = managerService.getManager(manager.getManagerId());
				managerResult = searchedManager !=null ? searchedManager : new Manager();
				break;
			}
			map.put("manager", managerResult);
			map.put("managerList", managerService.getAllManagers());
		return "manager";
		
	}
	
}
