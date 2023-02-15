package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChocolateServices {
    
    @Autowired
    ChocolateRepository chocRepo;
    
    public List<Chocolate> getAllChocolates(){
        return chocRepo.findAll();
    } 
}
