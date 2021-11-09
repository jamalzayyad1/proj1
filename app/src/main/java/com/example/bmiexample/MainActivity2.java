package com.example.bmiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        spinner=findViewById(R.id.spinner);

        String type= spinner.getSelectedItem().toString();


        Intent intent= getIntent();
        final Handler handler =new Handler();
        handler.post(()-> {
            intent.putExtra("data",type);
            handler.postDelayed((Runnable) this, 1000);
        });
    }

    public void Show_Click(View view) {
        Intent in=new Intent(this,MainActivity3.class);
        startActivity(in);
    }

}