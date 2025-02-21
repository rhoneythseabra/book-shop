package com.book_shop.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book_shop.practice.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
