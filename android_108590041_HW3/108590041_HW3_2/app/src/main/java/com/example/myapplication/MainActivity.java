package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count=0,cntCount=0;
    private TextView textView;
    private Button btnZero,btnCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        btnZero = (Button) findViewById(R.id.button2);
        btnCount = (Button) findViewById(R.id.button3);
        btnZero.setEnabled(false);
    }

    public void showToast(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("Toast", count);
        startActivity(intent);
    }

    public void countUp(View view) {
        count++;
        textView.setText(Integer.toString(count));
        if(cntCount%2==1){
            btnCount.setBackgroundColor(Color.BLUE);
        }
        else{
            btnCount.setBackgroundColor(Color.RED);
        }
        cntCount++;
        btnZero.setBackgroundColor(Color.RED);
        btnZero.setEnabled(true);
    }

    public void countZero(View view) {
        count = 0;
        textView.setText(Integer.toString(count));
        btnZero.setEnabled(false);
        btnZero.setBackgroundColor(Color.GRAY);
    }
}