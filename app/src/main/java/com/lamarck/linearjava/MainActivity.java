package com.lamarck.linearjava;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        linearLayout = new LinearLayout(this);
        textView = new TextView(this);
        button = new Button(this);


        LinearLayout.LayoutParams dimensions = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        linearLayout.setLayoutParams(dimensions);

        LinearLayout.LayoutParams viewdimensions = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        linearLayout.setLayoutParams(viewdimensions);

        button.setLayoutParams(viewdimensions);

        linearLayout.setOrientation(LinearLayout.VERTICAL);
        textView.setText("Hello world");
        button.setText("Button Here");

        linearLayout.addView(textView);
        linearLayout.addView(button);

        setContentView(linearLayout);




    }
}