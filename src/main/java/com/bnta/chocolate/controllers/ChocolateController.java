package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.ChocolateServices;
import com.bnta.chocolate.services.EstateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/chocolate")
public class ChocolateController {

    @Autowired
    ChocolateServices chocolateServices;

    @GetMapping
    public ResponseEntity<List<Chocolate>> getAllChocaltes(){
        List<Chocolate> chocsToReturn = chocolateServices.getAllChocolates();
        return new ResponseEntity<>(chocsToReturn, HttpStatus.OK);
    }
}
