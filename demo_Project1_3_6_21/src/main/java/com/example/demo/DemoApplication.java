package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		RestaurantsREPO restaurantsREPO = new RestaurantsREPO("jdbc:sqlite:D:\\SQLiteDB\\Project_3_6_21\\ProjectRestaurant.db");

		RestaurantsController.reset_m_Restaurants();

		System.out.println(restaurantsREPO.getAllRestaurants());
	}

}
