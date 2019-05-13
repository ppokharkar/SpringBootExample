package jbr.springmvc.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jbr.springmvc.model.Book;
import jbr.springmvc.model.Subject;
import jbr.springmvc.repo.SubjectRepository;
import junit.framework.Assert;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SubjectServiceTest {
  @InjectMocks
   private SubjectServiceImpl subjectService;
  
  @Mock
  SubjectRepository subRepo;
  
  @Before
  public void init() {
      MockitoAnnotations.initMocks(this);
  }
   
   @SuppressWarnings("deprecation")

   @Test
   public void whenBookIdIsProvided_thenRetrievedBook() throws ParseException {
     Mockito.mock(SubjectServiceImpl.class);
     Subject sub = new Subject();
     sub.setSubjectId(1);
     sub.setSubtitle("java");
     sub.setDurationInHours(12);
     Optional<Subject> subOptional = Optional.of(sub);
     
      Mockito.when(subjectService.getSubject(1)).thenReturn(subOptional);
      Assert.assertEquals("java", subOptional.get().getSubtitle());
      Assert.assertEquals(12, subOptional.get().getDurationInHours());
   }
   
   @Test
   public void whenBookInsanceIsProvided_thenSaveBook() throws ParseException {
     Mockito.mock(SubjectServiceImpl.class);
     Subject sub = new Subject();
     sub.setSubjectId(1);
     sub.setSubtitle("java");
     sub.setDurationInHours(12);
     
      Mockito.when(subjectService.add(sub)).thenReturn(sub);
      Assert.assertEquals("java", sub.getSubtitle());
      Assert.assertEquals(12, sub.getDurationInHours());
   }
   
}
