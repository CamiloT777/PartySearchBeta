
package com.example.partysearchbeta.ui.bartender;

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
        import com.example.partysearchbeta.ui.bartender.BartenderViewModel;

public class bartender extends Fragment {

    private BartenderViewModel bartenderViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bartenderViewModel =
                ViewModelProviders.of(this).get(BartenderViewModel.class);
        View root = inflater.inflate(R.layout.fragment_bartender, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        bartenderViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}