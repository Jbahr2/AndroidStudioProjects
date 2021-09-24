package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.apache.*;
import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button one = (Button) findViewById(R.id.btn_One);
    private Button two  = (Button) findViewById(R.id.btn_Two);
    private Button three  = (Button) findViewById(R.id.btn_Three);
    private Button four  = (Button) findViewById(R.id.btn_Four);
    private Button five  = (Button) findViewById(R.id.btn_Five);
    private Button six  = (Button) findViewById(R.id.btn_Six);
    private Button seven  = (Button) findViewById(R.id.btn_Seven);
    private Button eight  = (Button) findViewById(R.id.btn_Eight);
    private Button nine  = (Button) findViewById(R.id.btn_Nine)
    private Button zero  = (Button) findViewById(R.id.btn_Zero);
    private Button delete  = (Button) findViewById(R.id.btn_Clear);
    private Button times = (Button) findViewById(R.id.btn_Times) ;
    private Button plus = (Button) findViewById(R.id.btn_Plus);
    private Button decimal = (Button) findViewById(R.id.btn_Decimal);
    private Button divide = (Button) findViewById(R.id.btn_Divide);
    private Button power = (Button) findViewById(R.id.btn_Power);
    private Button negate = (Button) findViewById(R.id.btn_Negate);
    private Button minus = (Button) findViewById(R.id.btn_Minus);
    private Button equals = (Button) findViewById(R.id.btn_Equals);
    private Button clear = (Button) findViewById(R.id.btn_Clear);
    private View txt_total = (View) findViewById(R.id.txt_Total);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setup();
        setContentView(R.layout.activity_main);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  calc('1');
            }});
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('2');
            }});
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('3');
            }});
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('4');
            }});
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('5');
            }});
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('6');
            }});
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('7');
            }});
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('8');
            }});
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('9');
            }});
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('0');
            }});
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('+');
            }});
        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('*');
            }});
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('/');
            }});
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('-');
            }});
        negate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('n');
            }});
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('^');
            }});
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('d');
            }});
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('c');
            }});
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('=');
            }});
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc('.');
            }});
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

    public void calc(Character func){
        String view = "";
        Double total;
        switch (func){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                    view += func;

                break;
            case '+':
            case '-':
            case '*':
            case '/':

                break;
            case 'd':
                removeLastChar(view);
                        break;
            default:
                break;

        }
    }

    private double getTip(Double bill, String tip){
        Double dTip = Double.parseDouble(tip);
        dTip = dTip/100;
        return (bill * dTip);
    }
    private void setup(){
    }
    public static String removeLastChar(String str) {
        return removeLastChars(str, 1);
    }

    public static String removeLastChars(String str, int chars) {
        return str.substring(0, str.length() - chars);
    }
}