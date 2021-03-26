package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("7ELOtDYSFaFGKfvohjDERJTfck3CQqtZZp0t0xCZ")
                .clientKey("ujfCA8PvbIRpeYNx073TVI7dHmqdbnb36NKJjGFX")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
