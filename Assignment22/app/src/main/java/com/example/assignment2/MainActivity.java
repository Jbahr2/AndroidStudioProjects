package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    /*private var Button one = (Button) findViewById(R.id.btn_One);
    private var Button two;
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
    private var Button decimal; */
    private Button total;
    private Button round;
    private TextView txt_total;
    private TextView txt_tip;
    private TextInputEditText txt_bill;
    private TextInputEditText txt_pTip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setup();
        setContentView(R.layout.activity_main);
        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bill = txt_bill.getText().toString();
                Double dBill = Double.parseDouble(bill);
                double totalint = getTip(dBill, txt_pTip.getText().toString());
                dBill = dBill + totalint;
                total.setText(Integer.toString((int)Math.round(dBill)));
                total.setText(Integer.toString((int)totalint));
            }});
        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bill = txt_bill.getText().toString();
                Double dBill = Double.parseDouble(bill);
                double totalint = getTip(dBill, txt_pTip.getText().toString());
                dBill = dBill + (int)Math.round(totalint);
                total.setText(Integer.toString((int)Math.round(dBill)));
                total.setText(Integer.toString((int)totalint));
            }});
    }


    private double getTip(Double bill, String tip){
        Double dTip = Double.parseDouble(tip);
        dTip = dTip/100;
        return (bill * dTip);
    }
    private void setup(){
        total = (Button) findViewById(R.id.btn_Total);
        round = (Button) findViewById(R.id.btn_Round);
        txt_total = (TextView) findViewById(R.id.txt_Total);
        txt_tip = (TextView) findViewById(R.id.txt_Tip);
        txt_bill = (TextInputEditText) findViewById(R.id.txt_Bill);
        txt_pTip = (TextInputEditText) findViewById(R.id.txt_Ptip);
    }
}