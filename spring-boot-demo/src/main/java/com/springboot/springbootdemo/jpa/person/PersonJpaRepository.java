package com.springboot.springbootdemo.jpa.person;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Person> findAll(){
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons",Person.class);
        return namedQuery.getResultList();
    }

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
