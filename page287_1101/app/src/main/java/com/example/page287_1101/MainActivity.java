package com.example.page287_1101;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button button1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        setTitle("배경색 바꾸기");
        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        button1 = (Button) findViewById(R.id.button1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemBLACK:
                baseLayout.setBackgroundColor(Color.BLACK);
                return true;
            case R.id.itemLTGRAY:
                baseLayout.setBackgroundColor(Color.LTGRAY);
                return true;
            case R.id.itemWHITE:
                baseLayout.setBackgroundColor(Color.WHITE);
                return true;
            case R.id.subRotate:
                button1.setRotation(90);
            case R.id.subRotate2:
                button1.setRotation(180);
                return true;
            case R.id.subSize:
                button1.setScaleX(3);
                return true;
        }
        return false;
    }
}