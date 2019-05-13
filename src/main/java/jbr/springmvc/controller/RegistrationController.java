package jbr.springmvc.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.model.Book;
import jbr.springmvc.model.Subject;
import jbr.springmvc.service.BookService;
import jbr.springmvc.service.SubjectService;

@Controller
public class RegistrationController {
  @Autowired
  public BookService bookService;
  
  @Autowired
  public SubjectService subjectService;

  @RequestMapping(value = "/book", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("book");
    mav.addObject("book", new Book());

    return mav;
  }
  
  @RequestMapping(value = "/subject", method = RequestMethod.GET)
  public ModelAndView showSubject(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("subject");
    mav.addObject("subject", new Subject());

    return mav;
  }
  
  @RequestMapping(value = "/getbook", method = RequestMethod.GET)
  public ModelAndView getBooks(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("book") Book book) {
    ModelAndView mav = new ModelAndView("getbook");
    mav.addObject("getbook", new Book());
    return mav;
  }
  
  @RequestMapping(value = "/getbookByTitle", method = RequestMethod.GET)
  public ModelAndView getBooksByTitle(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("book") Book book) {
    ModelAndView mav = new ModelAndView("getbookByTitle");
    mav.addObject("getbookByTitle", new Book());
    return mav;
  }
  
  @RequestMapping(value = "/getsubjectByDuration", method = RequestMethod.GET)
  public ModelAndView getsubjectByDuration(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("subject") Subject subject) {
    ModelAndView mav = new ModelAndView("getsubjectByDuration");
    mav.addObject("getsubjectByDuration", new Subject());
    return mav;
  }
  
  @RequestMapping(value = "/getsubject", method = RequestMethod.GET)
  public ModelAndView getBooks(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("subject") Subject subject) {
    ModelAndView mav = new ModelAndView("getsubject");
    mav.addObject("getsubject", new Subject());
    return mav;
  }
  
  @RequestMapping(value = "/returnSubjectBySubTitle", method = RequestMethod.POST)
  public ModelAndView returnSubject(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("subject") Subject subject) {
    System.out.println("Hiiiiiiiiiiii");

    Optional<Subject> subjectreturn = subjectService.getSubject(subject.getSubjectId());
    System.out.println(subjectreturn.get());

    ModelAndView mav = new ModelAndView ("subjectreturned");
    if(null!=subjectreturn) {
      mav.addObject("message", subjectreturn.get());
    }else {
      mav.addObject("message", "Subject not found");
  
    }
    return mav;
  }
  
  
  /*@RequestMapping(value = "/returnSubjectByDuration", method = RequestMethod.POST)
  public ModelAndView returnSubjectByDuration(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("subject") Subject subject) {
    System.out.println("Hiiiiiiiiiiii");

    List<Subject> subjectreturn = subjectService.find(subject.getDurationInHours());
    System.out.println(subjectreturn);

    ModelAndView mav = new ModelAndView ("subjectreturned");
    if(null!=subjectreturn) {
      mav.addObject("message", subjectreturn);
    }else {
      mav.addObject("message", "Subject not found");
  
    }
    return mav;
  }*/
  
  @RequestMapping(value = "/delbook", method = RequestMethod.GET)
  public ModelAndView delBooks(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("book") Book book) {
    ModelAndView mav = new ModelAndView("delbook");
    mav.addObject("delbook", new Book());
    return mav;
  }
  
  @RequestMapping(value = "/delsubject", method = RequestMethod.GET)
  public ModelAndView delBooks(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("subject") Subject subject) {
    ModelAndView mav = new ModelAndView("delsubject");
    mav.addObject("delsubject", new Subject());
    return mav;
  }

  @RequestMapping(value = "/addBook", method = RequestMethod.POST)
  public ModelAndView addBook(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("book") Book book) {

    Book book1 = bookService.add(book);

    return new ModelAndView("bookadded", "title", book1.getTitle());
  }
  
  @RequestMapping(value = "/addSubject", method = RequestMethod.POST)
  public ModelAndView addSubject(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("subject") Subject subject) {
    ModelAndView mav =  new ModelAndView("welcome");;
    System.out.println("Hiiiiiiiiiiii");

    subjectService.add(subject);
    mav.addObject("message", "subject added successfully!!");

    return new ModelAndView ("subjectadded");
  }
  
  @RequestMapping(value = "/returnBookById", method = RequestMethod.POST)
  public ModelAndView returnBook(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("book") Book book) {
    System.out.println("Hiiiiiiiiiiii");
    System.out.println(book.getBookId());

    Optional<Book> bookreturn = bookService.getBook(book.getBookId());
    Book book1 = bookreturn.get();
    System.out.println("------------->"+book1);


    ModelAndView mav = new ModelAndView ("bookreturned");
    if(null!=bookreturn) {
      mav.addObject("message", book1);
    }else {
      mav.addObject("message", "Book not found");
  
    }
    return mav;
  }
  

 /* @RequestMapping(value = "/returnBookByTitle", method = RequestMethod.POST)
  public ModelAndView returnBookByTitle(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("book") Book book) {
    System.out.println("Hiiiiiiiiiiii");

    List<Book> bookreturn = bookService.getBookByTitle(book.getTitle());
    System.out.println(bookreturn);


    ModelAndView mav = new ModelAndView ("bookreturned");
    if(null!=bookreturn) {
      mav.addObject("message", bookreturn);
    }else {
      mav.addObject("message", "Book not found");
  
    }
    return mav;
  }*/
  
  @RequestMapping(value = "/deleteBookByTitle", method = RequestMethod.POST)
  public ModelAndView deleteBook(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("book") Book book) {
    System.out.println("Hiiiiiiiiiiii");

    bookService.deleteBook(book.getBookId());
    ModelAndView mav = new ModelAndView ("bookdeleted");
    mav.addObject("message", "Book deleted successfully!!");
    return mav;
  }
  
  @RequestMapping(value = "/deleteSubjectBySubTitle", method = RequestMethod.POST)
  public ModelAndView deleteSubject(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("subject") Subject subject) {
    System.out.println("deleteSubjectBySubTitle " + subject.getSubjectId());

    subjectService.deleteSubject(subject.getSubjectId());
    ModelAndView mav = new ModelAndView ("subjectdeleted");
    mav.addObject("message", "subject deleted successfully!!");
      return mav;
}
}
