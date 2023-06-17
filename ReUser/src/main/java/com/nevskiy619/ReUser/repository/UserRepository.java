package com.nevskiy619.ReUser.repository;

import com.nevskiy619.ReUser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
