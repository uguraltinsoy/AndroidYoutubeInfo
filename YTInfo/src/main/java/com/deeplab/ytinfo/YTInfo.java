package com.deeplab.ytinfo;

import android.os.StrictMode;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class YTInfo {
    private static String[] all = new String[5];


    /**
     * @param url The url of the video to get information
     */
    public static YTInfo get(String url){
        YTInfo youTubeInfo = new YTInfo();
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            StringBuilder result = new StringBuilder();
            try{
                URL parseUrl = new URL("https://www.youtube.com/oembed?&format=json&url=" + url);
                HttpURLConnection urlConnection = (HttpURLConnection) parseUrl.openConnection();
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                String  inputLine;
                while ((inputLine = reader.readLine())!= null){
                    result.append(inputLine);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            JSONObject jsonObject = new JSONObject(result.toString());
            all[0] = jsonObject.getString("title");
            all[1] = jsonObject.getString("author_name");
            all[2] = jsonObject.getString("author_url");
            all[3] = jsonObject.getString("type");
            all[4] = jsonObject.getString("thumbnail_url");
        }catch (JSONException e){
            e.printStackTrace();
        }
        return youTubeInfo;
    }

    public String[] getAll() {
        return all;
    }

    public String getTitle() {
        return all[0];
    }

    public String getAuthorName() {
        return all[1];
    }

    public String getAuthorUrl() {
        return all[2];
    }

    public String getType() {
        return all[3];
    }

    public String getThumbnail() {
        return all[4];
    }
}
