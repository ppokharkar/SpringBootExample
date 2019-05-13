package jbr.springmvc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jbr.springmvc.model.Book;
import jbr.springmvc.repo.BookRepository;

@Service("bookService")
public class BookServiceImpl implements BookService {


  @Autowired
  BookRepository bookRepository;

  public void setBookRepository(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }
  @Transactional
  public Book add(Book book) {
    return bookRepository.save(book);
  }
  @Transactional
  public Optional<Book> getBook(int bookId) {
    return bookRepository.findById(bookId);
  }
  @Transactional
  public void deleteBook(int bookId) {
    bookRepository.deleteById(bookId);  }

  /*@Transactional
  public List<Book> getBookByTitle(String title) {
    return bookRepository.find(title);
    }*/

}
