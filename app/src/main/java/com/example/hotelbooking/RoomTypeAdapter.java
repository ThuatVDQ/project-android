package com.example.hotelbooking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RoomTypeAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<RoomType> roomTypeList;

    public RoomTypeAdapter(Context context, int layout, List<RoomType> roomTypeList) {
        this.context = context;
        this.layout = layout;
        this.roomTypeList = roomTypeList;
    }

    @Override
    public int getCount() {
        return roomTypeList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //khởi tạo viewholder
        ViewHolder viewHolder;
        //lấy context
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //gọi view chứa layout
            view = inflater.inflate(layout, null);
            //ánh xạ view
            viewHolder = new ViewHolder();
            viewHolder.image = (ImageView) view.findViewById(R.id.textViewTen);
            viewHolder.type = (TextView) view.findViewById(R.id.textViewMau);
            viewHolder.des = (TextView) view.findViewById(R.id.textViewMau);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        //gán giá trị
        RoomType roomType = roomTypeList.get(i);
        viewHolder.image.setImageResource(roomType.getImage());
        viewHolder.type.setText(roomType.getType());
        viewHolder.des.setText(roomType.getDes());
        //trả về view
        return view;
    }

    private class ViewHolder {

        public ViewHolder() {
        }

        public ViewHolder(ImageView image, TextView type, TextView des) {
            this.image = image;
            this.type = type;
            this.des = des;
        }
        ImageView image;
        TextView type, des;

        public ImageView getImage() {
            return image;
        }

        public void setImage(ImageView image) {
            this.image = image;
        }

        public TextView getType() {
            return type;
        }

        public void setType(TextView type) {
            this.type = type;
        }

        public TextView getDes() {
            return des;
        }

        public void setDes(TextView des) {
            this.des = des;
        }
    }
}
