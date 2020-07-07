package com.springboot.azure.cosmosdbConnection;

import org.springframework.stereotype.Repository;

import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveCosmosRepository<User, String> {
	Flux<User> findByFirstName(String firstName);
	Mono<Void> deleteByLastName(String lastName);
}
