package com.jsp.hibernate_car.service;

import java.util.List;

import com.jsp.hibernate_car.dao.CarDao;
import com.jsp.hibernate_car.dto.Car;

public class CarService {
	 CarDao carDao = new CarDao();
		
		/*
		 * save Car method...
		 */
		public Car saveCarService(Car car) {
			
			return carDao.saveCarDao(car);
		}
		
		/*
		 * get Car by Id method...
		 */
		public Car getCarByIdService(int id) {
			return carDao.getCarByIdDao(id);
		}
		
		/*
		 * update Car By Id method...
		 */
		//update Car Engine Type
		public Car updateCarByIdService(int id, String type) {
			Car car=carDao.updateCarByIdDao(id, type);
			if(car!=null) {
				System.out.println("Data  Updated");
			}
			else {
				System.err.println("Id is not present");
			}
			return car;
		}
		
		//update Car Strokes
		 public Car updateCarByIdService(int id, int strokes) {
			Car car=carDao.updateCarByIdDao(id, strokes);
			if(car!=null) {
				System.out.println("Data  Updated");
			}
			else {
				System.err.println("Id is not present");
			}
			return car;
		}
		 
		//update Car Engine Type
		public Car updateCarByIdService(int id, double price) {
			Car car=carDao.updateCarByIdDao(id, price);
			if(car!=null) {
				System.out.println("Data  Updated");
			}
			else {
				System.err.println("Id is not present");
			}
			return car;
		}
		
		/*
		 * delete Car By Id method...
		 */
		public void deleteCarByIdService(int id) {
			Car car=carDao.getCarByIdDao(id);
			if(car!=null) {
				carDao.deleteCustomerByIdDao(id);
				System.out.println("Data  Deleted");
			}
			else {
				System.err.println("Id is not present");
			}
		}
		
		/*
		 * getAllCarData method...
		 */
		public List<Car> getAllCarDataService(){
			return carDao.getAllCarDataDao();
			
		}
				

}
