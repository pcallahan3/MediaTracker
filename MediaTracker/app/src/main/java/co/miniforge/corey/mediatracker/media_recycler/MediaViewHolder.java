package co.miniforge.corey.mediatracker.media_recycler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import co.miniforge.corey.mediatracker.MediaDetailActivity;
import co.miniforge.corey.mediatracker.MediaItemDetailActivity;
import co.miniforge.corey.mediatracker.MyListActivity;
import co.miniforge.corey.mediatracker.R;
import co.miniforge.corey.mediatracker.model.MediaItem;

/**
 * Created by corey on 10/15/17.
 */

public class MediaViewHolder extends RecyclerView.ViewHolder {
    TextView mediaName;
    TextView mediaDescription;
    TextView mediaURL;

    View inflated;

    Context context;

    public MediaViewHolder(View itemView) {
        super(itemView);

        locateViews(itemView);
    }

    private void locateViews(View itemView) {
        inflated = itemView;
        context = itemView.getContext();

        mediaName = itemView.findViewById(R.id.mediaName);
        mediaDescription = itemView.findViewById(R.id.mediaDescription);
        mediaURL = itemView.findViewById(R.id.mediaURL);
    }

    public void bindData(final MediaItem mediaItem){
        this.mediaName.setText(mediaItem.title);
        this.mediaDescription.setText(mediaItem.description);
        this.mediaURL.setText(mediaItem.url);

        inflated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Create a new activity with this object's data
                Intent newIntent = new Intent(context, MediaDetailActivity.class);
                newIntent.putExtra(MyListActivity.mediaExtra, mediaItem.toJson().toString());
                context.startActivity(newIntent);
                //Hint: mediaItem.toJson().toString() && context.startActivity);
            }
        });

        inflated.setOnLongClickListener(new View.OnLongClickListener()  {

            @Override
            public boolean onLongClick(View v) {
                ((MyListActivity)context).deleteMediaItem(mediaItem);

                return true;
            }
        });


    }
}
