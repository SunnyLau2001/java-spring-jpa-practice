package com.example.jpapractice.repositories;

import com.example.jpapractice.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

// Already extended as Bean
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
