package com.wz.ecommerce.checkout.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wz.ecommerce.checkout.entities.Checkout;
import com.wz.ecommerce.checkout.repositories.CheckoutRepository;
import com.wz.ecommerce.checkout.resource.checkout.CheckoutRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CheckoutServiceImpl implements CheckoutService {

	private final CheckoutRepository repository;

	@Override
	public Optional<Checkout> create(CheckoutRequest checkoutRequest) {
		final Checkout checkout = Checkout.builder()
				.build();
		return Optional.of(repository.save(checkout));
	}
}
