package io.datajek.spring.basics.movie_recommender_system.lesson5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
      }
}
