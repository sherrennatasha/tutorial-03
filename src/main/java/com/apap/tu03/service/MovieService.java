package com.apap.tu03.service;
import java.util.List;
import com.apap.tu03.model.MovieModel;

public interface MovieService {
	void addMovie(MovieModel movie);
	void updMovie(String id, Integer newDuration);
	void delMovie(MovieModel movie);

	List<MovieModel> getMovieList();
	
	MovieModel getMovieDetail(String id);
}
