package io.datajek.spring.basics.movie_recommender_system.lesson6;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {

		// ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		// use ApplicationContext to find which filter is being used
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));
	}

}
