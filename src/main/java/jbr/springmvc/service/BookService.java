package jbr.springmvc.service;

import java.util.Optional;

import jbr.springmvc.model.Book;

public interface BookService {

  Book add(Book book);
  
  Optional<Book>  getBook(int bookId);
  
  void deleteBook(int bookId);
  
  //List<Book> getBookByTitle(String title);

}
