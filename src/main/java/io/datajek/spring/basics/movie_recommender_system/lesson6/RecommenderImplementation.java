package io.datajek.spring.basics.movie_recommender_system.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    // use filter interface to select filter
    @Autowired
    @Qualifier("CBF")
    private Filter contentBasedFilter;

   

    public String[] recommendMovies(String movie) {
        // print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + contentBasedFilter + "\n");
        String[] results = contentBasedFilter.getRecommendations("Finding Dory");
        return results;
    }
}