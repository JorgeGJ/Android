package com.example.jorge.cafe;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText input;
    private TextView ca;
    private CheckBox c1, c2;
    private Button m1, m2, p1;
    private int suma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input= (EditText) findViewById(R.id.input);
        ca= (TextView) findViewById(R.id.ca);
        c1= (CheckBox) findViewById(R.id.c1);
        c2= (CheckBox) findViewById(R.id.c2);
        m1= (Button) findViewById(R.id.m1);
        m2= (Button) findViewById(R.id.m2);
        p1= (Button) findViewById(R.id.p1);

        m2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                sumarContador();
            }
        });

        m1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                restarContador();
            }
        });
        p1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                double precio = 3.5;
                precio *= suma;

                if (c1.isChecked()) {
                    precio += 0.5;
                }

                if (c2.isChecked()) {
                    precio += 0.5;
                }

                Context contexto = getApplicationContext();
                String mensaje = "Nombre: " + input.getText().toString() + "\n" +
                        "Añadir crema: " + c2.isChecked() + "\n" +
                        "Añadir chocolate: " + c1.isChecked() + "\n" +
                        "Cantidad: " + suma + "\n" +
                        "Precio: " + precio + "€\n" +
                        "Gacias por el peido";
                int duracion = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(contexto, mensaje, duracion);
                toast.show();
            }
        });

    }
    private void sumarContador() {
        suma = Integer.valueOf(this.ca.getText().toString());
        if (suma == 100) {
            return;
        }
        suma++;

        this.ca.setText(String.valueOf(suma));
    }

    private void restarContador() {
        suma = Integer.valueOf(this.ca.getText().toString());
        if (suma == 0) {
            return;
        }
        suma--;

        this.ca.setText(String.valueOf(suma));
    }
}


