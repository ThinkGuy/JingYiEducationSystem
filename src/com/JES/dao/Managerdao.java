package com.JES.dao;

import org.springframework.transaction.annotation.Transactional;

import com.JES.model.Manager;

@Transactional
public interface Managerdao {
	public String getMname(Manager manager);
	public String getPassword(Manager manager);
}