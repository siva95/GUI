package com.example.sivaprakasam.gui;



import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    TextView tv;
    Button b1,b2,b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText)findViewById(R.id.et);
        tv = (TextView)findViewById(R.id.tv);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x;
                x = et.getText().toString();
                tv.setText(x);
                tv.setTextSize(15);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x;
                x = et.getText().toString();
                tv.setText(x);
                int  a=(int)(Math.random()*255+1);
                int b = (int)(Math.random()*255+1);
                int c=(int)(Math.random()*255+1);
                tv.setTextColor(Color.rgb(a,b,c));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x;
                x = et.getText().toString();
                tv.setText(x);
                tv.setTypeface(Typeface.DEFAULT_BOLD);
            }
        });
    }

}
