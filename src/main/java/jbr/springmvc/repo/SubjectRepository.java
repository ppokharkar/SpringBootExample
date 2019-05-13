package jbr.springmvc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import jbr.springmvc.model.Subject;

public interface SubjectRepository extends CrudRepository<Subject,Integer> { 
  /*@Query("SELECT b FROM Subject b WHERE LOWER(b.durationInHours) = LOWER(:durationInHours)")
  public List<Subject> find(@Param("durationInHours") int durationInHours);
  */
}