package co.miniforge.corey.mediatracker;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.LinkedList;
import java.util.List;

import co.miniforge.corey.mediatracker.model.MediaItem;

public class MediaDetailActivity extends AppCompatActivity {

    public static String mediaExtra = "mediaExtra";

    Button saveButton;
    EditText titleInput;
    EditText descriptionInput;
    EditText urlInput;
    MediaItem mediaItem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_detail);


       Intent  intent = getIntent();

       if(intent.hasExtra(MyListActivity.mediaExtra)){
           try {
               JSONObject json = new JSONObject(intent.getStringExtra(mediaExtra));
               mediaItem = new MediaItem(json);

           } catch (Exception e){
               Log.e("handleIntentErr", String.format("Could not update item from intent: %s", e.getMessage()));
           }

       }


        titleInput = (EditText) findViewById(R.id.editTitle);
        descriptionInput = (EditText) findViewById(R.id.editDescription);
        urlInput = (EditText) findViewById(R.id.editURL);
        saveButton = (Button) findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Update media item with values from the edit texts
                 mediaItem.title = titleInput.getText().toString();
                 mediaItem.description = descriptionInput.getText().toString();
                 mediaItem.url = urlInput.getText().toString();


                //Create intent and put string extra with media type
                Intent newIntent = new Intent(getApplicationContext(), MyListActivity.class);

                newIntent.putExtra(MyListActivity.mediaExtra, mediaItem.toJson().toString());
                //Start activity
                startActivity(newIntent);

            }
        });

    }


}
