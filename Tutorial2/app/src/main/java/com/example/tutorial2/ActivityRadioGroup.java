package com.example.tutorial2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ActivityRadioGroup extends Activity {
    private RadioGroup radiosexgroup;
    private RadioButton  radiosexbutton;
    private Button btndisplay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_radiogroup);

        radiosexgroup = findViewById(R.id.radioGroup);
        btndisplay = findViewById(R.id.button);

        btndisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int S = radiosexgroup.getCheckedRadioButtonId();
                radiosexbutton = findViewById(S);
                Toast.makeText(ActivityRadioGroup.this,radiosexbutton.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}

