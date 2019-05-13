package jbr.springmvc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jbr.springmvc.model.Subject;
import jbr.springmvc.repo.SubjectRepository;

@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {


  @Autowired
  SubjectRepository subjectRepository;

  public void setSubjectRepository(SubjectRepository subjectRepository) {
    this.subjectRepository = subjectRepository;
  }

  @Transactional
  public Subject add(Subject subject) {
    return subjectRepository.save(subject);
  }

  @Transactional
  public Optional<Subject> getSubject(int subjectId) {
    return subjectRepository.findById(subjectId);
  }

  @Transactional
  public void deleteSubject(int subjectId) {
    subjectRepository.deleteById(subjectId);
  }

  /*public List<Subject> find(int durationInHours) {
    return subjectRepository.find(durationInHours);
  }*/


}
