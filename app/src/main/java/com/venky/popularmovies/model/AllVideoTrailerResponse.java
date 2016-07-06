package com.venky.popularmovies.model;

import java.util.ArrayList;

/**
 * Created by venky bommireddy  on 4/14/16.
 */
public class AllVideoTrailerResponse {

    private int id;
    private ArrayList<VideoTrailer> results;

    public int getId() {
        return id;
    }

    public ArrayList<VideoTrailer> getResults() {
        return results;
    }
}
