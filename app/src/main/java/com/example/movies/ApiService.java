package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("v1.4/movie?token=C7K0XW4-P7Q4RW0-MB0D3M3-5Z3V53E&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("v1.4/movie/{idFilms}?token=C7K0XW4-P7Q4RW0-MB0D3M3-5Z3V53E")
    Single<TrailerResponse> loadTrailers(@Path("idFilms") int id);

    @GET("v1/review?token=C7K0XW4-P7Q4RW0-MB0D3M3-5Z3V53E&field=movieId")
    Single<ReviewResponse> loadReviews(@Query("search") int id);
}


