package io.datajek.spring.basics.movie_recommender_system.lesson14;


import java.util.Arrays;
 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
 
		//retrieve bean from the application context
RecommenderImplementation recommender = appContext.getBean("recommenderImplementation", RecommenderImplementation.class);
		
	
		String[] result = recommender.recommendMovies("Finding Dory");
		
		//display results
		System.out.println();
		System.out.println(Arrays.toString(result));
		
		appContext.close();
	 }

}
