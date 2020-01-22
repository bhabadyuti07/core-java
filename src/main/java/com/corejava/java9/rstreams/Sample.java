package com.corejava.java9.rstreams;




import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.reactivestreams.Publisher;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@DisplayName("")
public class Sample {
	
	public static void main(String[] args) {
		
		Flux<String> justFlux = Flux.just("1", "2", "3");
		Publisher<String> fluxPublisher = Flux.just("1", "2", "3");
		
		Mono<String> justMono = Mono.just("1");
		Publisher<String> monoPublisher = Mono.just("1");
		
	}
	
	@Test
	public void testFluxSubscribe() {
		List<Integer> elements = new ArrayList<Integer>();
		Flux.just(1, 2, 3, 4)
				.log()
				.subscribe(elements::add);
		assertIterableEquals(elements, Arrays.asList(1, 2, 3, 4));
	}

}
