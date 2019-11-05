package com.gi2022.getdatafrommysql.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController; 

import com.gi2022.getdatafrommysql.model.Produit;
import com.gi2022.getdatafrommysql.service.ProduitService;



 
@RestController
@RequestMapping("/api")
public class RestApiController {
 
    public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
 
    @Autowired
    ProduitService produitService; //Service which will do all data retrieval/manipulation work
 
    // -------------------Retrieve All Products---------------------------------------------
 
    @RequestMapping(value = "/produit/", method = RequestMethod.GET)
    public ResponseEntity<List<Produit>> listAllUsers() {
        List<Produit> produits = produitService.getAllProducts();
        if (produits.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Produit>>(produits, HttpStatus.OK);
    }
 
    
 
    
    
 
    
 
}