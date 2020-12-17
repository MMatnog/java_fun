package com.marvinmatnog.fullstacktest.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marvinmatnog.fullstacktest.models.Book;
import com.marvinmatnog.fullstacktest.services.BookService;

@Controller
public class BookController {
	private final BookService bookServ;
	
	public BookController(BookService bookServ) {
		this.bookServ = bookServ;
	}
	
	@RequestMapping("/books")
	public String index (Model model) {
		List<Book> books = bookServ.allBooks();
		model.addAttribute("books", books);
		return "/books/index.jsp";
	}
	
	@RequestMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "/books/new.jsp";
	}
	
	@RequestMapping(value ="/books", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "/books/new.jsp";
		} else {
			bookServ.createBook(book);
			return "redirect:/books";
		}
	}
	
	@RequestMapping("/books/{id}")
	public String show(@PathVariable("id") long id, Model model) {
		Book book = bookServ.findBook(id);
		model.addAttribute("book", book);
		return "/books/show.jsp";
	}
}
