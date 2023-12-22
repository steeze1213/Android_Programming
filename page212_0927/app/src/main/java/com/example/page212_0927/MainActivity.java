package com.example.page212_0927;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); getSupportActionBar().setDisplayShowHomeEnabled(true);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baseLayout = new LinearLayout(this); baseLayout.setOrientation(LinearLayout.VERTICAL); baseLayout.setBackgroundColor(Color.rgb(0, 255, 0)); setContentView(baseLayout, params);
        Button btn = new Button(this); btn.setText("버튼입니다"); btn.setBackgroundColor(Color.MAGENTA); baseLayout.addView(btn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "코드로 생성한 버튼입니다",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}