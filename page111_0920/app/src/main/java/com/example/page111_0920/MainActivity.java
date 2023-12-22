package com.example.page111_0920;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText edit1; Button btnToast, btnHomepage; RadioButton rdoOreo, rdoPie; ImageView ivAndroid;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); getSupportActionBar().setDisplayShowHomeEnabled(true); getSupportActionBar().setIcon(R.drawable.android13); setTitle("좀 그럴듯한 앱");
        edit1 = (EditText) findViewById(R.id.edit1); btnToast = (Button) findViewById(R.id.btnToast); btnHomepage = (Button) findViewById(R.id.btnHomepage); rdoOreo = (RadioButton) findViewById(R.id.rdoR); rdoPie = (RadioButton) findViewById(R.id.rdoS); ivAndroid = (ImageView) findViewById(R.id.ivAndroid);
        btnToast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), edit1.getText().toString(), Toast.LENGTH_SHORT).show(); }
        });
        btnHomepage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(edit1
                        .getText().toString())); startActivity(mIntent); }
        });
        rdoOreo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ivAndroid.setImageResource(R.drawable.snowcorn); }
        });
        rdoPie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ivAndroid.setImageResource(R.drawable.tiramisu); }
        });
        btnToast.setBackgroundColor(Color.LTGRAY);
        btnHomepage.setBackgroundColor(Color.LTGRAY);

        btnToast.setTextColor(Color.BLACK);
        btnHomepage.setTextColor(Color.BLACK);
    }
}