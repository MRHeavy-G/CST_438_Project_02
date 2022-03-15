package com.example.project02.Project02_Team8.repositories;

import com.example.project02.Project02_Team8.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends CrudRepository<User,Integer> {
    @Query(value = "select * from User u where u.username = %:username%",
    countQuery = "select count(*) from User",
    nativeQuery = true)
    User findUserByUsername(
            @Param("username") String username
    );

    @Query(value = "select * from User u where u.id like %:id%",
    countQuery = "select count(*) from User",
    nativeQuery = true)
    User findUserById(
            @Param("id") Integer id
    );

}
