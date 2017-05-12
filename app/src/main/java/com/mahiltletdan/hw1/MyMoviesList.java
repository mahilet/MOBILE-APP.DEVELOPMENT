package com.mahiltletdan.hw1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyMoviesList extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;

    String[][] movies = {
            {"Mad Max: Fury Road", "Action & Adventure"},
            {"Inside Out", "Animation, Kids & Family"},
            {"Star Wars: Episode VII - The Force Awakens", "Action"},
            {"Shaun the Sheep", "Animation", "2015"},
            {"The Martian", "Science Fiction & Fantasy"},
            {"Mission: Impossible Rogue Nation", "Action"},
            {"Up", "Animation", "Star Trek"},
            {"Science Fiction", "The LEGO Movie"},
            {"Animation", "Iron Man", "Action & Adventure", },
            {"Aliens", "Science Fiction"},
            {"Chicken Run", "Animation"},
            {"Back to the Future", "Science Fiction"},
            {"Raiders of the Lost Ark", "Action & Adventure"},
            {"Goldfinger", "Action & Adventure"},
            {"Guardians of the Galaxy", "Science Fiction & Fantasy"},
            {"Mad Max: Fury Road", "Action & Adventure"},
           {"Inside Out", "Animation, Kids & Family"},


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my_movies_list);

        Toolbar toolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        recylerViewLayoutManager = new LinearLayoutManager(context);

        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerViewAdapter = new CustomAdapter();
        recyclerView.setAdapter(recyclerViewAdapter);

    }

    public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

        public class ViewHolder extends RecyclerView.ViewHolder {
            // each data item is just a string in this case
            public TextView mTitle;
            public TextView mDetail;
            public ViewHolder(View v) {
                super(v);
                mTitle = (TextView) v.findViewById(R.id.subject_textview1);
                mDetail = (TextView) v.findViewById(R.id.subject_textview2);
            }
        }

        @Override
        public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

            // Inflate the view for this view holder
            View item = getLayoutInflater().inflate(R.layout.activity_recycler_view, parent,
                    false);

            // Call the view holder's constructor, and pass the view to it;
            // return that new view holder
            ViewHolder vh = new ViewHolder(item);
            return vh;
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            // - get element from your dataset at this position
            // - replace the contents of the view with that element
            holder.mTitle.setText(movies[position][0]);
            holder.mDetail.setText(movies[position][1]);
        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return movies.length;
        }
    }


}
