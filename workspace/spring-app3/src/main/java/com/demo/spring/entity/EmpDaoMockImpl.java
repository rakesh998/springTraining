package com.demo.spring.entity;

import org.springframework.stereotype.Service;

@Service
public class EmpDaoMockImpl {
public String save(Emp e) {
	return "emp saved id "+e.getId();
}
}
