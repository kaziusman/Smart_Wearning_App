package com.example.start_app_slider.Home.Winter_items;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.start_app_slider.Home.Featured_items.featured_Item_Model_Class;

import com.example.start_app_slider.R;

import java.util.ArrayList;

public class winter_item_adapter extends RecyclerView.Adapter<winter_item_adapter.viewHolder> {

    Context context;
    ArrayList<featured_Item_Model_Class> arrayList;

    public winter_item_adapter(Context context, ArrayList<featured_Item_Model_Class> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public winter_item_adapter.viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.winter_item_model, viewGroup, false);
        return new winter_item_adapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(winter_item_adapter.viewHolder viewHolder, int position) {
        viewHolder.price.setText(arrayList.get(position).getPrice());
        viewHolder.desc.setText(arrayList.get(position).getDesc());
        viewHolder.image.setImageResource(arrayList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView price;
        TextView desc;
        CardView itemcard;

        public viewHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.winter_item_pic);
            price = itemView.findViewById(R.id.winter_item_price);
            desc = itemView.findViewById(R.id.winter_item_title);
            itemcard= itemView.findViewById(R.id.winter_itemcard);
            itemcard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),price.getText().toString(), Toast.LENGTH_SHORT).show();

                }
            });

        }
    }
}
