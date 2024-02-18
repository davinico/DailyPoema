package com.projetoEmail.ProjetoEmail.controller;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projetoEmail.ProjetoEmail.Dto.UserDTO;
import com.projetoEmail.ProjetoEmail.model.User;
import com.projetoEmail.ProjetoEmail.service.UserService;

@RestController
@RequestMapping(value ="/user", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class UserController {
	
	@Autowired
    private UserService userService;
	
	@PostMapping
	@ResponseBody
	@RequestMapping(value="/cadastrate-user")
	public ResponseEntity<UserDTO> criaUser(@RequestBody UserDTO userDTO) {
		UserDTO user = this.userService.createUser(userDTO);

        return new ResponseEntity<>(user, HttpStatus.CREATED);
	}
	
	@GetMapping
	@RequestMapping(value="/retorna-dados")
	public List<User> retornaDados() {
		return userService.retornaDados();
	}
	
	
}
