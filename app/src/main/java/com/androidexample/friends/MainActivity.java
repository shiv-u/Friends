package com.androidexample.friends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;

import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShimmerFrameLayout container=findViewById(R.id.shimmer_view_container);
        container.startShimmerAnimation();
    }
    public void order(View view)
    {
        Intent intent= new Intent(this,Order.class);
        startActivity(intent);
    }
}
