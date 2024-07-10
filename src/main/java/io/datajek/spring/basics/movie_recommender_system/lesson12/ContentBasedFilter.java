package io.datajek.spring.basics.movie_recommender_system.lesson12;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Named
@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // for keeping track of instances created
    private static int instances = 0;
 
    // getRecommendations takes a movie as input and returns a list of similar
    // movies
    public String[] getRecommendations(String movie) {
        // calculate similarity between movies
        // return movie recommendations
        return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
    }
}
