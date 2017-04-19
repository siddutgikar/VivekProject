package com.example.ashish.instareplica;

import android.app.Activity;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeActivity extends Activity {

    ListView imageList;
    CustomListAdapter customListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        imageList=(ListView)findViewById(R.id.lstView);
        imageList.setDividerHeight(5);
        ImageObject img1= new ImageObject();
        img1.setName("Vivek");
        img1.setUrl("https://scontent-iad3-1.cdninstagram.com/t51.2885-15/s750x750/sh0.08/e35/17882262_1533652686647816_5779295619696820224_n.jpg");
        ImageObject img2= new ImageObject();
        img2.setName("Abhijeet");
        img2.setUrl("https://scontent-iad3-1.cdninstagram.com/t51.2885-15/e35/17932654_220658808417672_1059455985384423424_n.jpg");
        ImageObject img3= new ImageObject();
        img3.setName("Ketan");
        img3.setUrl("https://scontent-iad3-1.cdninstagram.com/t51.2885-15/e35/18011330_696771667176297_4585007751758872576_n.jpg");
        ImageObject img4= new ImageObject();
        img4.setName("Koninika");
        img4.setUrl("https://scontent-iad3-1.cdninstagram.com/t51.2885-15/sh0.08/e35/p750x750/17883058_147029522498312_717674909014163456_n.jpg");
        ImageObject img5= new ImageObject();
        img5.setName("Aniket");
        img5.setUrl("https://scontent-iad3-1.cdninstagram.com/t51.2885-15/e35/17934450_1684267411875030_8947125864999419904_n.jpg");
        ImageObject img6= new ImageObject();
        img6.setName("Siddhant");
        img6.setUrl("https://scontent-iad3-1.cdninstagram.com/t51.2885-15/sh0.08/e35/p750x750/18013378_1789846494663787_1402857591570169856_n.jpg");
        ArrayList<ImageObject> objectArrayList =new ArrayList<>();

        objectArrayList.add(img1);
        objectArrayList.add(img2);
        objectArrayList.add(img3);
        objectArrayList.add(img4);
        objectArrayList.add(img5);
        objectArrayList.add(img6);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        customListAdapter= new CustomListAdapter(objectArrayList,this,width*90/100);
        imageList.setAdapter(customListAdapter);

    }
}
