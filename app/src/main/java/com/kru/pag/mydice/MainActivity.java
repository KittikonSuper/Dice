package com.kru.pag.mydice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button back,random, next;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindwidget();

    }

    private void bindwidget() {
        imageView = (ImageView) findViewById(R.id.imgdice);
        back = (Button) findViewById(R.id.btnback);
        random = (Button)findViewById(R.id.btnrandom);
        next = (Button) findViewById(R.id.btnnext);

    }
}
