package com.jsp.hibernate_car.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_car.dto.Car;
import com.jsp.hibernate_car.service.CarService;

public class CarController {
	
public static void main(String[] args) {
		
		CarService carService=new CarService();
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1.Insert\n2.Get By Id\n3.Update\n4.Delete\n5.Get All Data");
			System.out.println("Choose your option...");
			
			int ch=sc.nextInt();
			switch(ch) {
			
			case 1:{
				System.out.println("Enter id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter engine type");
				String type=sc.nextLine();
				System.out.println("Enter strokes");
				int strokes=sc.nextInt();
				System.out.println("Enter price");
				double price=sc.nextDouble();
				carService.saveCarService(new Car(id,type,strokes,price));
			}
			break;
			
			case 2:{
				System.out.println("Enter Car id");
				int id=sc.nextInt();
				
				Car car=carService.getCarByIdService(id);
				if(car!=null) {
					System.out.println("id= " + car.getCarId());
					System.out.println("engine= " + car.getCarEngineType());
					System.out.println("strokes= " + car.getCarStrokes());
					System.out.println("price= " + car.getCarPrice());
				}
				else {
					System.out.println("id is not found please check once....");
				}
			}
			break;
			
			case 3:{
				System.out.println("Choose to Update");
				System.out.println("1.Engine type\n2.Strokes\n3.Price");
				int ch1=sc.nextInt();
				switch(ch1) {
				case 1:{
					System.out.println("Enter Car Id");
					int id=sc.nextInt();
					System.out.println("Enter Car New Engine Type");
					String type=sc.next();
					carService.updateCarByIdService(id,type);
				}
				break;
				
				case 2:{
					System.out.println("Enter Car Id");
					int id=sc.nextInt();
					System.out.println("Enter Car New Strokes");
					int strokes=sc.nextInt();
					carService.updateCarByIdService(id,strokes);
				}
				break;
				
				case 3:{
					System.out.println("Enter Car Id");
					int id=sc.nextInt();
					System.out.println("Enter Car New Price");
					double price=sc.nextDouble();
					carService.updateCarByIdService(id,price);
				}
				break;
				default:{
					System.out.println("Choose Valid Option");
				}
				break;
				}
				
			}
			break;
			case 4:{
				System.out.println("Enter Car Id");
				int id=sc.nextInt();
				carService.deleteCarByIdService(id);
			}
			break;
			case 5:{
				List<Car> car=carService.getAllCarDataService();
				Iterator<Car> itr=car.iterator();
				while(itr.hasNext()) {
					Car cars=itr.next();
					System.out.println("Car Id is "+cars.getCarId());
					System.out.println("Car Engine Type is "+cars.getCarEngineType());
					System.out.println("Car Strokes is "+cars.getCarStrokes());
					System.out.println("Car Price is "+cars.getCarPrice());
					System.out.println("================");
					
				}
			}
			
			default:{
				System.out.println("Choose valid option");
			}
			break;
			}
			
		}
			
	}

}
