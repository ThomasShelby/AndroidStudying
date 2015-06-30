package com.example.MyFirstProject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyActivity extends Activity {

    private TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        textView= (TextView) findViewById(R.id.textView);
    }

    public void sayHello(View view){
        textView.setText("Hello!!!");
    }
}
