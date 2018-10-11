package com.example.aceahmer.taskfour;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;
import java.util.zip.Inflater;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolder>{

    private List<ModelClass> values;
    protected TextView moviename,year;
    protected ImageView imageView;
    public View CardLayout;
    protected RelativeLayout rl;
    Context context;




    public AdapterClass(Context context,List<ModelClass> values) {
        this.values = values;
        this.context=context;

    }
    @NonNull
    @Override
    public AdapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator= LayoutInflater.from(context);
        View view=inflator.inflate(R.layout.customlayout,parent,false);
        AdapterClass.ViewHolder customview=new AdapterClass.ViewHolder(view);
        return customview;
    }
    ModelClass mc;
    @Override
    public void onBindViewHolder(@NonNull AdapterClass.ViewHolder holder, final int position) {
        mc=values.get(position);
        moviename.setText(mc.getMovieName());
        year.setText(mc.getYear());
        imageView.setImageDrawable(context.getDrawable(mc.getId()));

        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mc=values.get(position);
                Intent in=new Intent(context,details.class);
                in.putExtra("Data",mc);
                context.startActivity(in);
            }
        });

    }

    @Override
    public int getItemCount() {
        return values.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{


        public ViewHolder(View itemView) {
            super(itemView);

            CardLayout=itemView;
            moviename=(TextView)itemView.findViewById(R.id.moviename_txt);
            year=(TextView)itemView.findViewById(R.id.year_txt);
            imageView=(ImageView)itemView.findViewById(R.id.movie_image);
            rl=(RelativeLayout)itemView.findViewById(R.id.wholeview);
        }
    }
}
