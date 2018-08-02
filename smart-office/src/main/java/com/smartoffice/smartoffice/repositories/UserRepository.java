package com.smartoffice.smartoffice.repositories;

import com.smartoffice.smartoffice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User ,Long> {
}
