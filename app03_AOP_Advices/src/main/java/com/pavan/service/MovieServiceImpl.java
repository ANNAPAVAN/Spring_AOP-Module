package com.pavan.service;

import com.pavan.beans.Movie;

public class MovieServiceImpl implements MovieService {

	public void playMovie(Movie movie) throws Exception {
		System.out.println("Movie Details");
		System.out.println("--------------");
		System.out.println("Movie Name     : "+movie.getMovie_name());
		System.out.println("Movie ShowTime : "+movie.getShow_time());
		System.out.println("Movie Price    : "+movie.getPrice());
		throw new RuntimeException("Power Failure");
		

	}

}
