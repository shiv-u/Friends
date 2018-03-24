package com.androidexample.friends;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * Created by rizvan on 12/13/16.
 */

public class VerticlePagerAdapter extends PagerAdapter {
    public String s1,s2,s3;


    String mResources[]={"Espresso\n\nIt's so simple, and yet so perfect: a tiny, strong cup of pure coffee worshipped by the Italian masses several times daily.\n\nPRICE: 50Rs","Tanzania Coffee\n\nTaste the coffee from Tanzania,Magnificent cup when hot: powerfully but sweetly acidy, resonating with complex chocolate nuance from aroma through finish. The acidity turns rather bitter and the profile simplifies as the cup cools\n\nPRICE:100 Rs.",
            "Cappuccino\n\nA cappuccino is an Italian coffee drink that is traditionally prepared with double espresso, and st" +
                    "eamed milk foam. Variations of the drink involve the use of cream instead of milk, and flavouring with cinnam" +
                    "on or chocolate powder.\n\nPRICE:75 Rs","Cafe Latte\n\nWhat's not to love about a delicious espresso drink that you can help make completely your own? Our, espresso balanced with steamed milk serves as the perfect base for whatever flavors you choose to add.whatever your heart desires—the only thing that matters to us is that it's perfectly made and uniquely you.\n\nPRICE:150 Rs"+
                    "\n"};

    Context mContext;
    LayoutInflater mLayoutInflater;

    public VerticlePagerAdapter(Context context) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.content_main, container, false);
        container.setBackgroundColor(Color.BLACK);

        TextView label = (TextView) itemView.findViewById(R.id.contenttextView);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);

        if (position % 4 == 0) {
             s1=mResources[0];
            SpannableString ss1=  new SpannableString(s1);
            ss1.setSpan(new RelativeSizeSpan(2f), 0,8, 0); // set size
            ss1.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 8, 0);
            ss1.setSpan(new RelativeSizeSpan(1.5f),135,146,0);


            label.setText(ss1);
            imageView.setImageResource(R.drawable.espresso);
        }
        else if(position % 4 == 1){
             s2=mResources[1];
            SpannableString ss1=  new SpannableString(s2);
            ss1.setSpan(new RelativeSizeSpan(2f), 0,15, 0); // set size
            ss1.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 15, 0);
            ss1.setSpan(new RelativeSizeSpan(1.5f),249,261,0);

            label.setText(ss1);
            imageView.setImageResource(R.drawable.tanzaniatwo);
        }
        else if(position % 4 == 2)
        {
            s3=mResources[2];
            SpannableString ss1=  new SpannableString(s3);
            ss1.setSpan(new RelativeSizeSpan(2f), 0,10, 0); // set size
            ss1.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 10, 0);
            ss1.setSpan(new RelativeSizeSpan(1.5f),245,256,0);

            label.setText(ss1);
            imageView.setImageResource(R.drawable.cappuccino);

        }
        else
        {
            String s=mResources[3];
            SpannableString ss1 = new SpannableString(s);
            ss1.setSpan(new RelativeSizeSpan(2f),0,10,0);
            ss1.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 10, 0);
            ss1.setSpan(new RelativeSizeSpan(1.5f),324,336,0);
            label.setText(ss1);
            imageView.setImageResource(R.drawable.cafelatte);

        }

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}