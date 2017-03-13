package com.example.justin179.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main2Activity.class);
                intent.putExtra("Name","City Cafe");
                startActivity(intent);

            }
        });

    }

    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
    };

    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
    };

    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"OnResume",Toast.LENGTH_LONG).show();
    };

    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"onPause",Toast.LENGTH_LONG).show();
    };

    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"onStop",Toast.LENGTH_LONG).show();
    };

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show();
    };



}
