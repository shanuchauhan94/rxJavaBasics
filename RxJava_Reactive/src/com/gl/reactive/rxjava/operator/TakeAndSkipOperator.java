package com.gl.reactive.rxjava.operator;

import io.reactivex.Observable;

public class TakeAndSkipOperator {

	public static void main(String[] args) {
		Observable<String> obser = Observable.just("item1","item2","item3","item4");
		//obser.take(2)
		 //obser.first("")
		 obser.skip(3)
		.subscribe(System.out::println);
		 
		 System.out.println("   ");
		 
		 // takeWhile ...............skipWhile 
	Observable<String> obser2 = Observable.just("item1","item3","item23","item34");
	//obser2.takeWhile(e -> e.length() > 4)
	obser2.skipWhile(e -> e.length() < 6)  // compare 1st element and skip it only 
	.subscribe(System.out::println, Throwable::getMessage, () -> System.out.println("Process Completed."));
	
	System.out.println("   ");
	 // distinct and elementAt ...............skipWhile 
	Observable<String> obser3 = Observable.just("item1","item1","item23","item34");
	obser3.distinct()
	.subscribe(System.out::println, Throwable::getMessage, () -> System.out.println("Process Completed."));
	}
}

