package ru.hiddenvinnyp.safefood.foodlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }
    @Override
    public int getCount() {
        return mThumbIds.length;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;

        if (convertView == null) { // if it’s not recycled, initialize some attributes
            LayoutInflater li = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            v = li.inflate(R.layout.grid_item, null);
            TextView tv = (TextView)v.findViewById(R.id.icon_text);
            tv.setText(mTextsIds[position]);
            ImageView iv = (ImageView)v.findViewById(R.id.icon_image);
            iv.setPadding(8, 8, 8, 8);
            iv.setImageResource(mThumbIds[position]);
        } else {
            v = (View) convertView;
        }
        return v;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.bread4, R.drawable.cake7, R.drawable.carrot3, R.drawable.chicken7,
            R.drawable.eggs, R.drawable.fish2, R.drawable.food2, R.drawable.glass23,
            R.drawable.milk2, R.drawable.nachos, R.drawable.oil2, R.drawable.soup3,
            R.drawable.wheat7, R.drawable.plate7};

    // references to our texts
    private String[] mTextsIds = {"Хлеб и мучное", "Сладости", "Овощи", "Мясо и птица", "Яйца",
            "Рыба", "Соусы", "Напитки", "Молоко", "Закуски", "Жиры", "Супы", "Крупы", "Меню"};
}