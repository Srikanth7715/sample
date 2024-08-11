package com.sample;

import javax.management.RuntimeErrorException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootTest
class SampleApplicationTests {

	@Test
	void contextLoads() {
//		Mono<?> sampleMono = Mono.just("srikanth").then(Mono.error(new RuntimeException("error occured"))).log();
//		sampleMono.subscribe((v)-> System.out.println(v), (e)-> System.out.println(e.getMessage()));
	}
	
	@Test
	void contextLoads1() {
//		Flux<?> sampleMono = Flux.just("srikanth", "eligeti").concatWith(Flux.error(new RuntimeException())).log();
//		sampleMono.subscribe((v)-> System.out.println(v), (e)-> System.out.println(e.getMessage()));
	}

}
