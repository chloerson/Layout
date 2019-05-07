package com.example.firsttry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //code that gives the button a place to go to
    //when the button is clicked it will go back to the menu page
    public void goToMenu(View view){
        Intent getMenuScreen = new Intent(this, MenuScreen.class);
        startActivity(getMenuScreen);

    }

    //code that gives the button a place to go to
    //when the button is clicked it will go back to the activities page
    public void goToActivities(View view){
        Intent getActivities = new Intent(this, ListOfActivities.class);
        startActivity(getActivities);

    }








}
