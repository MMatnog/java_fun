package com.marvinmatnog.fullstacktest.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.marvinmatnog.fullstacktest.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	// Retrieve all Books
	List<Book> findAll();
	
	// Find by Descriptions containing String
	List<Book> findByDescriptionContaining(String search);
	
	// Count by Title containing String
	Long countByTitleContaining(String search);
	
	Long deleteByTitleStartingWith(String search);
}
