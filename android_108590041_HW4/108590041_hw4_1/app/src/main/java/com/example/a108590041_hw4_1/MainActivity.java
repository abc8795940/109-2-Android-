package com.example.a108590041_hw4_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private int mcount=0;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.editText1);
        textView = (TextView)findViewById(R.id.textView1);

        if (savedInstanceState != null) {

            mcount = savedInstanceState.getInt("count");
            if (textView != null) {
                textView.setText(Integer.toString(mcount));
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Add information for saving HelloToast counter
        // to the to the outState bundle
        outState.putInt("count",mcount);
    }


    public void Count(View view){
        mcount++;
        textView.setText(Integer.toString(mcount));
    }

    @Override
    protected void onStart() {
        super.onStart();
        // The activity is about to become visible.
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        // The activity is between stopped and started.
    }


    @Override
    protected void onStop() {
        super.onStop();
        // The activity is no longer visible
        // it is now "stopped"
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Another activity is taking focus
        // this activity is about to be "paused"
    }

    @Override
    protected void onResume() {
        super.onResume();
        // The activity has become visible
        // it is now "resumed"
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // The activity is about to be destroyed.
    }
}