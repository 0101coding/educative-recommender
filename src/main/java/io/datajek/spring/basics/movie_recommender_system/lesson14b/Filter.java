package io.datajek.spring.basics.movie_recommender_system.lesson14b;

public interface Filter {
    public String[] getRecommendations(String movie);
}

