package com.mahiltletdan.hw1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by Mahilet  on 4/22/17.
 */


public class RecyclerViewAdapter extends RecyclerView.Adapter
        <RecyclerViewAdapter.ViewHolder>{

    String[][] Movie;
    Context context;
    View view1;
    ViewHolder viewHolder1;
    TextView textView;

    public RecyclerViewAdapter(Context context1, String[][] myMovies){

        Movie= myMovies ;
        context = context1;

    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView, textView2;
        public ViewHolder(View v){
            super(v);
            textView = (TextView)v.findViewById(R.id.subject_textview1);
            textView2 = (TextView)v.findViewById(R.id.subject_textview2);
        }
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){



//        view1 = LayoutInflater.from(context).inflate(R.layout.activity_recycler_view, parent, false);
        view1 = LayoutInflater.from(context).inflate(R.layout.activity_recycler_view, parent, false);

        viewHolder1 = new ViewHolder(view1);

        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){

        holder.textView.setText(Movie[position][0]);
        holder.textView2.setText(Movie[position][1]);
    }

    @Override
    public int getItemCount(){

        return Movie.length;
    }


}
