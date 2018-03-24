package com.androidexample.friends;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.shimmer.ShimmerFrameLayout;

/**
 * Created by shivu on 22-03-2018.
 */

public class goodbye extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goodbye);
        ShimmerFrameLayout container=findViewById(R.id.shimmer_view_container);
        container.startShimmerAnimation();
    }
}
