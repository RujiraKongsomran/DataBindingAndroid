package com.rujira.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.rujira.databinding.databinding.ActivityMainBinding;
import com.rujira.databinding.model.ParcelModel;
import com.rujira.databinding.model.UserModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserModel user = new UserModel();
        user.setFirstName("Sim");
        user.setLastName("Card");
        user.setAge(27);

        ParcelModel parcelModel = new ParcelModel();
        parcelModel.setParcelName("T-Shirt");
        parcelModel.setParcelType(23);
        parcelModel.setParcelPrice(590);

        binding.setData(user);
        binding.setParcel(parcelModel);
    }
}
