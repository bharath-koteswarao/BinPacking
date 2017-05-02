package com.bk.binpacking;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.LinearLayout;

public class SecondActivity extends AppCompatActivity {
    LinearLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        container=(LinearLayout)findViewById(R.id.container);
        int n=Integer.parseInt(getIntent().getExtras().getString("number"));
        EditText editText=new EditText(this);
        editText.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));
        editText.setHint("hello");
        editText.setTag("et1");
        LinearLayout.LayoutParams params=(LinearLayout.LayoutParams)editText.getLayoutParams();
        params.setMargins(0,10,0,0);
        container.addView(editText);
    }
}
