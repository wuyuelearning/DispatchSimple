package com.example.admin.dispatchsimple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private TextView text1;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        text1=(TextView)findViewById(R.id.dispatch);
        text2=(TextView)findViewById(R.id.listdispatch);

        text1.setOnClickListener(this);
        text2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.dispatch){
            Intent intent =new Intent(this,DispatchSimpleActivity.class);
            startActivity(intent);
        } else if(v.getId() == R.id.listdispatch){
            Intent intent =new Intent(this,ListDispatchActivity.class);
            startActivity(intent);
        }
    }
}
