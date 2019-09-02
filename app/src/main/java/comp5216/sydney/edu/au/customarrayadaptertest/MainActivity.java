package comp5216.sydney.edu.au.customarrayadaptertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private MovieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.movie_list);
        ArrayList<Movie> moviesList = new ArrayList<>();

        moviesList.add(new Movie(R.drawable.movie_after_earth, "After Earth", "2013"));
        moviesList.add(new Movie(R.drawable.movie_baby_driver, "Baby Driver", "2017"));
        moviesList.add(new Movie(R.drawable.movie_deadpool, "Deadpool", "2016"));
        moviesList.add(new Movie(R.drawable.movie_divergent, "Divergent", "2014"));

        mAdapter = new MovieAdapter(this, moviesList);
        listView.setAdapter(mAdapter);
    }
}
