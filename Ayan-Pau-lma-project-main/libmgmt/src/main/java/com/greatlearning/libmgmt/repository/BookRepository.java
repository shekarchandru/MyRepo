package com.greatlearning.libmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.libmgmt.entity.Book;

public interface BookRepository
	extends JpaRepository<Book,Integer>{

}
