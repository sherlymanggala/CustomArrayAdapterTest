package comp5216.sydney.edu.au.customarrayadaptertest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie> {

    private Context mContext;
    private List<Movie> movieList = new ArrayList<>();

    public MovieAdapter(@NonNull Context context, @LayoutRes ArrayList<Movie> list) {
        super(context, 0, list);
        mContext = context;
        movieList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
        }

        Movie currentMovie = movieList.get(position);

        ImageView image = listItem.findViewById(R.id.imageView_poster);
        image.setImageResource(currentMovie.getmImageDrawable());

        TextView name = listItem.findViewById(R.id.textView_name);
        name.setText(currentMovie.getmName());

        TextView release = listItem.findViewById(R.id.textView_release);
        release.setText(currentMovie.getmRelease());

        return listItem;
    }
}
