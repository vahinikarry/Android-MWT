package in.sampleandiosapp.session4_assignment2;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.ClipData;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


import Adapter.AdapterClass;
import Model.NamePhone;


public class MainActivity extends AppCompatActivity {
    // declare class variables
    private ArrayList<NamePhone> m_parts = new ArrayList<NamePhone>();
    private AdapterClass m_adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        // instantiate our ItemAdapter class
        //m_adapter = new AdapterClass(this, R.layout.list_item, m_parts);
        //setListAdapter(m_adapter);
        //listView.setAdapter(m_adapter);

                m_parts.add(new NamePhone("Name1", 1231231));
                m_parts.add(new NamePhone("Name2", 23423432));

                m_adapter = new AdapterClass(MainActivity.this, R.layout.list_item, m_parts);

                // display the list.
                //setListAdapter(m_adapter);
                listView.setAdapter(m_adapter);
            }
        }


