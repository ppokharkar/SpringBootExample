package jbr.springmvc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import jbr.springmvc.model.Book;


public interface BookRepository extends CrudRepository<Book,Integer> { 
  
  /*@Query("SELECT b FROM Book b WHERE LOWER(b.title) = LOWER(:title)")
  public List<Book> find(@Param("title") String title);
*/
  
}