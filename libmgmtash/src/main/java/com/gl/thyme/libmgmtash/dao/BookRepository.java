package com.gl.thyme.libmgmtash.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.thyme.libmgmtash.entity.Book;



public interface BookRepository extends JpaRepository<Book, Integer>{
	
}
