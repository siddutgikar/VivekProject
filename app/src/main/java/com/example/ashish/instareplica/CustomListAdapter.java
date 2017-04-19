package com.example.ashish.instareplica;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by siddharthutgikar on 4/18/17.
 */

public class CustomListAdapter extends BaseAdapter {

    ArrayList<ImageObject>  imgObjects ;
    Context context;
    LayoutInflater layoutInflater;
    int size;

    public CustomListAdapter(ArrayList<ImageObject> _imgObjs, Context _context,int _size)
    {
        imgObjects=_imgObjs;
        context=_context;
        layoutInflater = LayoutInflater.from(context);
        size=_size;
    }

    @Override
    public int getCount() {
        return imgObjects.size();
    }

    @Override
    public Object getItem(int i) {
        return imgObjects.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        holder hold = null;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.row_item, null);
            hold = new holder();
            hold.txtName = (TextView) convertView.findViewById(R.id.tv_UserName);
            hold.imgDisp = (ImageView) convertView.findViewById(R.id.imgDisp);
            hold.imgLike = (ImageButton) convertView.findViewById(R.id.btn_like);

            convertView.setTag(hold);

        } else {
            hold = (holder) convertView.getTag();
        }
        hold.txtName.setText(imgObjects.get(position).getName());
        Picasso.with(context)
                .load(imgObjects.get(position).getUrl()).resize(size, size)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher)
                .error(R.drawable.pen64x64)
                .into(hold.imgDisp);

        return convertView;
    }

    static class holder {
        TextView txtName;
        ImageView imgDisp;
        ImageButton imgLike;

    }
}
