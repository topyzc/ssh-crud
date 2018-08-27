package com.atguigu.ssh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.atguigu.ssh.entities.Employee;

public class EmployeeDao {
	
	private SessionFactory sessionFactory;
	
	
	

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
		
	}




	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}




	public List<Employee> getAll(){
		String hql="FROM Employee e LEFT OUTER JOIN FETCH e.department";
		return getSession().createQuery(hql).list();
	}
}
