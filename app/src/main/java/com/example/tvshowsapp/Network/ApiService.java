package com.example.tvshowsapp.Network;

import com.example.tvshowsapp.Responses.TvShowsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("most-popular")
    Call<TvShowsResponse> getMostPopularTvShows(@Query("page") int page);
}
