package com.buenafe.apriljoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LinearActivity extends AppCompatActivity {

    @Override
       protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.linear);
           setTitle("Linear Layout");


       /*protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.relative);
            setTitle("Relative Layout");
        */

        /*protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.constraint);
            setTitle("Constraint Layout");
         */
    }
}
