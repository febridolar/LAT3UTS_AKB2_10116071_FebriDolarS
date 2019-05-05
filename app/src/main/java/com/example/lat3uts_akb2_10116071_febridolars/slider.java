package com.example.lat3uts_akb2_10116071_febridolars;


import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class slider extends PagerAdapter
{

    Context context;
    LayoutInflater inflater;

    public int [] slide_image = {
            R.drawable.walkthrough_1,
            R.drawable.walkthrough_2,
            R.drawable.walkthrough_3
    };

    public String [] titleArray = {
            "WELCOME",
            "ALMOST THERE",
            "GET STARTED"
    };

    public String [] description = {
            "Selamat datang di aplikasi MySelf App :), Isi dari aplikasi ini adalah hal yang berhubungan dengan pembuat",
            "Ada beberapa menu yang bisa dilihat dalam aplikasi seperti Daily Activity, Gallery, Music & Video Favorite, dan Profile",
            "Klik Finish untuk memulai..."
    };

    public slider(Context context)
    {
        this.context = context;
    }


    @Override
    public int getCount() {
        return titleArray.length;
    }

    @Override
    public boolean isViewFromObject( View view,  Object object) {
        return view == (ConstraintLayout) object;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container, false);

        ImageView sImageView = (ImageView) view.findViewById(R.id.s_image);
        TextView sHeading = (TextView) view.findViewById(R.id.s_heading);
        TextView sDesc = (TextView) view.findViewById(R.id.s_desc);

        sImageView.setImageResource(slide_image[position]);
        sHeading.setText(titleArray[position]);
        sDesc.setText(description[position]);

        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position,  Object object) {
        container.removeView((ConstraintLayout)object);
    }
}

