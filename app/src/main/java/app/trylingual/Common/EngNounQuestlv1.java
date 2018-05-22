package app.trylingual.Common;

import android.app.Application;

import com.firebase.client.Firebase;

public class EngNounQuestlv1 extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);

    }
}
