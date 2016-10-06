package in.sampleandiosapp.session3_assignment2;

import android.app.SearchManager;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSearch = (Button) findViewById(R.id.button);
        btnSearch.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent search = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI );
                startActivity(search);
            }
        });
    }
}
