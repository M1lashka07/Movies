package com.example.movies;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class FavouriteViewModel extends AndroidViewModel {

    private final MovieDao movieDao;

    public FavouriteViewModel(@NonNull Application application) {
        super(application);
        movieDao = MovieDataBase.getInstance(getApplication()).movieDao();
    }

    public LiveData<List<Movie>> getMovies() {
        return movieDao.getAllFavouriteMovies();
    }
}
