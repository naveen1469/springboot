package com.training.angularSpringBoot.controllers;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.angularSpringBoot.model.Product;


@RestController
@CrossOrigin(origins = "http://localhost:5200, https://angular-heroku-example1.herokuapp.com/")
@RequestMapping("/api/products")
public class ProductController {
	
	Logger logger = LogManager.getLogger(ProductController.class);
	@GetMapping
	public List<Product> list() {
       
		logger.debug("list() inside ProductController:");
		List<Product> products = new ArrayList<>();

		Product product = new Product();
		product.setProductId("1");
		product.setProductName("ng-book");
		product.setPrice(25.32f);
		product.setStarRating(3.5f);
		product.setImage("/assets/images/ngbook.jpg");
		products.add(product);
		
		product = new Product();
		product.setProductId("2");
		product.setProductName("pRo anGular");
		product.setPrice(55.32f);
		product.setStarRating(2.5f);
		product.setImage("/assets/images/proangular.jpg");
		products.add(product);
		
		product = new Product();	
		product.setProductId("3");
		product.setProductName("Angular");
		product.setPrice(50.00f);
		product.setStarRating(4.5f);
		product.setImage("/assets/images/angular.png");
		products.add(product);

		product = new Product();
		product.setProductId("4");
		product.setProductName("NodeJs");
		product.setPrice(599.00f);
		product.setStarRating(5.0f);
		product.setImage("/assets/images/nodejsinaction.jpg");
		products.add(product);
		
		return products;
	}
}

