package com.springboot.springbootdemo.jdbc.person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    class PersonRowMapper implements RowMapper<Person>{

        @Override
        public Person mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(resultSet.getInt("id"));
            person.setName(resultSet.getString("name"));
            person.setLocation(resultSet.getString("location"));
            person.setBirthDate(resultSet.getTimestamp("birth_date"));
            return person;
        }
    }

    public List<Person> findAll() {
//        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
        return jdbcTemplate.query("select * from person", new PersonRowMapper());
    }

    public Person findByID(int id) {
        return jdbcTemplate.queryForObject(
                "select * from person where id = ?",
                new Object[]{id},
                new BeanPropertyRowMapper<Person>(Person.class));
    }

    public int deleteByID(int id) {
        return jdbcTemplate.update(
                "delete from person where id=?",
                new Object[]{id});
    }

    public int insert(Person person) {
        return jdbcTemplate.update(
                "INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) VALUES(?, ?, ?,?)",
                person.getId(), person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()));
    }

    public int update( Person person) {
        return jdbcTemplate.update(
                "UPDATE PERSON  SET NAME=?, LOCATION=?, BIRTH_DATE=? WHERE ID = ?",
                person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()), person.getId());
    }

}
