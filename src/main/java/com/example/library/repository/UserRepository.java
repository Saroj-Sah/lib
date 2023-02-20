package com.example.library.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.library.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query
	(value = "SELECT * FROM user WHERE first_name LIKE ?1%", nativeQuery = true)
	public List<User> searchByLetter(String letter);

	public User findByUserId(Long issuedToId);

}
