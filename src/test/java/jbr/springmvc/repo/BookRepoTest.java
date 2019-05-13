package jbr.springmvc.repo;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import jbr.springmvc.model.Book;
import jbr.springmvc.service.BookServiceImpl;

public class BookRepoTest {
  
  
  private BookServiceImpl bookServiceMock;

  private BookRepository bookRepositoryMock;

  @Before
  public void setUp() {
    bookServiceMock = new BookServiceImpl();

    bookRepositoryMock = mock(BookRepository.class);
    bookServiceMock.setBookRepository(bookRepositoryMock);
  }
  
  @Test
  public void create() throws ParseException {
    
    Book book = new Book();
    book.setBookId(1);
    book.setPrice(12.5);
    book.setTitle("java");
    book.setPublishDate(new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"));
    
    when(bookRepositoryMock.save(any(Book.class))).thenReturn(book);
    
    Book returned = bookServiceMock.add(book);
    verify(bookRepositoryMock, times(1)).save(book);

    assertEquals(book, returned);

    
  }

  
  @Test
  public void delete() throws ParseException {
    Book book = new Book();
    book.setBookId(1);
    book.setPrice(12.5);
    book.setTitle("java");
    book.setPublishDate(new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"));
    
    
    bookServiceMock.deleteBook(book.getBookId());
    
    verify(bookRepositoryMock, times(1)).deleteById(book.getBookId());
    
    
  }
  
  @Test
  public void findById() throws ParseException {
    
    Book book = new Book();
    book.setBookId(1);
    book.setPrice(12.5);
    book.setTitle("java");
    book.setPublishDate(new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"));
    Optional<Book> bookOptional = Optional.of(book);

    
      when(bookRepositoryMock.findById(1)).thenReturn(bookOptional);
      
      Optional<Book> returned = bookServiceMock.getBook(1);
      
      verify(bookRepositoryMock, times(1)).findById(1);
      verifyNoMoreInteractions(bookRepositoryMock);
      
      assertEquals(bookOptional, returned);
  }
  
  

}
