package com.example.tvshowsapp.Reponsitories;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.tvshowsapp.Network.ApiClient;
import com.example.tvshowsapp.Network.ApiService;
import com.example.tvshowsapp.Responses.TvShowsResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MostPopularTvShowsRepository {
    private ApiService apiService;
    public MostPopularTvShowsRepository() {
        apiService = ApiClient.getRetrofit().create(ApiService.class);
    }

    public LiveData<TvShowsResponse> getMostPopularTvShows(int page){
        MutableLiveData<TvShowsResponse> data = new MutableLiveData<>();
        apiService.getMostPopularTvShows(page).enqueue(new Callback<TvShowsResponse>() {
            @Override
            public void onResponse(@NonNull Call<TvShowsResponse> call,@NonNull Response<TvShowsResponse> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<TvShowsResponse> call,@NonNull Throwable throwable) {
                data.setValue(null);
            }
        });
        return data;
    }
}
