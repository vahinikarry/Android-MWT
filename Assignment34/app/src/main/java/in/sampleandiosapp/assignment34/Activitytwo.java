package in.sampleandiosapp.assignment34;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class Activitytwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlayout);
        Bundle bundle = getIntent().getExtras();
        String text= bundle.getString("stuff");
        TextView txtView = (TextView) findViewById(R.id.textView);
        txtView.setText(text);
    }
}

