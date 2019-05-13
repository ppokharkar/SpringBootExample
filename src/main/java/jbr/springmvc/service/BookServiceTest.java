package jbr.springmvc.service;

import static org.mockito.Mockito.doNothing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;
import static org.mockito.Mockito.times;
import org.junit.Before;
import static org.mockito.Mockito.verify;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jbr.springmvc.model.Book;
import jbr.springmvc.repo.BookRepository;
import junit.framework.Assert;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class BookServiceTest {
  @InjectMocks
   private BookServiceImpl bookService;
  
  @Mock
  BookRepository bookRepo;
  
  @Before
  public void init() {
      MockitoAnnotations.initMocks(this);
  }
   
   @SuppressWarnings("deprecation")

   @Test
   public void whenBookIdIsProvided_thenRetrievedBook() throws ParseException {
     Mockito.mock(BookServiceImpl.class);
     Book book = new Book();
     book.setBookId(1);
     book.setPrice(12.5);
     book.setTitle("java");
     book.setPublishDate(new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"));
     Optional<Book> userOptional = Optional.of(book);
     
      Mockito.when(bookService.getBook(1)).thenReturn(userOptional);
      Assert.assertEquals("java", userOptional.get().getTitle());
      Assert.assertEquals(12.5, userOptional.get().getPrice());
      Assert.assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"), book.getPublishDate());
   }
   
   @Test
   public void whenBookInsanceIsProvided_thenSaveBook() throws ParseException {
     Mockito.mock(BookServiceImpl.class);
     Book book = new Book();
     book.setBookId(1);
     book.setPrice(12.5);
     book.setTitle("java");
     book.setPublishDate(new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"));
     
      Mockito.when(bookService.add(book)).thenReturn(book);
      Assert.assertEquals("java", book.getTitle());
      Assert.assertEquals(12.5, book.getPrice());
      Assert.assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"), book.getPublishDate());
   }
   
}
