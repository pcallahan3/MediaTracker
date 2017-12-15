package co.miniforge.corey.mediatracker.model;

import org.json.JSONObject;

import co.miniforge.corey.mediatracker.media_store.Md5IdHelper;

/**
 * Created by corey on 10/20/17.
 */

public class MovieModel extends MediaItem {

    public int myRating;
    public String genre;

    public MovieModel(){
        this.id = Md5IdHelper.idForObject(this);
        this.title = "defaultRating";
        this.description = "defaultGenre";

    }

    public MovieModel(JSONObject jsonObject) {
        super(jsonObject);

        try{
            myRating = jsonObject.getInt("myRating");
            genre = jsonObject.getString("genre");
        }
        catch(Exception e){

        }
    }

    public JSONObject toJSON(){

        JSONObject result = super.toJson();

        try{
            result.put("myRating", myRating);
            result.put("genre", genre);
        }
        catch (Exception e){

        }
        return result;
    }
}
