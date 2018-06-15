package com.example.dell.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final   EditText num1=(EditText)findViewById(R.id.mass_text);
      final   EditText num2=(EditText)findViewById(R.id.height_text);
        Button calculate_button=(Button)findViewById(R.id.calculate_button);
       final TextView answer=(TextView)findViewById(R.id.answer_text);

        calculate_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x=Double.parseDouble(num1.getText().toString());
                double y=Double.parseDouble(num2.getText().toString());
                double result=(x)/(y*y);
                answer.setText("your BMI is "+String.valueOf(result));

            }
        });
    }
}
