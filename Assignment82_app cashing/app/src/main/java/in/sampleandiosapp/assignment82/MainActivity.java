package in.sampleandiosapp.assignment82;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText name,age,phone,city;
    Button btnSave, btnShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         name = (EditText) findViewById(R.id.EdittxtName);
        age = (EditText) findViewById(R.id.EditTxtAge);
        phone = (EditText) findViewById(R.id.EditTxtPhone);
        city = (EditText) findViewById(R.id.EditTxtCity);
        btnSave.setOnClickListener(this);
        btnShow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.BtnSave) {
            SharedPrefManager.setStringPrefVal(MainActivity.this, "PrefName", name.toString());
            SharedPrefManager.setStringPrefVal(MainActivity.this, "PrefAge", age.toString());
            SharedPrefManager.setStringPrefVal(MainActivity.this, "PrefPhone", phone.toString());
            SharedPrefManager.setStringPrefVal(MainActivity.this, "PrefCity", city.toString());
        }
        else
        {
            String showName = SharedPrefManager.getPrefVal(getBaseContext(),"PrefName");
            String shownAge = SharedPrefManager.getPrefVal(getBaseContext(),"PrefAge");
            String showPhone = SharedPrefManager.getPrefVal(getBaseContext(),"PrefPhone");
            String showCity = SharedPrefManager.getPrefVal(getBaseContext(),"PrefCity");
            Toast toast=Toast.makeText(this, showName+shownAge+showPhone+showCity, Toast.LENGTH_SHORT);
            toast.show();

        }
    }
}
