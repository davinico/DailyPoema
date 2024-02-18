package com.projetoEmail.ProjetoEmail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoEmail.ProjetoEmail.Dto.UserDTO;
import com.projetoEmail.ProjetoEmail.model.User;
import com.projetoEmail.ProjetoEmail.repository.UserRepository;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class UserService {

	@Autowired
    private UserRepository userRepository;

	@Transactional(value = TxType.REQUIRED, rollbackOn = Exception.class)
    public UserDTO createUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        User savedUser = this.userRepository.save(user);

        userDTO.setId(savedUser.getId());

        return userDTO;
    }
	
	public List<User> retornaDados() {
		return userRepository.findAll();
	}
}
