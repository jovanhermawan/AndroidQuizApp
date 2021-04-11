package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    Button qid;
    Button qid2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qid = findViewById(R.id.answer);
        qid2 = findViewById(R.id.answer2);
    }
    public void logout(View view){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }
    public void answer(View view){
        startActivity(new Intent(getApplicationContext(),Answer.class));
        finish();
    }
    public void answer2(View view){
        startActivity(new Intent(getApplicationContext(),Answer2.class));
        finish();
    }
    public void answer3(View view){
        startActivity(new Intent(getApplicationContext(),Answer3.class));
        finish();
    }
    public void answer4(View view){
        startActivity(new Intent(getApplicationContext(),Answer4.class));
        finish();
    }
    public void answer5(View view){
        startActivity(new Intent(getApplicationContext(),Answer5.class));
        finish();
    }
}