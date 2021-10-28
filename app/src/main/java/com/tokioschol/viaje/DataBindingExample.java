package com.tokioschol.viaje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tokioschol.viaje.databinding.ActivityDataBindingExampleBinding;
import com.tokioschol.viaje.domain.User;

public class DataBindingExample extends AppCompatActivity {

    private ActivityDataBindingExampleBinding dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBinding = ActivityDataBindingExampleBinding.inflate(getLayoutInflater());
        setContentView(dataBinding.getRoot());
        //generamos codigo llamamos a un servicio y obten el usuario.
        User user = new User("Manuel","cabezas",20);



        dataBinding.setUser(user);
    }
}