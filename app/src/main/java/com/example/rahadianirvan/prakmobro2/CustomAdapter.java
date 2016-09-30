package com.example.rahadianirvan.prakmobro2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Rahadian Irvan on 9/30/2016.
 */
public class CustomAdapter extends BaseAdapter{
    private Activity activity;
    private int[] gambar;
    private String[] deskripsi;
    private LayoutInflater inflater;

    public CustomAdapter(Activity activity, int[] gambar,
                         String [] deskripsi){
        this.activity = activity;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
    }


    @Override
    public int getCount() {
        return deskripsi.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder{
        TextView textDeskripsi;
        ImageView imageGambar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();

        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.nama_android, null);

        //set text deskription
        holder.textDeskripsi = (TextView) convertView.findViewById(R.id.txt_deskripsi);
        holder.textDeskripsi.setText(deskripsi[position]);

        //set gambar
        holder.imageGambar = (ImageView) convertView.findViewById(R.id.img_gambar);
        holder.imageGambar.setImageResource(gambar[position]);
        return convertView;
    }
}
