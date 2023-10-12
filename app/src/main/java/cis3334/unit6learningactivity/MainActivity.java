package cis3334.unit6learningactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextWidth;
    EditText editTextLength;
    Button buttonResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWidth = (EditText) findViewById(R.id.editTextWidth);
        editTextLength = (EditText) findViewById(R.id.editTextLength);
        setupButton();
    }

    private void setupButton() {
        buttonResult = findViewById(R.id.buttonResult);
        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Call the second activity
                Double width = Double.parseDouble(editTextWidth.getText().toString());
                Double length = Double.parseDouble(editTextLength.getText().toString());
                Intent secActIntent = new Intent(MainActivity.this, ResultActivity.class);
                secActIntent.putExtra("MainWidth", width);
                secActIntent.putExtra("MainLength", length);
                startActivity(secActIntent);     // if no result is returned
            }
        });
    }
}