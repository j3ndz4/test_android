package pl.swiebodzin.pzs.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textSum;
    EditText firstNumber;
    EditText lastNumber;
    Button clearButton;
    Button sumButton;
    int a, b, sum;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d( "life",  "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.firstNumber);
        lastNumber = findViewById(R.id.lastNumber);
        clearButton = findViewById(R.id.clearButton);
        sumButton = findViewById(R.id.sumButton);
        textSum = findViewById(R.id.textSum);

        //ctrl+shift+space - pokazuje podpowiedzi
        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a = Integer.parseInt(firstNumber.getText().toString());
                //String firstNumberString = firstNumber.getText().toString();
                //a=Integer.parseInt(firstNumberString);
                b = Integer.parseInt(lastNumber.getText().toString());

                sum = getSum(a, b);

                textSum.setText(String.valueOf(sum));

            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clear();
            }
        });




    }

    private void clear()
    {
        textSum.setText("");
        firstNumber.setText("");
        lastNumber.setText("");
    }

    //public - metoda
    public int getSum(int number1, int number2){


        return number1 + number2;
    }
}


