package com.pavan.test;
import com.pavan.beans.*;
import com.pavan.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
		Movie movie = (Movie)context.getBean("movieBean");
		
		MovieService movieService = (MovieService)context.getBean("proxy");
		try {
			movieService.playMovie(movie);
		}catch(Exception e) {
		}
		
/*		OUTPUT
 
		Movie Details
		--------------
		Movie Name     : Mirchi
		Movie ShowTime : 6pm
		Movie Price    : 450
		**********************************
		Power Failure ( Money Stopped ) --> Collect Your Money
		**********************************
*/
	}

}
