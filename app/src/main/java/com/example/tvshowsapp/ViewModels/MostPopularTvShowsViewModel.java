package com.example.tvshowsapp.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.tvshowsapp.Reponsitories.MostPopularTvShowsRepository;
import com.example.tvshowsapp.Responses.TvShowsResponse;

public class MostPopularTvShowsViewModel extends ViewModel {
    private MostPopularTvShowsRepository mostPopularTvShowsRepository;
    public MostPopularTvShowsViewModel(){
        mostPopularTvShowsRepository = new MostPopularTvShowsRepository();
    }
    public LiveData<TvShowsResponse> getMostPopularTvShows(int page){
        return mostPopularTvShowsRepository.getMostPopularTvShows(page);
    }
}
