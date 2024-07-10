package io.datajek.spring.basics.movie_recommender_system.lesson14;

import org.springframework.beans.factory.annotation.Qualifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

public class RecommenderImplementation {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Filter filter;

    // public Filter getFilter() {
    //     return filter;
    // }

    // public void setFilter(Filter filter) {
    //     this.filter = filter;
    // }
    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
      }

    public String[] recommendMovies(String movie) {
        // print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
