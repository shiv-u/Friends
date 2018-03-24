package com.androidexample.friends;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.facebook.shimmer.ShimmerFrameLayout;

/**
 * Created by shivu on 22-03-2018.
 */

public class getout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getout);
        String passedArg = getIntent().getExtras().getString("arg");
        display(passedArg);

    }
    public void display(String passedArg)
    {


        TextView text = findViewById(R.id.summary);
        text.setText(passedArg);
    }
    public void goodbye(View view)
    {
        Intent intent=new Intent(this,goodbye.class);
        startActivity(intent);

    }

}