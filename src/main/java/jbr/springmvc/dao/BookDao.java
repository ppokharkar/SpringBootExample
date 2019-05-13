package jbr.springmvc.dao;

import java.util.List;

import jbr.springmvc.model.Book;

public interface BookDao {

  void add(Book book);
  Book getBook(Book book);
  void delete(Book book);

}
