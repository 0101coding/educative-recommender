package io.datajek.spring.basics.movie_recommender_system.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import io.datajek.spring.basics.movie_recommender_system.lesson7.CollaborativeFilter;


@Component
public class RecommenderImplementation {
    // use filter interface to select filter
    private Filter filter;

    //constructor injection
	@Autowired
	public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
		super();
		this.filter = filter;
		System.out.println("Constructor invoked...");
	}

    public String[] recommendMovies(String movie) {
        // print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
