package io.datajek.spring.basics.movie_recommender_system.lesson16;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class ContentBasedFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // for keeping track of instances created
    private static int instances = 0;

    @Autowired
    private Movie movie;

    public ContentBasedFilter() {
        super();
        logger.info("In ContentBasedFilter constructor method");
    }

    public Movie getMovie() {
        return movie;
    }

    public static int getInstances() {
        return ContentBasedFilter.instances;
    }

    @PostConstruct
    private void postConstruct() {
        // load movies into cache
        logger.info("In ContentBasedFilter postConstruct method");
    }

    @PreDestroy
    private void preDestroy() {
        // clear movies from cache
        logger.info("In ContentBasedFilter preDestroy method");
    }

    // getRecommendations takes a movie as input and returns a list of similar
    // movies
    public String[] getRecommendations(String movie) {
        // calculate similarity between movies
        // return movie recommendations
        return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
    }
}
