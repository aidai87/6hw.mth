package com.example.hw63mth;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {


    private ArrayList<Model> data;
    private ClickListerner clickListerner;
    public CountryAdapter(ArrayList<Model> data, ClickListerner click) {
        this.data = data;
        this.clickListerner = click;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
    holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        private ImageView imageView;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
            imageView = itemView.findViewById(R.id.image_view);
        }

        public void bind(Model model) {
            textView.setText(model.getTextview());
            imageView.setImageResource(model.getImage_view());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickListerner.onClick(data.get(getLayoutPosition()));
                }
            });
        }
    }
}
