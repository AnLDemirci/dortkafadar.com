package com.acmsk.dortkafadar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acmsk.dortkafadar.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
