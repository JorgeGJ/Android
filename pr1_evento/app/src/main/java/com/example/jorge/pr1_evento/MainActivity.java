package com.example.jorge.pr1_evento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.jorge.pr1_evento.R.id.textView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.textView);
    }
    public void boton1(View View){
        t1.setText("Boton presionado");
    }
}
