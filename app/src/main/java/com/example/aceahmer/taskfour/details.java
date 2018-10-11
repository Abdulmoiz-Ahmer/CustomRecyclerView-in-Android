package com.example.aceahmer.taskfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class details extends AppCompatActivity {
    ModelClass mc;
    TextView moviename_txt,year_txt,review_txt;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initializeViews();
        extractData();
        setViewData();

    }
    public void initializeViews(){
        moviename_txt=(TextView)findViewById(R.id.moviename_txt);
        year_txt=(TextView)findViewById(R.id.year_txt);
        review_txt=(TextView)findViewById(R.id.review_txt);
        img=(ImageView)findViewById(R.id.movie_image);
    }
    public void extractData(){
        Intent in=getIntent();
        mc=in.getParcelableExtra("Data");
    }
    public void setViewData(){
    moviename_txt.setText(getResources().getString(R.string.movie_name)+" "+mc.getMovieName());
    year_txt.setText(getResources().getString(R.string.year)+" "+mc.getYear());
    review_txt.setText(getResources().getString(R.string.review)+" "+mc.getReview());
    img.setImageDrawable(getDrawable(mc.getId()));




    }



}
