package com.jsp.hibernate_car.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_car.dto.Car;

public class CarDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("car");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	/*
	 * save Car method...
	 */
	public Car saveCarDao(Car car) {
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		return car;
	}
	
	/*
	 * get Car by Id method...
	 */
	public Car getCarByIdDao(int id) {
		return entityManager.find(Car.class, id);
	}
	

	/*
	 * update Car by Id method...
	 */
	//update Car Engine Type
	public Car updateCarByIdDao(int id,String type) {
		Car car=getCarByIdDao(id);
		
		if(car!=null) {
			car.setCarEngineType(type);
			entityTransaction.begin();
			entityManager.merge(car);
			entityTransaction.commit();
			
			return car;
		}
		return car;
	}
	//update Car Strokes
	public Car updateCarByIdDao(int id,int strokes) {
		Car car=getCarByIdDao(id);
		
		if(car!=null) {
			car.setCarStrokes(strokes);
			entityTransaction.begin();
			entityManager.merge(car);
			entityTransaction.commit();
			
			return car;
		}
		return car;
	}
	//update Car Price
	public Car updateCarByIdDao(int id,double price) {
		Car car=getCarByIdDao(id);
		
		if(car!=null) {
			car.setCarPrice(price);
			entityTransaction.begin();
			entityManager.merge(car);
			entityTransaction.commit();
			
			return car;
		}
		return car;
	}
	
	/*
	 * delete Customer by Id
	 */
	public void deleteCustomerByIdDao(int id) {
        Car customer=getCarByIdDao(id);
		
		if(customer!=null) {
			entityTransaction.begin();
			entityManager.remove(customer);
			entityTransaction.commit();
		}
	}
	
	/*
	 * getAllCarData
	 */
	public List<Car> getAllCarDataDao(){
//		String displayQuery="From Car";
//		
//		Query query=entityManager.createQuery(displayQuery);
//		
//		return query.getResultList();
		
		return entityManager.createQuery("From Car").getResultList();
		
	}

}
