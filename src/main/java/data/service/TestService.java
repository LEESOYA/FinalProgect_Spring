package data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.dao.TestDaoInter;

@Service
public class TestService implements TestServiceInter {

	@Autowired
	TestDaoInter dao;
	
}
