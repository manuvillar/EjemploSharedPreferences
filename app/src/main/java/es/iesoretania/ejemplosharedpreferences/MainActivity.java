package es.iesoretania.ejemplosharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import es.iesoretania.ejemplosharedpreferences.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void accion(View view) {
        SharedPreferences sharedPref =
                getSharedPreferences("misPreferencias", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("texto", binding.idEditTexto.getText().toString());
        editor.putInt("numero", Integer.parseInt(binding.idEditNumero.getText().toString()));
        editor.apply();

        Intent intent = new Intent(this, SegundoActivity.class);
        startActivity(intent);
    }
}