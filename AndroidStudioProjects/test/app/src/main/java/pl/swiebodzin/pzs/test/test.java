package pl.swiebodzin.pzs.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class test extends AppCompatActivity {

    TextView clickText;
    TextView congratulationText;
    Button clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        clickText = findViewById(clickText);
        congratulationText = findViewById(congratulationText);
        clickButton = findViewById(clickButton);




    }
}
