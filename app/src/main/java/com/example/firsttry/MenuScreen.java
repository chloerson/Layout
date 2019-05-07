package com.example.firsttry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
    }

    //code that gives the button a place to go to
    //when the button is clicked it will go back to the main page
    public void goBackButton(View view){
        Intent backButton = new Intent(this, MainActivity.class);
        startActivity(backButton);

    }


}
