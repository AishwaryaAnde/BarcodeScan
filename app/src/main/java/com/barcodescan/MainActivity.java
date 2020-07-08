package com.barcodescan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static TextView result;
    Button btn_scan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result =findViewById(R.id.result);
        btn_scan= findViewById(R.id.btn_scan);

        btn_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),ScanCodeActivity.class));
                /*Intent intent = new Intent(MainActivity.this,ScanCodeActivity.class);
               // startActivity(intent);

                startActivityForResult(intent,0);*/
            }
        });
    }
}
