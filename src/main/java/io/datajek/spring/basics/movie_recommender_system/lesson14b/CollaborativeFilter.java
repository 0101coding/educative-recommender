package io.datajek.spring.basics.movie_recommender_system.lesson14b;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
 
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
      }
}
