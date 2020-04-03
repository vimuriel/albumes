package com.albumes.albumes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import com.albumes.albumes.models.User;

@Repository
public interface UsersRepository extends JpaRepository<User,String> {
    List<User> findAll();

    Optional<User>findById(String user);
}