package com.wz.ecommerce.checkout.resource.checkout;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wz.ecommerce.checkout.entities.Checkout;
import com.wz.ecommerce.checkout.services.CheckoutService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutService service;

    @PostMapping("/")
    public ResponseEntity<Void> create(CheckoutRequest checkoutRequest) {
		service.create(checkoutRequest);    	
    	return ResponseEntity.ok().build();   
    }
}
