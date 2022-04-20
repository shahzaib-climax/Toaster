package com.example.toasty

import android.content.Context
import android.widget.Toast

object Toaster {
    fun showToaster(context: Context?, newMessages: String?) {
        Toast.makeText(context, newMessages, Toast.LENGTH_SHORT).show()
    }
}