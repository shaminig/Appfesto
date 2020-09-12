package com.example.appfesto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;import android.view.View;

public class MainActivity4 extends AppCompatActivity {
    public Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b1 = (Button) findViewById(R.id.button5);
        b1.setOnClickListener(new OnClickListener() {

            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);
            }
        });
    }

}