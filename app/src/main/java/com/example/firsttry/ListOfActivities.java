package com.example.firsttry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListOfActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_activities);
    }


    public void goBackButton2(View view){
        Intent backButton2 = new Intent(this, MainActivity.class);
        startActivity(backButton2);

    }
}
