package com.arquitecturajava;

import java.util.Optional;
import java.util.stream.Stream;

public class Principal14 {

	public static void main(String[] args) {
		
	
	
		Stream<Integer> mistream=Stream.iterate(0,i->i+1);
	
		Optional<Integer> optional=mistream.limit(3).reduce(Integer::sum);
		
		if(optional.isPresent()) {
			
			System.out.println(optional.get());
		}
	}

}
