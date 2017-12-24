package com.example.exampleapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button  btn_Exit, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPlus, buttonMinus, buttonMul, buttonDiv, buttonRavno, buttonC;
    public TextView resSum;

    String operation = "";
    double savedValue = 0;
    double secondValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Калькулятор");
        addListenerOnButton();
    }


    public void addListenerOnButton(){
        btn_Exit = (Button)findViewById(R.id.Exit);
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonDiv = (Button)findViewById(R.id.buttonDiv);
        buttonPlus = (Button)findViewById(R.id.buttonPlus);
        buttonMinus = (Button)findViewById(R.id.buttonMinus);
        buttonMul = (Button)findViewById(R.id.buttonMul);
        buttonRavno = (Button)findViewById(R.id.buttonRavno);
        buttonC = (Button)findViewById(R.id.buttonC);





        btn_Exit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 AlertDialog.Builder a_exit = new AlertDialog.Builder(MainActivity.this);
                 a_exit.setMessage("Закрыть приложение?").setCancelable(false).setPositiveButton("Да", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                         finish();
                     }
                 }).setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                         dialog.cancel();
                     }
                 });
                 AlertDialog exit = a_exit.create();
                 exit.setTitle("Закрытие приложения");
                 exit.show();
             }
         });


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 resSum = (TextView)findViewById(R.id.Output);
                 resSum.setText(resSum.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);
                resSum.setText(resSum.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);
                resSum.setText(resSum.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);
                resSum.setText(resSum.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);
                resSum.setText(resSum.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);
                resSum.setText(resSum.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);
                resSum.setText(resSum.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);
                resSum.setText(resSum.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);
                resSum.setText(resSum.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);
                resSum.setText(resSum.getText()+"9");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);

                savedValue = Double.parseDouble(resSum.getText().toString());
                resSum.setText("");
                operation = "+";
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);

                savedValue = Double.parseDouble(resSum.getText().toString());
                resSum.setText("");
                operation = "-";
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);

                savedValue = Double.parseDouble(resSum.getText().toString());
                operation = "*";
                resSum.setText(Double.toString(savedValue) + operation );

            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);

                savedValue = Double.parseDouble(resSum.getText().toString());
                resSum.setText("");
                operation = "/";
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);
                savedValue = 0;
                resSum.setText("");
                operation ="";
            }
        });

        buttonRavno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resSum = (TextView)findViewById(R.id.Output);
                double secondValue = Double.parseDouble(resSum.getText().toString());

                if (operation == "+"){
                    resSum.setText((savedValue+secondValue)+"");

                }

                if (operation == "-"){
                    resSum.setText((savedValue-secondValue)+"");

                }
                if (operation == "*"){
                    resSum.setText("");
                    resSum.setText((savedValue*secondValue)+"");

                }
                if (operation == "/" && secondValue == 0) {
                    resSum.setText("Error");
                }else if (operation == "/" && secondValue != 0){
                    resSum.setText((savedValue/secondValue)+"");

                }
                savedValue = 0;
                operation ="";
            }
        });

    }






}
