package com.example.tvshowsapp.Activities;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.example.tvshowsapp.R;
import com.example.tvshowsapp.ViewModels.MostPopularTvShowsViewModel;

public class MainActivity extends AppCompatActivity {
    private MostPopularTvShowsViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MostPopularTvShowsViewModel.class);
        getMostPopularTvShows();
    }

    private void getMostPopularTvShows() {
        viewModel.getMostPopularTvShows(0).observe(this, mostPopularTvShowsResponse ->
                Toast.makeText(getApplicationContext(), "Total page: " + mostPopularTvShowsResponse.getTotalPages(), Toast.LENGTH_SHORT).show()
        );
    }
}