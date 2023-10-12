package cis3334.unit6learningactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView textViewResult;
    Double width;
    Double length;
    Button buttonFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewResult = (TextView) findViewById(R.id.textViewResult);

        Bundle extras = getIntent().getExtras();
        width = extras.getDouble("MainWidth");
        length = extras.getDouble("MainLength");
        textViewResult.setText("Width is " + width + " and length is " + length + " and flooring needed is " + length*width);
        setupFinishButton();

    }

    private void setupFinishButton() {
        buttonFinish = findViewById(R.id.buttonFinish);
        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}