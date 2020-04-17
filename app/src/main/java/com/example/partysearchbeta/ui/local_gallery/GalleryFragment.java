package com.example.partysearchbeta.ui.local_gallery;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.partysearchbeta.R;

import static com.example.partysearchbeta.R.layout.lista_servicios;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    private ListView formulario;
    private SimpleCursorAdapter cursorAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_local, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
               // textView.setText(s);
            }
        });
        muestraProveedores(root);
        return root;

        //return inflater.inflate(R.layout.activity_persona, container, false);
    }

    @Override
    public void onResume(){
        //cursorAdapter.swapCursor()
        formulario.setAdapter(cursorAdapter);
        super.onResume();

    }

    private void muestraProveedores(final View root) {

         final Cursor cursorp = null;
        String[] desde = new String[]{"nombre_servicio"};

       // SimpleCursorAdapter cursorAdapter = new SimpleCursorAdapter(getContext(),
         //    android.R.layout.simple_list_item_2,cursorp,desde,hasta,0);
        int[] hasta = new int[]{R.id.vs_nombre};
        cursorAdapter = new SimpleCursorAdapter(getContext(),
                lista_servicios, cursorp, desde, hasta, 0);
        formulario=(ListView)root.findViewById(R.id.listView_servicios);
        formulario.setAdapter(cursorAdapter);

    }




}