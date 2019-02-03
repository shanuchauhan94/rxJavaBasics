package com.gl.reactive.comparableInterface;

import com.gl.reactive.comparableInterface.model.Student;

import io.reactivex.Observable;

public class ComparableInterfaceConcepts {

	public static void main(String[] args) {
/*		
		Observable<String> source =Observable.create(emitter ->
		{
			
			emitter.onNext("Hello Moto1");
			emitter.onNext("Hello Moto2");
			emitter.onNext("Hello Moto3");
			emitter.onComplete();
		});
		
		source.subscribe(System.out::println);
	}*/
// second alternative way 
	
	Observable<Student> obser= Observable.create(emitter ->{
		 emitter.onNext(new Student(121,"shanu1")); 
		 emitter.onNext(new Student(122,"shanu2")); 
		 
		 emitter.onComplete();
	  });
	
	 obser.subscribe(s -> System.out.println(s.getId()+"  "+s.getName()));
	
	
	}
	
}
