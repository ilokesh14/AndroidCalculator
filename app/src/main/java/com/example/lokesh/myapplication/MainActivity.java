package com.example.lokesh.myapplication;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView en1 ;
    TextView en2 ;
    TextView answer ;
    EditText in1 ;
    EditText in2 ;
    Button add ;
    Button sub ;
    Button mul ;
    Button div ;

    double divider = 0;
    double multiplier = 0 ;
    double subtractor = 0 ;
    double adder = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        en1 = (TextView) findViewById(R.id.en1) ;
        en2 = (TextView) findViewById(R.id.en2) ;
        in1 = (EditText) findViewById(R.id.in1) ;
        in2 = (EditText) findViewById(R.id.in2) ;
        add = (Button) findViewById(R.id.add) ;
        sub = (Button) findViewById(R.id.sub) ;
        mul = (Button) findViewById(R.id.mul) ;
        div = (Button) findViewById(R.id.div) ;
        answer = (TextView) findViewById(R.id.answer) ;

        add.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            if(!in1.getText().toString().equals("") && !in2.getText().toString().equals("") ) {
                adder = (Double.parseDouble(in1.getText().toString()) + Double.parseDouble(in2.getText().toString()));
                answer.setText("Answer is " + Double.toString(adder));
                answer.setTextColor(Color.DKGRAY);
            }
            else {
                answer.setText(R.string.error);
                answer.setTextColor(Color.RED);
            }
        }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!in1.getText().toString().equals("") && !in2.getText().toString().equals("") ) {
                    subtractor = (Double.parseDouble(in1.getText().toString()) - Double.parseDouble(in2.getText().toString()));
                    answer.setText("Answer is "+Double.toString(subtractor));
                    answer.setTextColor(Color.DKGRAY);
                }
                else {
                    answer.setText(R.string.error);
                    answer.setTextColor(Color.RED);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!in1.getText().toString().equals("") && !in2.getText().toString().equals("")) {
                    multiplier = (Double.parseDouble(in1.getText().toString()) * Double.parseDouble(in2.getText().toString()));
                    answer.setText("Answer is "+Double.toString(multiplier));
                    answer.setTextColor(Color.DKGRAY);
                }
                else {
                    answer.setText(R.string.error);
                    answer.setTextColor(Color.RED);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!in1.getText().toString().equals("") && !in2.getText().toString().equals("")) {
                    divider = (Double.parseDouble(in1.getText().toString()) % Double.parseDouble(in2.getText().toString()));
                    answer.setText("Answer is "+Double.toString(divider));
                    answer.setTextColor(Color.DKGRAY);
                }
                else {
                    answer.setText(R.string.error);
                    answer.setTextColor(Color.RED);
                }
            }
        });

    }
}
