package com.example.bmiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.example.bmiexample.model.Person;
import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText Email;
    private EditText Pass;
    private Spinner spinner;

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email= findViewById(R.id.edtpass);
        Pass=findViewById(R.id.edtemail);
        spinner=findViewById(R.id.spinner);
    }

    public void btnShow_Click(View view) {
        String email= String.valueOf(Email.getText());
        String pass= String.valueOf(Pass.getText());
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Person person=new Person(email,pass);
        Gson gson=new Gson();
        String booksString = gson.toJson(person);
        editor.putString("123", booksString);
        editor.commit();
        Toast.makeText(this, "Data Saved:\n" + booksString,
                Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}