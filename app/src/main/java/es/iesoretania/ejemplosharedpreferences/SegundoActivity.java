package es.iesoretania.ejemplosharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import es.iesoretania.ejemplosharedpreferences.databinding.ActivitySegundoBinding;


public class SegundoActivity extends AppCompatActivity {
    private ActivitySegundoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySegundoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SharedPreferences sharedPreferences =
                getSharedPreferences("misPreferencias", Context.MODE_PRIVATE);

        binding.idTextViewTexto.setText(sharedPreferences.getString("texto", ""));
        binding.idTextViewNumero.setText(
                String.valueOf(sharedPreferences.getInt("numero", 0)));
    }
}