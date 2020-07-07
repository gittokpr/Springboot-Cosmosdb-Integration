package com.springboot.azure.cosmosdbConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CosmosController {
	
	private UserRepository userRepository;

	@Autowired
	public CosmosController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping("/users")
	public Flux<User> getUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public Mono<User> getUsers(@PathVariable("id") String id){
		return userRepository.findById(id);
	}
	
	@PostMapping("/user/save")
	public Mono<User> saveUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@DeleteMapping("/user/{lastName}")
	public Mono<Void> deleteUser(@PathVariable("lastName") String lastName) {
		return userRepository.deleteByLastName(lastName);
	}
}
