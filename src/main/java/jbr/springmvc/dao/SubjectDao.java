package jbr.springmvc.dao;

import jbr.springmvc.model.Subject;

public interface SubjectDao {

  void add(Subject subject);
  Subject getSubject(Subject subject);
  int delete(Subject subject);

}
