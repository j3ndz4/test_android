package pl.swiebodzin.pzs.congratulation_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class congratulation_app extends AppCompatActivity {

    TextView clickText;
    TextView congratulationText;
    Button clickButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulation_app);

        clickText = findViewById(R.id.clickText); //dodawać R.id. aby nie wystąpił błąd
        congratulationText = findViewById(R.id.congratulationText);
        clickButton = findViewById(R.id.clickButton);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                brawo();
            }
        });
    }

    private void brawo()
    {
        congratulationText.setText("BRAWO!");
    }
}
