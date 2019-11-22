package com.example.tutorial2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ActivityImageButton extends Activity {
    ImageButton imgButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_imagebutton);

        imgButton = (ImageButton)findViewById(R.id.imageButton);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast adalah pop up info yang yang muncul hanya sesaat
                // Toast tidak memerlukan aksi pengguna (akan hilang sendiri)
                Toast.makeText(getApplicationContext(), "Click the Image"
                        , Toast.LENGTH_LONG).show();
            }
        });
    }
}

