package com.deeplab.youtubeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.deeplab.ytinfo.YTInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] all = YTInfo.get("https://www.youtube.com/watch?v=oLY1rss9Jx8").getAll();
        String title = YTInfo.get("https://www.youtube.com/watch?v=oLY1rss9Jx8").getTitle();
        String authorName = YTInfo.get("https://www.youtube.com/watch?v=oLY1rss9Jx8").getAuthorName();
        String authorUrl = YTInfo.get("https://www.youtube.com/watch?v=oLY1rss9Jx8").getAuthorUrl();
        String type = YTInfo.get("https://www.youtube.com/watch?v=oLY1rss9Jx8").getType();
        String thumbnail = YTInfo.get("https://www.youtube.com/watch?v=oLY1rss9Jx8").getThumbnail();
    }
}