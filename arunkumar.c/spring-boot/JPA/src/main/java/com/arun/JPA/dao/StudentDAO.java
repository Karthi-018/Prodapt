package com.arun.JPA.dao;

import com.arun.JPA.model.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAO {
    @Autowired
    EntityManager entityManager;

    @Transactional
    public Student save(Student student){
        entityManager.persist(student);
        return student;
    }

    public Student find(int id){
        Student s = entityManager.find(Student.class,id);
        return s;
    }
    @Transactional
    public Student update(Student student){
        Student s = entityManager.merge(student);
        return s;
    }
    @Transactional
    public void delete(int id){
        entityManager.remove(this.find(id));
    }

    public List<Student> findAll(){
        TypedQuery<Student> typedQuery = entityManager.createQuery("FROM Student",Student.class);
        return  typedQuery.getResultList();
    }
    public List<Student> searchByName(String name){
        TypedQuery<Student> typedQuery = entityManager.createQuery("FROM Student WHERE firstName=:name",Student.class);
        typedQuery.setParameter("name",name);
        return typedQuery.getResultList();
    }
}
