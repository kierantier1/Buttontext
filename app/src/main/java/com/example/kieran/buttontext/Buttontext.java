package com.example.kieran.buttontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Buttontext extends AppCompatActivity {
    Button BPM;
    TextView TVHW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttontext);
        BPM = (Button) findViewById(R.id.ButtonPM);
        TVHW = (TextView) findViewById(R.id.TextHW);

        BPM.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TVHW.setText("Goodbye, World!");
            }
        });
    }
}
