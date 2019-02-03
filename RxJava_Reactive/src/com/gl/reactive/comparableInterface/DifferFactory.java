package com.gl.reactive.comparableInterface;

import io.reactivex.Observable;
 
public class DifferFactory {

	private static int a = 0 , b = 5;
	public static void main(String[] args) {
		
		  
			Observable<Integer> obser= Observable.defer(() ->Observable.range(a, b));
			obser.subscribe(System.out::println);	
			
			b=10;
		//	Observable did't catch state change so for this we use differ factory
			
			obser.subscribe(e -> System.out.print("   "+e));	
			
	}
	
	
}
