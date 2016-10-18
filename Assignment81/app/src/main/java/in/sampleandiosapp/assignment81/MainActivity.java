package in.sampleandiosapp.assignment81;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /** Defining a click  listener */
        android.view.View.OnClickListener settingsClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Settings.class);
                startActivity(intent);


            }
        };

        /** Defining a click  listener */
        android.view.View.OnClickListener showClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Show.class);
                startActivity(intent);
            }
        };

        /** Getting a reference to button object of the main layout */
        Button btnSettings = (Button) findViewById(R.id.button);
        btnSettings.setOnClickListener(settingsClickListener);

        /** Getting a reference to button object of the main layout */
        Button btnShow = (Button) findViewById(R.id.button2);
        btnShow.setOnClickListener(showClickListener);

    }
}
