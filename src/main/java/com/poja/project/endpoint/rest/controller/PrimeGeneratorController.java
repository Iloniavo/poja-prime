package com.poja.project.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.security.SecureRandom;

@RestController
public class PrimeGeneratorController {
    @GetMapping("/new-prime")
    public String primeGenerator(){
        return String.valueOf(BigInteger.probablePrime(500, new SecureRandom()));
    }
}
