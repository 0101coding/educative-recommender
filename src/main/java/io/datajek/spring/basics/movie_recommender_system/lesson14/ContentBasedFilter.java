package io.datajek.spring.basics.movie_recommender_system.lesson14;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// import jakarta.annotation.PostConstruct;
// import jakarta.annotation.PreDestroy;

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
