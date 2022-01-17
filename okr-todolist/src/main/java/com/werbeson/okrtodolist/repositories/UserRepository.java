package com.werbeson.okrtodolist.repositories;

import com.werbeson.okrtodolist.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
