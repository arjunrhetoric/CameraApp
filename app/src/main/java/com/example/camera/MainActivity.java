package com.example.camera;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button b1;
    int REQUEST_CODE =1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        img = findViewById(R.id.img);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(in, REQUEST_CODE);
            }
        });
    }

    protected void onActivityResult(int requestCode,int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE) {
            Bitmap image = (Bitmap) data.getExtras().get("data");
            WeakReference<Bitmap> result1 = new WeakReference<Bitmap>(Bitmap.createScaledBitmap(image,
                    image.getWidth(), image.getHeight(), false).copy(
                    Bitmap.Config.RGB_565, true));
            Bitmap bm=result1.get();
            img.setImageBitmap(image);

        }
    }
}