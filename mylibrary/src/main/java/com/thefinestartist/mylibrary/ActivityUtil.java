package com.thefinestartist.mylibrary;

import android.content.Context;
import android.content.Intent;

/**
 * Created by TheFinestArtist on 3/10/16.
 */
public class ActivityUtil {

    public static void start(Context context) {
        try {
            Class clazz = Class.forName("com.thefinestartist.myapplication.SubActivity");
            Intent intent = new Intent(context, clazz);
            context.startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
