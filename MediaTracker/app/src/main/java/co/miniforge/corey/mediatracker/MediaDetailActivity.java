package co.miniforge.corey.mediatracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MediaDetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_detail);
    }



    Intent intent = new Intent(getApplicationContext(), MediaItemDetailActivity.class);
    //intent.putExtra(text, input.getText().toString());
    //startActivity(intent);


}
