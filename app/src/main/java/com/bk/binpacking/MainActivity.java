package com.bk.binpacking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    String n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.itemCount);
    }

    public void go(View view) {
        n=editText.getText().toString();
        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra("number",n);
        startActivity(intent);
    }
}
