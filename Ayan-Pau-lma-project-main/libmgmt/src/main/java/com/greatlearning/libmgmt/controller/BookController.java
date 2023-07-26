package com.greatlearning.libmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.libmgmt.entity.Book;
import com.greatlearning.libmgmt.service.BookService;

@Controller
@RequestMapping("/books")

public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping("/list")
	public String listBooks(Model modelObj) {
System.out.println("We are saving");
		List<Book> books = bookService.listAll();

		modelObj.addAttribute("Books", books);

		return "books-lister";
	}

	//	@RequestMapping("addstep1")
	@RequestMapping("/addStep1")
	public String addBookStep1(Model modelObj) {
		Book newBook = new Book();

		modelObj.addAttribute("Book", newBook);
		return "book-form";
	}
	
	@RequestMapping("/updateStep1")
	public String showFormToUpdate(@RequestParam("bookId") int id, Model model) {
		Book book = bookService.findById(id);
		model.addAttribute("Book", book);
		return "book-form";
	}

	@PostMapping("/save")
	public String saveBook(
			@RequestParam("id")int id,
			@RequestParam("name")String name,
			@RequestParam("author")String author,
			@RequestParam("category")String category
			) {
			if (id!= 0) {
			//update flow
		
			//TODO-
			Book existingBook = bookService.findById(id);
			
			
			existingBook.setName(name);
			existingBook.setAuthor(author);
			existingBook.setCategory(category);
			
			bookService.save(existingBook);
			
			
		}else {
			//Add flow
			Book newBook = new Book (name,author,category);
			bookService.save(newBook);
			
			
		}
			return "redirect:/books/list";
		//return"Redirect:/books/lister";
		
	}
	@RequestMapping("/delete")
	public String deleteBook(@RequestParam("bookId") int id) {
		
		bookService.deleteById(id);
		return "redirect:/books/list";
	}

}
