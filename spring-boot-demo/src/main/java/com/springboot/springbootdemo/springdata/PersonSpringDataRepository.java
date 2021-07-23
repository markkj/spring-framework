package com.springboot.springbootdemo.springdata;

import com.springboot.springbootdemo.jpa.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person,Integer> {
}
