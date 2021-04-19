package ru.developer.android.runWidgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import ru.developer.android.R;

public class AdapterViewFlipper extends BaseAdapter {

    private final int[] images;
    private final String[] texts;
    private final LayoutInflater inflater;

    public AdapterViewFlipper(Context context, int[] images, String[] texts) {
        this.images = images;
        this.texts = texts;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return texts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.list_item,null);
        TextView textView = convertView.findViewById(R.id.textView);
        ImageView imageView = convertView.findViewById(R.id.image);
        textView.setText(texts[position]);
        imageView.setImageResource(images[position]);

        return convertView;
    }
}
