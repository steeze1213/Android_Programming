package com.example.baseapp0913;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //1) 위젯 변수 선언
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2) 변수에 activity_main.xml 파일의 위젯 id 대입
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Toast.makeText(getApplicationContext(),"버튼을 눌렀어요",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}