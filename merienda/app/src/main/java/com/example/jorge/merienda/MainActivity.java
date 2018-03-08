package com.example.jorge.merienda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button vcomer;
    TextView vt1;
    ImageView vimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         vcomer = (Button) findViewById(R.id.comer);
         vt1 = (TextView) findViewById(R.id.t1);
         vimg = (ImageView) findViewById(R.id.img1);

        vcomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vimg.setImageDrawable(getResources().getDrawable(R.drawable.after_cookie));
                vt1.setText("Ya no tengo hambe!!!!");
            }
        });
    }
}
