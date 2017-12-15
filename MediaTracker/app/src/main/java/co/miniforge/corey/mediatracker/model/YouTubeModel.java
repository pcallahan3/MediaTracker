package co.miniforge.corey.mediatracker.model;

import org.json.JSONObject;

import co.miniforge.corey.mediatracker.media_store.Md5IdHelper;

/**
 * Created by Patricks PC on 12/7/2017.
 */

public class YouTubeModel extends MediaItem {

    public String videoTitle;
    public String videoAuthor;

    public YouTubeModel(){
        this.id = Md5IdHelper.idForObject(this);
        this.title = "defaultVideoTitle";
        this.description = "defaultVideoAuthor";

    }




    public YouTubeModel(JSONObject jsonObject) {
        super(jsonObject);

        try{
            videoTitle = jsonObject.getString("videoTitle");
            videoAuthor = jsonObject.getString("videoAuthor");
        }
        catch(Exception e){

        }
    }

    public JSONObject toJSON(){

        JSONObject result = super.toJson();

        try{
            result.put("videoTitle", videoTitle);
            result.put("videoAuthor", videoAuthor);
        }
        catch (Exception e){

        }
        return result;
    }
}
