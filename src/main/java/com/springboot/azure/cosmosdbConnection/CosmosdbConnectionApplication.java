package com.springboot.azure.cosmosdbConnection;

import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class CosmosdbConnectionApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(CosmosdbConnectionApplication.class);

	@Autowired
	private UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CosmosdbConnectionApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception { final User
	 * testUser = new User("2", "Gitto", "Tomy", "45 California, NY 98042");
	 * 
	 * LOGGER.info("Saving user: {}", testUser);
	 * 
	 * // Save the User class to Azure CosmosDB database. final Mono<User>
	 * saveUserMono = repository.save(testUser);
	 * 
	 * final Flux<User> firstNameUserFlux =
	 * repository.findByFirstName("testFirstName");
	 * 
	 * // Nothing happens until we subscribe to these Monos. // findById will not
	 * return the user as user is not present. final Mono<User> findByIdMono =
	 * repository.findById(testUser.getId()); final User findByIdUser =
	 * findByIdMono.block(); // LOGGER.info("user by id", findByIdUser.toString());
	 * Assert.isNull(findByIdUser, "User must be null");
	 * 
	 * final User savedUser = saveUserMono.block(); LOGGER.info("user by savedUser",
	 * savedUser.toString()); Assert.state(savedUser != null,
	 * "Saved user must not be null");
	 * Assert.state(savedUser.getFirstName().equals(testUser.getFirstName()),
	 * "Saved user first name doesn't match");
	 * 
	 * LOGGER.info("Saved user");
	 * 
	 * firstNameUserFlux.collectList().block();
	 * 
	 * final Optional<User> optionalUserResult =
	 * repository.findById(testUser.getId()).blockOptional();
	 * Assert.isTrue(optionalUserResult.isPresent(), "Cannot find user.");
	 * 
	 * final User result = optionalUserResult.get();
	 * Assert.state(result.getFirstName().equals(testUser.getFirstName()),
	 * "query result firstName doesn't match!");
	 * Assert.state(result.getLastName().equals(testUser.getLastName()),
	 * "query result lastName doesn't match!");
	 * 
	 * LOGGER.info("Found user by findById : {}", result);
	 * 
	 * }
	 */

}
