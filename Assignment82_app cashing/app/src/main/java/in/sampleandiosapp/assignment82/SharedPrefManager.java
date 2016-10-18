package in.sampleandiosapp.assignment82;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by lenovo on 10/18/2016.
 */
public class SharedPrefManager {
    public static SharedPreferences getSharedPref(Context mContext) {
        SharedPreferences pref = mContext.getSharedPreferences("Information", Context.MODE_PRIVATE);
        return pref;
    }

    public static void setStringPrefVal(Context mContext, String key, String value) {
        SharedPreferences.Editor edit = getSharedPref(mContext).edit();
        edit.putString(key, value);
        edit.commit();
    }



    public static String getPrefVal(Context mContext, String key) {
        SharedPreferences pref = getSharedPref(mContext);
        String val = "";
        if(pref.contains(key))
            val = pref.getString(key, "");
        else
            val = "";
        return val;
    }


}