package com.springboot.springbootdemo.jpa.person;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Person findByID(int id){
        return entityManager.find(Person.class,id);
    }

    public Person insert(Person person){
        return entityManager.merge(person);
    }

    public void deleteByID(int id){
        Person person = findByID(id);
        entityManager.remove(person);
    }
}
