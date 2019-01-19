package me.seandillon.basictoastlibrarytestyo;

import android.content.Context;
import android.widget.Toast;

public class BasicToastLibraryTestYo {

    public static void myLibraryToast(Context context, String s){
        Toast.makeText(context, context.getString(R.string.string_1, s), Toast.LENGTH_SHORT).show();
    }

}
