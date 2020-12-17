package com.marvinmatnog.fullstacktest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.marvinmatnog.fullstacktest.models.Book;
import com.marvinmatnog.fullstacktest.repositories.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
	
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	
	public Book findBook(long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
	public void deleteBook(long id) {
		bookRepo.deleteById(id);
	}
	
	public Book updateBook(long id, 
							String title, 
							String desc, 
							String lang, 
							Integer numOfPages) {
		Book book = findBook(id);
		book.setTitle(title);
		book.setDescription(desc);
		book.setLanguage(lang);
		book.setNumberOfPages(numOfPages);
		return bookRepo.save(book);
	}
	
}
