package com.example.recipe;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    Context context;
    String[] data;
    //ImageView[] images;
    int[] images; // infact the easiest way is strangely with an int array

   //this supports opening a different activity when clicking a picture
   public interface ClickedActivityFunction {
       void onClickedPic(int index);
   }
   ClickedActivityFunction clicked;


    public RecyclerAdapter(Context context, String[] data, int[] images, ClickedActivityFunction clicked){
        this.context = context;
        this.data = data;
        this.images = images;
        this.clicked = clicked;
       // this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_break_menu, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);


        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.textView.setText(data[position]);
        holder.imageView.setImageResource(images[position]);
        //holder.textView.setText(data[position]);
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "clicked on this "+data[position], Toast.LENGTH_SHORT).show();
            }
        });

//        holder.imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                clicked.onClickedPic(0);
////                final Intent intent;
////                switch (position){
////                    case 0:
////                        intent =  new Intent(context, break1.class);
////                        break;
////
////                    case 1:
////                        intent =  new Intent(context, break1.class);
////                        break;
////
////                    default:
////                        intent =  new Intent(context, break1.class);
////                        break;
////                }
////                context.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int newPosition = getAdapterPosition();
                    clicked.onClickedPic(newPosition);
                    Toast.makeText(context, "clicked on this "+data[newPosition], Toast.LENGTH_SHORT).show();


                }
            });

            textView = itemView.findViewById(R.id.title);
            imageView = itemView.findViewById(R.id.imageViews);
        }
    }



}
