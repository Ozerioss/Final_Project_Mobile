package com.example.ozerioss.final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {


    private final String apiKey="AIzaSyCBwA_JUHk5zYrORSmhmOF2biKso_X7A4Y";
    private String url="https://www.googleapis.com/youtube/v3/search?";
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

    }


    public void fetchVideos(String message, String apiKey)
    {
        StringRequest stringRequest = new StringRequest(url + "&part=snippet&q=" + message + "&type=video&maxResult=10&key=" + apiKey, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                QueryItem item = new Gson().fromJson(response, QueryItem.class);
                setAdapter(item.getItems());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("QueryItem", "Error");
            }
        });
        Volley.newRequestQueue(this).add(stringRequest);
    }

    private void setAdapter(List<QueryItem.ItemsBean> video) {
        ItemAdapter adapter = new ItemAdapter(video);
        //adapter.setOnVideoSelectedListener();
        recyclerView.setAdapter(adapter);
    }

}
