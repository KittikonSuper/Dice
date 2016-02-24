package com.kru.pag.mydice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView, androidImageView;
    private Button back,random, next;
    private int intdice = 1;





    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindwidget();
        blackcon();
        random();
        next();
        diceview();
        showviwe();





    }

    private void diceview(int intMyRandom) {
        int[] intSourceImage = new int[7];
        intSourceImage[0] = 0;
        intSourceImage[1] = R.drawable.dice1;
        intSourceImage[2] = R.drawable.dice2;
        intSourceImage[3] = R.drawable.dice3;
        intSourceImage[4] = R.drawable.dice4;
        intSourceImage[5] = R.drawable.dice5;
        intSourceImage[6] = R.drawable.dice6;

        androidImageView.setImageResource(intSourceImage[intMyRandom]);
    }

    private void showviwe(int intdice) {
        Log.d("test", "ค่าที่ได้รับ = " + intdice);
        int intSoure;
        switch (intdice){
            case 1:
                imageView.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView.setImageResource(R.drawable.dice6);
                break;

        }


    }


    private void next() {
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intdice += 1;
                if(intdice ==7) {
                    intdice = 1;
                }
                showviwe(intdice);
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
                intdice -= 1;
                if (intdice ==0) {
                    intdice = 6;
                }
                showviwe(intdice);
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
