package io.datajek.spring.basics.movie_recommender_system.lesson15;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class MovieRecommenderSystemApplication {
	public static void main(String[] args) {

		// ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		// use ApplicationContext to find which filter is being used
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		String favoriteMovie = recommender.getFavoriteMovie();
		System.out.println(favoriteMovie);

		// call method to get recommendations
		String[] result = recommender.recommendMovies(favoriteMovie);

		// display results
		System.out.println(Arrays.toString(result));
	}

}
