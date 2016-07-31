package com.wangban.yzbbanban.test_photo_recycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.youth.banner.Banner;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    private Banner banner;
    List<Integer> imgs=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banner= (Banner) findViewById(R.id.banner);
        imgs.add(R.mipmap.be1);
        imgs.add(R.mipmap.be2);
        imgs.add(R.mipmap.be3);
        imgs.add(R.mipmap.be4);
        imgs.add(R.mipmap.be5);
        banner.setImages(imgs);

    }
}
