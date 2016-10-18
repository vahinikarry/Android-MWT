package in.sampleandiosapp.session4_assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView listView;
    String[] months ;
    ArrayAdapter<String> adapter;
    Button b_asc;
    Button b_desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_asc = (Button) findViewById(R.id.button);
        b_desc = (Button) findViewById(R.id.button2);
        b_asc.setOnClickListener(this);
        b_desc.setOnClickListener(this);

        listView = (ListView) findViewById(R.id.listView);
        months = new String[] { "January","Feb","March"};
        adapter = new ArrayAdapter<String>(this , R.layout.simple_list_item_1,months);
        listView.setAdapter(adapter);
    }
    @Override
    public void onClick(View view)
    {
        Button b=(Button)view;
        if(b.getText().toString()=="Ascending")
        {
            months = new String[] { "January","Feb","March"};
        }
        else
            {
                months = new String[] { "March","Feb","January"};
            }
        listView.setAdapter(adapter);
    }
}
