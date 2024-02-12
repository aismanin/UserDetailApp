package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.model.Users;
import com.example.myapplication.room.UserDataTable;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding ui;

    MyViewModel vm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        vm = new ViewModelProvider(this).get(MyViewModel.class);

        getDataFromServer();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, new UserListFragment());
        transaction.commit();

    }


    void getDataFromServer(){

        vm.fetchDataFromServer(MainActivity.this).observe(MainActivity.this, new Observer<List<Users>>() {
            @Override
            public void onChanged(List<Users> usersList) {
                vm.deleteUserData(MainActivity.this);   //delete previous data

                for(Users users: usersList){

                    UserDataTable data = new UserDataTable();

                    data.setId(users.getId());
                    data.setFirstName(users.getFirstName());
                    data.setLastName(users.getLastName());
                    data.setMaidenName(users.getMaidenName());
                    data.setAge(users.getAge());
                    data.setGender(users.getGender());
                    data.setEmail(users.getEmail());
                    data.setPhone(users.getPhone());
                    data.setPassword(users.getPassword());
                    data.setBirthDate(users.getBirthDate());
                    data.setImage(users.getImage());
                    data.setBloodGroup(users.getBloodGroup());
                    data.setHeight(users.getHeight());
                    data.setWeight(users.getWeight());
                    data.setEyeColor(users.getEyeColor());
                    data.setDomain(users.getDomain());
                    data.setIp(users.getIp());
                    data.setMacAddress(users.getMacAddress());
                    data.setUniversity(users.getUniversity());
                    data.setEin(users.getEin());
                    data.setSsn(users.getSsn());

                    vm.insertUserData(MainActivity.this, data);
                }
            }
        });

    }
}