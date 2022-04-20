package com.example.toasty;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void showToaster(Context context, String newMessages){
        Toast.makeText(context, newMessages, Toast.LENGTH_SHORT).show();
    }
}
