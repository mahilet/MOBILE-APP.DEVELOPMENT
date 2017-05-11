package com.mahiltletdan.hw1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class MyMoviesList extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;
//    RelativeLayout relativeLayout;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;

//    String[][] Movie = {
//            {"Mad Max: Fury Road", "Action & Adventure", "2015"},
//            {"Inside Out", "Animation, Kids & Family", "2015"},
//            {"Star Wars: Episode VII - The Force Awakens", "Action", "2015"},
//            {"Shaun the Sheep", "Animation", "2015"},
//            {"The Martian", "Science Fiction & Fantasy", "2015"},
//            {"Mission: Impossible Rogue Nation", "Action", "2015"},
//            {"Up", "Animation", "2009", "Star Trek"},
//            {"Science Fiction", "2009", "The LEGO Movie"},
//            {"Animation", "2014", "Iron Man", "Action & Adventure", "2008"},
//            {"Aliens", "Science Fiction", "1986"},
//            {"Chicken Run", "Animation", "2000"},
//            {"Back to the Future", "Science Fiction", "1985"},
//            {"Raiders of the Lost Ark", "Action & Adventure", "1981"},
//            {"Goldfinger", "Action & Adventure", "1965"},
//            {"Guardians of the Galaxy", "Science Fiction & Fantasy", "2014"},
//            {"Mad Max: Fury Road", "Action & Adventure"},
//           {"Inside Out", "Animation, Kids & Family"},
//
//
//    };

    String[][] Movie = {
            {"Mad Max: Fury Road", "Action & Adventure"},
            {"Inside Out", "Animation, Kids & Family"},
            {"Star Wars: Episode VII - The Force Awakens", "Action"}


    };


    //String[] buttonsArray = {"TL", "TR", "BL", "BR" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_my_movies_list);

        Toolbar ToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(ToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        context = getApplicationContext();

//        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recylerViewLayoutManager = new LinearLayoutManager(context);

        //recyclerView.setLayoutManager(recylerViewLayoutManager);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(recylerViewLayoutManager);
//or any layout manager (grid etc)

//        ArrayAdapter adapter = new ArrayAdapter<String>(this,
//                R.activity_recycler_view, buttonsArray);
//
//        ListView listView = (ListView) findViewById(R.id.action_movie_list);
//        recyclerView.setAdapter(adapter);
//        ViewGroup header = (ViewGroup) getLayoutInflater().inflate(R.layout.list_header, listView,
//                false);
//        listView.addHeaderView(header, null, false);



        recyclerViewAdapter = new RecyclerViewAdapter(context,Movie);


//        recyclerView.setAdapter((RecyclerView.Adapter) recyclerViewAdapter);
        recyclerView.setAdapter(recyclerViewAdapter);




    }




    }
