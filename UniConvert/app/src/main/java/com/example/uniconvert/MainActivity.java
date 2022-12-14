package com.example.uniconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    DecimalFormat df= new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText=findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,"Hi click listener worked!",Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();

                int kg = Integer.parseInt(s);
                double pound = 2.20462*kg;
                pound= Double.parseDouble(df.format(pound));
                textView.setText("The corresponding value of pounds  is "+pound);
            }
        });

    }

}