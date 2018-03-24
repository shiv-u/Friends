package com.androidexample.friends;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

/**
 * Created by shivu on 22-03-2018.
 */

public class topping extends AppCompatActivity {
    String s1 = "Coffee:", passedArg;
    boolean isWhip,isice,isnut,ischoco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topping);
        passedArg = getIntent().getExtras().getString("arg");
        s1 = s1 + passedArg + "\nToppings:\n";
        Log.v("Topping", passedArg);

}

public void sum(View view)
{
    String w="",n="",i="",c="";
    CheckBox whipb=findViewById(R.id.whipped);
    isWhip=whipb.isChecked();
    CheckBox iceb=findViewById(R.id.icecream);
    isice=iceb.isChecked();
    CheckBox nutb=findViewById(R.id.nutmeg);
    isnut=nutb.isChecked();
    CheckBox chocob=findViewById(R.id.chocolate);
    ischoco=chocob.isChecked();
    if(isWhip)
        w="Whipped Cream\n";
    if(isice)
        i="Ice Cream\n";
    if(isnut)
        n="NutMeg\n";
    if(ischoco)
        c="Chocolate\n";
    s1 += w + n + i + c;
    Intent intent =new Intent(this,getout.class);
    intent.putExtra("arg",s1);
    startActivity(intent);
}
    }
