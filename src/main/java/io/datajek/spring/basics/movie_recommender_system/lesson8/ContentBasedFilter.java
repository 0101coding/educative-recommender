package io.datajek.spring.basics.movie_recommender_system.lesson8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
  public ContentBasedFilter() {
		super();
		System.out.println("content-based filter constructor called");	
	}

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
      }
}
