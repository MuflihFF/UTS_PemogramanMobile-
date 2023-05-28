package com.uts_mufhlihfurqonnudinfahri;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomGridView extends BaseAdapter {

    private Context mContext;
    private final int[] gridViewImage;
    private final String[] gridViewText;

    public CustomGridView(Context mContext, int[] gridViewImage, String[] gridViewText) {
        this.mContext = mContext;
        this.gridViewImage = gridViewImage;
        this.gridViewText = gridViewText;
    }


    @Override
    public int getCount() {
        return gridViewText.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View gridViewlayout;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            gridViewlayout = new View(mContext);
            gridViewlayout = inflater.inflate(R.layout.grid_layout, null);
            TextView textView = gridViewlayout.findViewById(R.id.gridText);
            ImageView imageView = gridViewlayout.findViewById(R.id.gridImage);
            textView.setText(gridViewText[position]);
            imageView.setImageResource(gridViewImage[position]);
        } else {
            gridViewlayout = (View) convertView;
        }

        return gridViewlayout;
    }
}