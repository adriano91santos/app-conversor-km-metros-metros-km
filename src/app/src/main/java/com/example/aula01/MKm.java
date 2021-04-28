package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MKm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_km);

        EditText edtK_prog = (EditText) findViewById(R.id.edtK);
        EditText edtMt_prog = (EditText) findViewById(R.id.edtMt);
        Button btnConvert_prog = (Button) findViewById(R.id.btnConvert);

        btnConvert_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float mt, k;
                mt = Float.parseFloat(edtMt_prog.getText().toString());
                k = mt / 1000;
                edtK_prog.setText(String.valueOf(k));

            }
        });
    }
}