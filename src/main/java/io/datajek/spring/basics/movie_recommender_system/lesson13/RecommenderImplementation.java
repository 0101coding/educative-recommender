package io.datajek.spring.basics.movie_recommender_system.lesson13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class RecommenderImplementation {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    // use filter interface to select filter
    @Inject
    @Qualifier("CF")
    private Filter filter;

    public Filter getFilter() {
		return filter;
	}

    public String[] recommendMovies(String movie) {
        // print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
