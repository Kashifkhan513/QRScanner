package com.polaris.qrscanner;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
public static TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.tvResult);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED)
        {

            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CAMERA},1);
        }
        else {
            Toast.makeText(this, "Permission Allowed...", Toast.LENGTH_SHORT).show();
        }


    }

    public void btnClicked(View view) {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
