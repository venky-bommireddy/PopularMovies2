package com.venky.popularmovies.interfaces;

/**
 * Created by venky bommireddy  on 6/11/16.
 */
public interface DBUpdateListener {
    void onSuccess(int operationType);

    void onFailure();
}
