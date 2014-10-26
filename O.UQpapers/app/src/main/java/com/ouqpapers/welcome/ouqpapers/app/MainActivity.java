package com.ouqpapers.welcome.ouqpapers.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);
        Thread logoTimer = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                    Intent menuIntent = new Intent(MainActivity.this, Menu.class);
                    startActivity(menuIntent);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    finish();
                }
            }


        };
        logoTimer.start();

    }
}