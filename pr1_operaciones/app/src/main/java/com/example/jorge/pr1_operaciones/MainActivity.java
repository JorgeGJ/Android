package com.example.jorge.pr1_operaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int cn1, cn2, cresultado;
    private EditText n1, n2;
    private TextView resultado;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1= (EditText) findViewById(R.id.n1);
        n2= (EditText) findViewById(R.id.n2);
        resultado= (TextView) findViewById(R.id.resulado);
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                cn1 = Integer.parseInt(n1.getText().toString());
                cn2 = Integer.parseInt(n2.getText().toString());
                cresultado = cn1 + cn2;
                resultado.setText(Integer.toString(cresultado));
            }
        });
    }
}
