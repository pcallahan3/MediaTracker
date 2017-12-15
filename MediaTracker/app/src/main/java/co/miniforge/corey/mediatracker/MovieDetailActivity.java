package co.miniforge.corey.mediatracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import co.miniforge.corey.mediatracker.model.MediaItem;
import co.miniforge.corey.mediatracker.model.MovieModel;

/**
 * Created by Patricks PC on 12/9/2017.
 */

public class MovieDetailActivity extends AppCompatActivity {

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_item_detail);


    }

    void bindData() {
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create new empty media item
                MovieModel item = new MovieModel();

            }
        });
    }


}
