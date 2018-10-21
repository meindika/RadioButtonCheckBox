package com.gmail.meindika80.radiobuttoncheckboxedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //ini deklarasi atribut tampilan view
    EditText editNama, editNim;
    TextView texthasil;
    Button tombolsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //koneksi atribut XML
        editNama = (EditText) findViewById(R.id.editNamaMhs);
        editNim = (EditText) findViewById(R.id.editNimMhs);
        texthasil = (TextView)findViewById(R.id.textView3);
        tombolsubmit = (Button)findViewById(R.id.button);


    }
    protected  void onClick(View view){
        String nama, nim;
        nama = editNama.getText() .toString();
        nim = editNim.getText().toString();
        texthasil.setText(""+nama+"-"+nim);
    }

}

