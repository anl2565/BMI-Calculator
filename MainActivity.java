package edu.mecc.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtOne;
    TextView txtTwo;
    TextView txtThree;
    EditText weight1;
    EditText inches;
    Button btnCalculate;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOne =(TextView)findViewById(R.id.txtOne);
        txtTwo =(TextView)findViewById(R.id.txtTwo);
        weight1 =(EditText)findViewById(R.id.weight1);
        inches =(EditText)findViewById(R.id.inches);
        btnCalculate =(Button)findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight;
                double height;
                double bmi;

                weight = Double.parseDouble(weight1.getText().toString());
                height = Double.parseDouble(inches.getText().toString());

                bmi= 703*(weight/(height*height));


                if (bmi<18.5){
                    Toast.makeText(getApplicationContext(),"You are underweight! " + bmi,Toast.LENGTH_LONG).show();
                }
                else if(bmi>=18.5 && bmi<= 24.9){
                    Toast.makeText(getApplicationContext(), "You are normal weight! " + bmi, Toast.LENGTH_LONG).show();
                }
                else if(bmi>=25.0 && bmi<=29.9){
                    Toast.makeText(getApplicationContext(), "You are overweight! " +bmi, Toast.LENGTH_LONG).show();
                }
                else if(bmi>=30.0){
                    Toast.makeText(getApplicationContext(), "You are obese! "+bmi, Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Please enter valid value" +bmi, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
