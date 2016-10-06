package in.sampleandiosapp.session3_assignment1;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatCallback;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button bt_display;
    TextView tv_displayText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_display=(Button)findViewById(R.id.button);
        bt_display.setOnClickListener(this);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onClick(View view)
    {
        tv_displayText=(TextView)findViewById(R.id.textView);
        if(bt_display.getText().toString()=="@string/show_hide") {
            //tv_displayText.setBackground(null);
            bt_display.setText("Show");
        }
        else {
            bt_display.setText("Hide");
            //tv_displayText.setBackground();
        }
    }
}
