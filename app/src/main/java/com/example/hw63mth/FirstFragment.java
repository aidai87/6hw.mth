package com.example.hw63mth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw63mth.R;

import java.util.ArrayList;

public class FirstFragment extends Fragment implements ClickListerner {
    private ArrayList<Model> data;
    private CountryAdapter adapter;
    private RecyclerView recyclerView;
    




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
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
        data.add(new Model("Asia", R.drawable.ic_asia, 1));
        data.add(new Model("Europa", R.drawable.ic_europa, 2));
        data.add(new Model("Africa", R.drawable.ic_africa, 3));
        data.add(new Model("North America", R.drawable.ic_nourth_america, 4));
        data.add(new Model("South America", R.drawable.ic_south_america, 5));
        data.add(new Model("Australia", R.drawable.ic_australia, 6));
    }

    @Override
    public void onClick(Model model) {
        Bundle bundle = new Bundle();
        bundle.putInt(getString(R.string.key), model.getKeyId());
        Fragment fragment = new SecondFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.container, fragment).addToBackStack(null).commit();

    }
}