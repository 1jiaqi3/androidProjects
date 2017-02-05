package com.example.androidmac.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchMovie(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Launching 热门电影";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    public void launchStock(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Launching 股票雄鹰";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    public void launchReader(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Launching XYZ阅读器";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    public void launchNews(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Launching 最新闻";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    public void launchCapstone(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Launching 毕业设计";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }
}
