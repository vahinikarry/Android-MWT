package in.sampleandiosapp.assignment53;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

import in.sampleandiosapp.assignment53.Adapter.CustomlistAdapter;
import in.sampleandiosapp.assignment53.Model.TwoTxtCustomView;

public class MainActivity extends AppCompatActivity {
    private static final int MENU_ID_01 = 100;
    private static final int MENU_ID_02 = 101;
    ListView list;
    CustomlistAdapter adapter;
    public MainActivity CustomListView = null;
    public ArrayList<TwoTxtCustomView> CustomListViewValuesArr = new ArrayList<TwoTxtCustomView>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListView = this;

        /******** Take some data in Arraylist ( CustomListViewValuesArr ) ***********/
        setListData();

        Resources res = getResources();
        list = (ListView) findViewById(R.id.listView);  // List defined in XML ( See Below )

        /**************** Create Custom Adapter *********/
        adapter = new CustomlistAdapter(CustomListView, CustomListViewValuesArr, res);
        list.setAdapter(adapter);
        // Register the ListView  for Context menu
        registerForContextMenu(list);
         }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select the Action");
        menu.add(0, MENU_ID_01, 2, "Call");//groupId, itemId, order, title
        menu.add(0, MENU_ID_02, 1, "Send Sms");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == MENU_ID_01 && item.getGroupId() == 0) {
            //Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "34234234"));
            // startActivity(intent);
            //Toast.makeText(getApplicationContext(),"Clicked on " +item.getGroupId()+"..."+item.getItemId(),Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == MENU_ID_02 && item.getGroupId() == 0) {
            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
            smsIntent.setType("vnd.android-dir/mms-sms");
            smsIntent.putExtra("address", "12125551212");
            smsIntent.putExtra("sms_body", "Body of Message");
            startActivity(smsIntent);
            // Toast.makeText(getApplicationContext(),"Clicked on " +item.getGroupId()+"..."+item.getItemId(),Toast.LENGTH_LONG).show();
        } else {
            return false;
        }
        return true;
    }

    /******
     * Function to set data in ArrayList
     *************/
    public void setListData() {

        for (int i = 0; i < 11; i++) {

            final TwoTxtCustomView sched = new TwoTxtCustomView();

            /******* Firstly take data in model object ******/
            sched.setPersonNameName("Person " + i);
            sched.setPhonenumber("Phonenumber" + i);

            /******** Take Model Object in ArrayList **********/
            CustomListViewValuesArr.add(sched);
        }

    }

    /*****************
     * This function used by adapter
     ****************/
    public void onItemClick(int mPosition) {
        TwoTxtCustomView tempValues = (TwoTxtCustomView) CustomListViewValuesArr.get(mPosition);


        // SHOW ALERT

        // Register the ListView  for Context menu
        registerForContextMenu(list);
    }


}

