package in.sampleandiosapp.assignment81;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

/**
 * Created by lenovo on 10/17/2016.
 */
public class Show extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show);

        /** Getting the references to the textview object of the show layout */
        TextView tv_checkbox_preference1 = (TextView) findViewById(R.id.tv_checkbox_preference1);

        TextView tv_edittext_preference1 = (TextView) findViewById(R.id.tv_edittext_preference1);

        TextView tv_edittext_preference2 = (TextView) findViewById(R.id.tv_edittext_preference2);


        /** Getting the shared preference object that points to preferences resource available in this context */
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        /** Getting the values stored in the shared object via preference activity */
        boolean cb1 = sp.getBoolean("cbp_checkbox_preference1", false);

        String edit1 = sp.getString("etp_edittext_preference1","No text data");

        String edit2 = sp.getString("etp_edittext_preference2","No text data");

        /** Setting the values on textview objects to display in the ShowActivity */
        tv_checkbox_preference1.setText("Checkbox Preference1 : " + Boolean.toString(cb1));

        tv_edittext_preference1.setText("EditText Preference1 :" + edit1);

        tv_edittext_preference2.setText("EditText Preference2 :" + edit2);
    }
}