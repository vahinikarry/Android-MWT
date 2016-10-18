package in.sampleandiosapp.assignment84;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by lenovo on 10/18/2016.
 */
public class CustomDialog extends Dialog implements View.OnClickListener
{
    Button btnsave, btncancel;
    EditText name,phonenumber,dateofbirth;

    public CustomDialog(Context context) {
        super(context);
    }
    CustomDialog d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom);
        btnsave = (Button) findViewById(R.id.button);
        btncancel=(Button) findViewById(R.id.button2);
        name = (EditText) findViewById(R.id.editText);
        phonenumber = (EditText) findViewById(R.id.editText2);
        dateofbirth = (EditText) findViewById(R.id.editText3);
        d = new CustomDialog(getContext());

        btnsave.setOnClickListener(this);
        this.setOnDismissListener(new OnDismissListener() {

            @Override
            public void onDismiss(DialogInterface dialog) {
                // TODO Auto-generated method stub
                //String result = d.getResult();
                //if (result.equals("")) {
                    //Toast.makeText(this, "Action cancelled", Toast.LENGTH_LONG).show();
               // } else {
               //     et.append("\n" + result);
               // }
            }
        });
    }


    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if(v == btnsave)
        {



        }
    }
}

