package com.gl.thyme.libmgmtash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.thyme.libmgmtash.dao.BookRepository;
import com.gl.thyme.libmgmtash.entity.Book;



@Service
public class BookService {
	
	private BookRepository bookRepository;
	
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	//findAll
	public List<Book> findAll() {
		return bookRepository.findAll();
	}
	
	//findById
	public Book findById(int id) {
		Optional<Book> result = bookRepository.findById(id);
		Book book = null;
		if (result.isPresent()) {
			book = result.get();
		} else {
			throw new RuntimeException("Did not find");
		}
		return book;
	}
	
	//insert
	public void save(Book book) {
		bookRepository.save(book);
	}
	
	//delete
	public void deleteById(int id) {
		bookRepository.deleteById(id);
	}
}
