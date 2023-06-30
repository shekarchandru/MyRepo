package com.gl.thyme.libmgmtash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gl.thyme.libmgmtash.entity.Book;
import com.gl.thyme.libmgmtash.service.BookService;



@Controller
@RequestMapping("/books")
public class BookController {
	
	private BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("/list")
	public String showBooks(Model model) {
		List<Book> books = bookService.findAll();
		model.addAttribute("books", books);
		return "books/list-books";
	}
	
	@PostMapping("/save")
	public String saveBook(@ModelAttribute("book") Book book) {
		bookService.save(book);
		return "redirect:/books/list";
	}
	
	
	
	@GetMapping("/showFormToAdd")
	public String showFormToAdd(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "books/book-form";
	}
	
	@PostMapping("/showFormToUpdate")// changed from put to post
	public String showFormToUpdate(@RequestParam("bookId") int id, Model model) {
		Book book = bookService.findById(id);
		model.addAttribute("book", book);
		return "books/book-form";
	}
	
	@PostMapping("/delete")
	public String deleteBook(@RequestParam("bookId") int id) {
		bookService.deleteById(id);
		return "redirect:/books/list";
	}
}
