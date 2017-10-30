package co.miniforge.corey.mediatracker.model;

import org.json.JSONObject;

/**
 * Created by corey on 10/20/17.
 */

public class TVItem extends MediaItem {

    public int currentEpisodesWatched;
    public int totalEpisodes;


    public TVItem(JSONObject jsonObject) {
        super(jsonObject);

        try{
            currentEpisodesWatched = jsonObject.getInt("currentEpisodesWatched");
            totalEpisodes = jsonObject.getInt("totalEpisodes");
        }
        catch(Exception e){

        }
    }


    public JSONObject toJSON(){

        JSONObject result = super.toJson();


        try{
           result.put("currentEpisodesWatched", currentEpisodesWatched);
            result.put("totalEpisodes", totalEpisodes);
        }
        catch (Exception e){

        }
        return result;
    }
}
