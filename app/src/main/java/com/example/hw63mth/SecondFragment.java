package com.example.hw63mth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragment extends Fragment implements ClickListerner{
private ArrayList<Model> data;
private RecyclerView recyclerView;
private CountryAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        laodData();
        recyclerView = view.findViewById(R.id.recycle_view);
        adapter = new CountryAdapter(data, this::onClick);
        recyclerView.setAdapter(adapter);
    }

    private void laodData() {
        data = new ArrayList<>();
        Bundle bundle = getArguments();
        Integer val = bundle.getInt(getString(R.string.key));
        switch (val){
            case 1:
                data.add(new Model("Kyrgyzstan", R.drawable.ic_kg));
                data.add(new Model("Uzbekistan", R.drawable.ic_uz));
                data.add(new Model("Kazakhstan", R.drawable.ic_kz));
                data.add(new Model("Korea", R.drawable.ic_kr));
                data.add(new Model("Japan", R.drawable.ic_jp));
                break;
            case 2:
                data.add(new Model("Kyrgyzstan", R.drawable.ic_kg));
                data.add(new Model("Uzbekistan", R.drawable.ic_uz));
                data.add(new Model("Kazakhstan", R.drawable.ic_kz));
                data.add(new Model("Korea", R.drawable.ic_kr));
                data.add(new Model("Japan", R.drawable.ic_jp));

                break;
            case 3:
                data.add(new Model("Kyrgyzstan", R.drawable.ic_kg));
                data.add(new Model("Uzbekistan", R.drawable.ic_uz));
                data.add(new Model("Kazakhstan", R.drawable.ic_kz));
                data.add(new Model("Korea", R.drawable.ic_kr));
                data.add(new Model("Japan", R.drawable.ic_jp));

                break;
            case 4:
                data.add(new Model("Kyrgyzstan", R.drawable.ic_kg));
                data.add(new Model("Uzbekistan", R.drawable.ic_uz));
                data.add(new Model("Kazakhstan", R.drawable.ic_kz));
                data.add(new Model("Korea", R.drawable.ic_kr));
                data.add(new Model("Japan", R.drawable.ic_jp));

                break;
            case 5:
                data.add(new Model("Kyrgyzstan", R.drawable.ic_kg));
                data.add(new Model("Uzbekistan", R.drawable.ic_uz));
                data.add(new Model("Kazakhstan", R.drawable.ic_kz));
                data.add(new Model("Korea", R.drawable.ic_kr));
                data.add(new Model("Japan", R.drawable.ic_jp));

                break;
            case 6:
                data.add(new Model("Australia", R.drawable.ic_australia));
                break;

        }

    }

    public void onClick(Model model) {
    }
}