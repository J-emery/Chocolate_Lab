package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.EstateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/estate")
public class EstateControllers {

    @Autowired
    EstateServices estateServices;
    @GetMapping
    public ResponseEntity<List<Estate>> getAllEstates(){
        List<Estate> estateToReturn = estateServices.getAllEstate();
        return new ResponseEntity<>(estateToReturn, HttpStatus.OK);
    }
}
