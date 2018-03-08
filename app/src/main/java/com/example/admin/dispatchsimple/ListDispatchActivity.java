package com.example.admin.dispatchsimple;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 2018/3/7.
 */

public class ListDispatchActivity extends AppCompatActivity {

    private static final String TAG = "ListDispatchActivity";
    private HorizontalScrollViewEx mListContainer;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listdispatch);
        Log.d(TAG, "onCreate");
        initView();
    }

    private void initView() {
        LayoutInflater inflater = getLayoutInflater();
        mListContainer = (HorizontalScrollViewEx) findViewById(R.id.horizontalScrollViewEx);
        final int screenWidth = getScreenMetrics(this).widthPixels;
        final int screenHeight = getScreenMetrics(this).heightPixels;


        for(int i=0;i<3;i++){
            ViewGroup layout= (ViewGroup) inflater.inflate(R.layout.listviewlayout,mListContainer,false);
            layout.getLayoutParams().width=screenWidth;
            TextView textView = (TextView)layout.findViewById(R.id.title);
            textView.setText("page: "+(i+1));
            layout.setBackgroundColor(Color.rgb(255/(i+1),255/(i+1),0));
            createList(layout);
            mListContainer.addView(layout);
        }
    }

    private void createList(ViewGroup layout){
        ListView listView = (ListView ) layout.findViewById(R.id.list);
        ArrayList<String> datas = new ArrayList<>();
        for(int i=0;i<50;i++){
            datas.add("name: "+i);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.item,R.id.name,datas);
        listView.setAdapter(adapter);
    }

    private DisplayMetrics getScreenMetrics(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(dm);
        return dm;
    }
}
