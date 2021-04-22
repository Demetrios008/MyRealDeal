package com.example.bottomnav;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_user_registration.R;

public class Roster extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {R.drawable.emmy, R.drawable.jin, R.drawable.kate, R.drawable.kim, R.drawable.lilly, R.drawable.sam};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.name);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this,s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
