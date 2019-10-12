package com.rujira.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.rujira.databinding.databinding.ActivityMainBinding;
import com.rujira.databinding.model.UserModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserModel user = new UserModel();
        user.setFirstName("Jedsada");
        user.setLastName("Tiwongvorakul");
        user.setAge(22);

        binding.setData(user);
    }
}
