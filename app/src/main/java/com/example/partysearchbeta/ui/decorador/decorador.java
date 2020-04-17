package com.example.partysearchbeta.ui.decorador;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.partysearchbeta.R;

public class decorador extends Fragment {

    private DecoradorViewModel decoradorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        decoradorViewModel =
                ViewModelProviders.of(this).get(DecoradorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_decorador, container, false);
        final TextView textView = root.findViewById(R.id.text_decorador);
        decoradorViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
