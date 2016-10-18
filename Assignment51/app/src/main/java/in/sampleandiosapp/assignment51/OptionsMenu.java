package in.sampleandiosapp.assignment51;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class OptionsMenu extends AppCompatActivity {
TextView largeTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);
        getSupportActionBar();//Step 2 - for showing action bar
        largeTxt=(TextView) findViewById(R.id.textView2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater M = getMenuInflater();
        M.inflate(R.menu.options_menu, menu);

        //  getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.Red) {
largeTxt.setTextColor(ContextCompat.getColor(this, R.color.colorRed));
            return true;
        }
        else if (id == R.id.Green) {
            largeTxt.setTextColor(ContextCompat.getColor(this, R.color.colorGreen));
            return true;
        }
            else if (id == R.id.Blue) {
                largeTxt.setTextColor(ContextCompat.getColor(this, R.color.colorBlue));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
