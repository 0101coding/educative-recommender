package io.datajek.spring.basics.movie_recommender_system.lesson13;


import java.util.Arrays;
 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration; 

@ComponentScan
@Configuration
public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {
		//ApplicationContext manages the beans and dependencies
		// ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		
		//to this:
AnnotationConfigApplicationContext appContext = 
  new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);
		//use ApplicationContext to find which filter is being used
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);	
		
		System.out.println(recommender);
		System.out.println(recommender.getFilter());
		
		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");
		
		//display results
		System.out.println(Arrays.toString(result));
	 }

}
