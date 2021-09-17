package com.example.assignment2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var Button one = (Button) findViewById(R.id.btn_One);
  /*  private var Button two;
    private var Button three;
    private var Button four;
    private var Button five;
    private var Button six;
    private var Button seven;
    private var Button eight;
    private var Button nine;
    private var Button zero;
    private var Button back;
    private var Button result;
    private var Button round;
    private var Button decimal;*/
    private var TextView total;
    private var TextView tip;

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        one = (Button) findViewById(R.id.btn_One);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}