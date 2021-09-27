package com.wz.ecommerce.checkout.services;

import java.util.Optional;

import com.wz.ecommerce.checkout.entities.Checkout;
import com.wz.ecommerce.checkout.resource.checkout.CheckoutRequest;

public interface CheckoutService {

	Optional<Checkout> create(CheckoutRequest checkoutRequest);
	
}
