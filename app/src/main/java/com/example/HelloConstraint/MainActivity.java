package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private int mCount=0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView)findViewById(R.id.show_count);
    }

    public void showToast(View view){
         Toast toast= Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);

         toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if(mCount %2 == 0 ) {
            view.setBackgroundColor(getResources().getColor(R.color.red));
        }
        else{
            view.setBackgroundColor(getResources().getColor(R.color.pink));
        }
        findViewById(R.id.button_zero).setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }
    public void zero(View view){
        mShowCount.setText(Integer.toString(0));
        mCount=0;
            findViewById(R.id.button_zero).setBackgroundColor(getResources().getColor(R.color.Gray));
            findViewById(R.id.button_count).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
    }
}