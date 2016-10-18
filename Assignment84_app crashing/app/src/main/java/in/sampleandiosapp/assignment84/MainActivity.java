package in.sampleandiosapp.assignment84;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import in.sampleandiosapp.assignment84.Adapter.CustomAdapter;
import in.sampleandiosapp.assignment84.Model.Customlistclass;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    Button option_menu_btn;
    ListView listView;
    ArrayList<Customlistclass> list = new ArrayList<Customlistclass>();
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();//Step 2 - for showing action bar
        list.add(new Customlistclass("Acadgild12", "3423434", "01/02/1987"));
        list.add(new Customlistclass("Acadgild22","3423423432","01/02/1987"));
        list.add(new Customlistclass("Acadgild32","3423423432","01/02/1987"));

        listView = (ListView)findViewById(R.id.listView);

        adapter = new CustomAdapter(getApplicationContext(), R.layout.listitem, list);
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater M = getMenuInflater();
        M.inflate(R.menu.add, menu);

        //  getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();
        final CustomDialog dialog = new CustomDialog(this);
        dialog.setTitle("Add items to listview");
        dialog.setContentView(R.layout.custom);
        final EditText editedName= (EditText) dialog.findViewById(R.id.editText);
        final EditText editedPhone= (EditText) dialog.findViewById(R.id.editText2);
        final EditText editedDOB= (EditText) dialog.findViewById(R.id.editText3);
        Button dialogButton = (Button) dialog.findViewById(R.id.button);
        // if button is clicked, close the custom ingredient_dialog
        dialogButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                list.add(new Customlistclass(editedName.getText().toString(),editedPhone.getText().toString(),editedDOB.getText().toString()));
                adapter.notifyDataSetChanged();
            }
        });
        Button dialogButton2 = (Button) dialog.findViewById(R.id.button2);
        // if button is clicked, close the custom ingredient_dialog
        dialogButton2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });


        dialog.show();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

    }
}
