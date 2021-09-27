package com.wz.ecommerce.checkout.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wz.ecommerce.checkout.entities.Checkout;

@Repository
public interface CheckoutRepository extends JpaRepository<Checkout, Long>{

}
