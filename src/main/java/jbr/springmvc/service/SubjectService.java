package jbr.springmvc.service;

import java.util.Optional;

import jbr.springmvc.model.Subject;

public interface SubjectService {

  Subject add(Subject subject);
  
  Optional<Subject> getSubject(int subjectId);
  
  void deleteSubject(int subjectId);
  
  //List<Subject> find(int durationInHours);

}
