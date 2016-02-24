package com.kru.pag.mydice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        blackcon();
        random();
        next();




    }

    private void next() {
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void random() {
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void blackcon() {

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void bindwidget() {
        imageView = (ImageView) findViewById(R.id.imgdice);
        back = (Button) findViewById(R.id.btnback);
        random = (Button)findViewById(R.id.btnrandom);
        next = (Button) findViewById(R.id.btnnext);




    }
}
