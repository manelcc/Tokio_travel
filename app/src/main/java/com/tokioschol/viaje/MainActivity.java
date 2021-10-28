package com.tokioschol.viaje;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.tokioschol.viaje.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        listeners();
        dropdownBinding();

    }

    private void dropdownBinding() {
        String[] listFruits = getResources().getStringArray(R.array.listFruits);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,listFruits);
        binding.mainAutocomplete.setAdapter(adapter);

    }

    private void listeners() {
        binding.mainPassBtn.setOnClickListener(view -> {
            if(binding.mainUsernameInputText.getText()!=null && binding.mainUsernameInputText.getText().length()>1 && binding.mainUsernameInputText.getText().toString().equalsIgnoreCase("1234")){
                binding.mainUsernameInputlayout.setError(null);
                Toast.makeText(MainActivity.this,"ENHORABUENA",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,DataBindingExample.class));

            }else {
                binding.mainUsernameInputlayout.setError("ups, haztelo mirar");
            }
        });

    }

}