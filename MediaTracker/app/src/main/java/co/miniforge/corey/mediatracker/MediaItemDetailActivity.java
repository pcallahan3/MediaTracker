package co.miniforge.corey.mediatracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.json.JSONObject;

import co.miniforge.corey.mediatracker.model.MediaItem;

/**
 * This activity will display the contents of a media item and allow the user to update the contents
 * of the item. When the user clicks the save button, the activity should create an intent that goes
 * back to MyListActivity and puts the MediaItem into the intent (If you are stuck on that, read through
 * the code in MyListActivity)
 */
public class MediaItemDetailActivity extends AppCompatActivity {

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
                MediaItem item = new MediaItem();

            }
        });
    }



}
