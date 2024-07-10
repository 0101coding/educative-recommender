package io.datajek.spring.basics.movie_recommender_system.lesson14b;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory; 
import org.springframework.stereotype.Component; 


@Component
public class ContentBasedFilter implements Filter { 
 
    
    public String[] getRecommendations(String movie) {
        // calculate similarity between movies
        // return movie recommendations
        return new String[] { "Happy Feet", "Ice Age", "Shark Tale" };
    }
}
