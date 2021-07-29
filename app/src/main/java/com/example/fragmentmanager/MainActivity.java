package com.example.fragmentmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment fragment = null;
                if (v == findViewById(R.id.button1)){
                    fragment = new Fragment();
                } else {
                    fragment = new Fragment();
                }
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                //transaction.replace(R.id.output, fragment);


                transaction.commit();
            }
        };
            Button btn1 = (Button) findViewById(R.id.button1);

        btn1.setOnClickListener(listener);
            Button btn2 = (Button) findViewById(R.id.button2);
           // btn2.setOnClickListener(listener);


    }
}
