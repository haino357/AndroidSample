package com.example.androidsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.v("Verbose")
        Timber.d("Debug")
        Timber.i("Info")
        Timber.e("Error")
        Timber.w("Warning")
        Timber.d("$this")
        Timber.d("${this.actionBar}") // プロパティやメソッドを呼ぶ場合は波括弧 `{ }` で括る必要がある

    }
}