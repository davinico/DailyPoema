package com.projetoEmail.ProjetoEmail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoEmail.ProjetoEmail.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
