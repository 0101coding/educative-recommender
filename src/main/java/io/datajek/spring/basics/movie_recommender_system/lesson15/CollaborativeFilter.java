package io.datajek.spring.basics.movie_recommender_system.lesson15;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("CF")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
      }
}
