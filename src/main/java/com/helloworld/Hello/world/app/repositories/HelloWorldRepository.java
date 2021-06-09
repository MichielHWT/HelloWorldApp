package com.helloworld.Hello.world.app.repositories;

import com.helloworld.Hello.world.app.model.HelloWorld;
import org.springframework.data.repository.CrudRepository;

public interface HelloWorldRepository extends CrudRepository<HelloWorld, Long> {
}
