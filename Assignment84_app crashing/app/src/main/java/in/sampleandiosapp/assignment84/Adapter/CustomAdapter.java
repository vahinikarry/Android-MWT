package in.sampleandiosapp.assignment84.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import in.sampleandiosapp.assignment84.Model.Customlistclass;
import in.sampleandiosapp.assignment84.R;

/**
 * Created by lenovo on 10/18/2016.
 */
public class CustomAdapter extends ArrayAdapter<Customlistclass>
{
    Context ctx;
    int layout;
    ArrayList<Customlistclass> list;
    LayoutInflater inf;

    public CustomAdapter(Context ctx, int layout, ArrayList<Customlistclass> list){
        super(ctx, layout, list);
        this.ctx = ctx;
        this.layout = layout;
        this.list = list;

    }



    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Customlistclass getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup viewGroup) {
        View row = convertView;
        ViewHolder holder;
        inf = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (row == null) {
            LayoutInflater inflater = ((Activity) ctx).getLayoutInflater();
            row = inflater.inflate(layout, viewGroup, false);
            holder = new ViewHolder();
            holder.name = (TextView) row.findViewById(R.id.textView3);
            holder.phone = (TextView) row.findViewById(R.id.textView4);
            holder.dob = (TextView) row.findViewById(R.id.textView5);

            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }



        return row;
    }

    static class ViewHolder {
        // TextView imageTitle;
        TextView name;
        TextView phone;
        TextView dob;

    }
}
