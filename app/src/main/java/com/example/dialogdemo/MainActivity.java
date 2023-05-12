package com.example.dialogdemo;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.button);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyFirstDialog dialogo = new MyFirstDialog();
                dialogo.setCancelable(false);
                dialogo.show(getSupportFragmentManager(),"1234");

            }
        });



    }
}