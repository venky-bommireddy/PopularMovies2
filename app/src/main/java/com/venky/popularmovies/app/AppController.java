package com.venky.popularmovies.app;

import android.app.Application;
import android.util.Log;

import com.venky.popularmovies.network.DataManager;

/**
 * Created by venky bommireddy 07/07/2016.
 */

public class AppController extends Application {

    private static final String TAG = AppController.class
            .getSimpleName();
    // Different Managers
    private DataManager mDataMan;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.v(TAG, "App started");
        initApp();
    }

    private void initApp() {
        mDataMan = DataManager.getInstance(AppController.this);
        mDataMan.init();
    }

    /**
     * Get the data manager instance
     */
    public synchronized DataManager getDataManager() {
        return mDataMan;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        if (mDataMan != null) {
            mDataMan.terminate();
        }
    }
}
