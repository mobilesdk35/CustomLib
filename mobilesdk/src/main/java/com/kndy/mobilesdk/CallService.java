package com.kndy.mobilesdk;

import android.util.Log;

public class CallService {

    public static void d() {
        Log.d("CallService","CallService was called");
    }


    private static CallService mInstance;

    public static CallService getInstance(){
        if(mInstance == null)
            mInstance = new CallService();

        return mInstance;
    }


}
