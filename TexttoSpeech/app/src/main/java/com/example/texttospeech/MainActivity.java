package com.example.texttospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText edtText;
    Button btnSpeech;
    TextToSpeech txtToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtText = findViewById(R.id.edtText);
        btnSpeech = findViewById(R.id.btnSpeech);

        txtToSpeech = new TextToSpeech(getApplicationContext(), status -> {
            if(status != TextToSpeech.ERROR){
                txtToSpeech.setLanguage(Locale.ENGLISH);
            }
        });

        btnSpeech.setOnClickListener(V -> {
            String text = edtText.getEditableText().toString();
            if(!edtText.getEditableText().toString().equals("")) {
                Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
                txtToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
            } else {
                Toast.makeText(this, "Please type something!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void refresh(View v){
        if(!edtText.getEditableText().toString().equals("")){
            edtText.setText("");
        }
    }
}