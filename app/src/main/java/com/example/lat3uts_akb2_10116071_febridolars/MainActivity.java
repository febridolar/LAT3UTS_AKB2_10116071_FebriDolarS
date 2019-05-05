package com.example.lat3uts_akb2_10116071_febridolars;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewPager mslidePager;
    private LinearLayout mdotLayout;
    private TextView[] mDots;
    private slider slideAdapter;
    private Button mbackBtn;
    private Button mnextBtn;
    private Button mfinishBtn;

    private int mCurrentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mslidePager = (ViewPager) findViewById(R.id.viewpager);
        mdotLayout = (LinearLayout) findViewById(R.id.dotLayout);
        mfinishBtn = (Button) findViewById(R.id.finishBtn);
        slideAdapter = new slider(this);
        mslidePager.setAdapter(slideAdapter);

        /*
        addDots(0);

        mslidePager.addOnPageChangeListener(viewListener);

        mnextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mslidePager.setCurrentItem(mCurrentPage + 1);
            }
        });

        mbackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mslidePager.setCurrentItem(mCurrentPage - 1);
            }
        });
        */
        mfinishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }
        });
    }
}
/*
    public void addDots(int position){

        mDots= new TextView[3];

        for(int i = 0; 1 < mDots.length; i++){

            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextColor(getResources().getColor(R.color.barbar));

            mdotLayout.addView(mDots[i]);

        }

        if(mDots.length > 0){

            mDots[position].setTextColor(getResources().getColor(R.color.colorPrimary));
        }

    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            addDots(i);
            mCurrentPage = i;

            if(i == 0){
                mnextBtn.setEnabled(true);
                mbackBtn.setEnabled(false);
                mfinishBtn.setVisibility(View.INVISIBLE);
                mbackBtn.setVisibility(View.INVISIBLE);

            }else if (i == mDots.length - 1){

                mnextBtn.setEnabled(false);
                mbackBtn.setEnabled(true);
                mbackBtn.setVisibility(View.VISIBLE);
                mnextBtn.setVisibility(View.INVISIBLE);
                mfinishBtn.setVisibility(View.VISIBLE);

            }else{

                mnextBtn.setEnabled(true);
                mbackBtn.setEnabled(true);
                mbackBtn.setVisibility(View.VISIBLE);
                mnextBtn.setVisibility(View.VISIBLE);
                mfinishBtn.setVisibility(View.INVISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
*/
