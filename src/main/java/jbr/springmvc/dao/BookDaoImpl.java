package jbr.springmvc.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jbr.springmvc.model.Book;

@Repository
public class BookDaoImpl {//implements BookDao {
  
  public BookDaoImpl() {
    
  }
  
 /* @Autowired
  private SessionFactory sessionFactory;
 
  public void setSessionFactory(SessionFactory sf) {
    this.sessionFactory = sf;
  }*/

 /*private HibernateTemplate hibernateTemplate;
 
 public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
        this.hibernateTemplate.setCheckWriteOperations(false);
    }*/
	
  /*public void add(Book book) {
    
    Session session = this.sessionFactory.getCurrentSession();
    session.persist(book);
    
    hibernateTemplate.save(book);
   
    hibernateTemplate.flush();

  }
  
  public Book getBook(Book book) {
    Session session = this.sessionFactory.getCurrentSession();
    Book bookRet = (Book) session.load(Book.class, book.getTitle());
    return bookRet;
    Session session = this.sessionFactory.getCurrentSession();
    Criteria criteria = session.createCriteria(Book.class);
    criteria.add(Restrictions.eq("title", book.getTitle()));
    return (Book) criteria.uniqueResult();
    
  }
  

  public void delete(Book book) {
    Session session = this.sessionFactory.getCurrentSession();
    Book bookDel = (Book) session.load(Book.class, book.getTitle());
    if (null != bookDel) {
      session.delete(bookDel);
    }
    
    Query query = session.createSQLQuery("delete from Book where title = :title");
    query.setString("title", book.getTitle());
    query.executeUpdate();
  } */

  

}