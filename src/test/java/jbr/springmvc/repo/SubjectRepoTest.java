package jbr.springmvc.repo;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import jbr.springmvc.model.Subject;
import jbr.springmvc.service.SubjectServiceImpl;

public class SubjectRepoTest {
  
  
  private SubjectServiceImpl subjectServiceMock;

  private SubjectRepository subjectRepositoryMock;

  @Before
  public void setUp() {
    subjectServiceMock = new SubjectServiceImpl();

    subjectRepositoryMock = mock(SubjectRepository.class);
    subjectServiceMock.setSubjectRepository(subjectRepositoryMock);
  }
  
  @Test
  public void create() throws ParseException {
    
    Subject sub = new Subject();
    sub.setSubjectId(1);
    sub.setSubtitle("java");
    sub.setDurationInHours(12);
    
    when(subjectRepositoryMock.save(any(Subject.class))).thenReturn(sub);
    
    Subject returned = subjectServiceMock.add(sub);
    verify(subjectRepositoryMock, times(1)).save(sub);

    assertEquals(sub, returned);

    
  }

  
  @Test
  public void delete() throws ParseException {
    Subject sub = new Subject();
    sub.setSubjectId(1);
    sub.setSubtitle("java");
    sub.setDurationInHours(12);
    
    
    subjectServiceMock.deleteSubject(sub.getSubjectId());
    
    verify(subjectRepositoryMock, times(1)).deleteById(sub.getSubjectId());
    
    
  }
  
  @Test
  public void findById() throws ParseException {
    
    Subject sub = new Subject();
    sub.setSubjectId(1);
    sub.setSubtitle("Java");
    sub.setDurationInHours(12);
    Optional<Subject> subOptional = Optional.of(sub);

    
      when(subjectRepositoryMock.findById(1)).thenReturn(subOptional);
      
      Optional<Subject> returned = subjectServiceMock.getSubject(1);
      
      verify(subjectRepositoryMock, times(1)).findById(1);
      verifyNoMoreInteractions(subjectRepositoryMock);
      
      assertEquals(subOptional, returned);
  }
  
  

}
