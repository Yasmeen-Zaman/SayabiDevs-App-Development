package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText number1, number2,result;
    int num1;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         number1 = findViewById(R.id.edtNumber1);
         number2 = findViewById(R.id.edtNumber2);
         result =findViewById(R.id.edtResult);
//        Button add = findViewById(R.id.add);
//        Button subtract = findViewById(R.id.subtract);
//        Button multiply = findViewById(R.id.multiply);
//        Button divide = findViewById(R.id.divide);

//        add.setOnClickListener(v -> {
//            if(number1.getEditableText().toString()==""){
//                number1.setError("Field must be filled in.");
//            }else if (number2.getEditableText().toString()==""){
//                number2.setError("Field must be filled in.");
//            } else {
//                num1 = Integer.parseInt(number1.getEditableText().toString());
//                num2 = Integer.parseInt(number2.getEditableText().toString());
//                result.setText(""+(num1 + num2));
//            }
//        });
//
//        subtract.setOnClickListener(v -> {
//            if(number1.getEditableText().toString()==""){
//                number1.setError("Field must be filled in.");
//            }else if (number2.getEditableText().toString()==""){
//                number2.setError("Field must be filled in.");
//            } else {
//                num1 = Integer.parseInt(number1.getEditableText().toString());
//                num2 = Integer.parseInt(number2.getEditableText().toString());
//                result.setText(""+(num1 - num2));
//            }
//        });
//
//        multiply.setOnClickListener(v -> {
//            if(number1.getEditableText().toString()==""){
//                number1.setError("Field must be filled in.");
//            }else if (number2.getEditableText().toString()==""){
//                number2.setError("Field must be filled in.");
//            } else {
//                num1 = Integer.parseInt(number1.getEditableText().toString());
//                num2 = Integer.parseInt(number2.getEditableText().toString());
//                result.setText(""+(num1 * num2));
//            }
//        });
//
//        divide.setOnClickListener(v -> {
//            if(number1.getEditableText().toString()==""){
//                number1.setError("Field must be filled in.");
//                return;
//            }else if (number2.getEditableText().toString()==""){
//                number2.setError("Field must be filled in.");
//                return;
//            } else {
//                num1 = Integer.parseInt(number1.getEditableText().toString());
//                num2 = Integer.parseInt(number2.getEditableText().toString());
//                result.setText(""+(num1 / num2));
//
//            }
//        });
    }

    public void addition(View v){
        num1 = Integer.parseInt(number1.getEditableText().toString());
        num2 = Integer.parseInt(number2.getEditableText().toString());
        result.setText(""+(num1 + num2));
    }

    public void subtraction(View v){
        num1 = Integer.parseInt(number1.getEditableText().toString());
        num2 = Integer.parseInt(number2.getEditableText().toString());
        result.setText(""+(num1 - num2));
    }

    public void multiplication(View v){
        num1 = Integer.parseInt(number1.getEditableText().toString());
        num2 = Integer.parseInt(number2.getEditableText().toString());
        result.setText(""+(num1 * num2));
    }

    public void division(View v){
        num1 = Integer.parseInt(number1.getEditableText().toString());
        num2 = Integer.parseInt(number2.getEditableText().toString());
        double div = num1 / (num2 * 1.0);
        result.setText(""+div);

//        Float op1 = Float.parseFloat(number1.getEditableText().toString());
//        Float op2 = Float.parseFloat(number1.getEditableText().toString());
//        result.setText(""+(op1 / op2));
    }

    public void reset(View v){
        number1.setText("0");
        number2.setText("0");
        result.setText("0");
    }
}