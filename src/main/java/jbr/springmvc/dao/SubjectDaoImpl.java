package jbr.springmvc.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jbr.springmvc.model.Subject;

@Repository
public class SubjectDaoImpl {//implements SubjectDao {
  
/*  @Autowired
  private SessionFactory sessionFactory;
 
  public void setSessionFactory(SessionFactory sf) {
    this.sessionFactory = sf;
  }
  
public SubjectDaoImpl() {
    
  }


  public void add(Subject subject) {
    System.out.println("In DAO");

    
    Session session = this.sessionFactory.getCurrentSession();
    session.persist(subject);

  }

  public Subject getSubject(Subject subject) {
    Session session = this.sessionFactory.getCurrentSession();
    Criteria criteria = session.createCriteria(Subject.class);
    criteria.add(Restrictions.eq("subtitle", subject.getSubtitle()));
    return (Subject) criteria.uniqueResult();
    
  }
  

  public int delete(Subject subject) {
    Session session = this.sessionFactory.getCurrentSession();
     Book bookDel = (Book) session.load(Book.class, book.getTitle());
     if (null != bookDel) {
       session.delete(bookDel);
     }
     
     Query query = session.createSQLQuery("delete from SUBJECT where subtitle = :subtitle");
     query.setString("subtitle", subject.getSubtitle());
     int cnt = query.executeUpdate();
     System.out.println(cnt);
    return cnt;
  }*/
  

}