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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);
        getSupportActionBar();//Step 2 - for showing action bar

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

        if (id == R.id.Computer) {
            Toast.makeText(getApplicationContext(), "clicked on Computer", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (id == R.id.Gamepad) {
            Toast.makeText(getApplicationContext(), "clicked on Gamepad", Toast.LENGTH_LONG).show();
            return true;
        }
            else if (id == R.id.Camera) {
            Toast.makeText(getApplicationContext(), "clicked on Camera", Toast.LENGTH_LONG).show();
                return true;
        }
        else if (id == R.id.Video) {
            Toast.makeText(getApplicationContext(), "clicked on Video", Toast.LENGTH_LONG).show();
            return true;
        }
        else if (id == R.id.Email) {
            Toast.makeText(getApplicationContext(), "clicked on Email", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
