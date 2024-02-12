package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentUserDetailBinding;
import com.example.myapplication.room.UserDataTable;

public class UserDetailFragment extends Fragment {

    FragmentUserDetailBinding ui;

    MyViewModel vm;


    public UserDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ui = FragmentUserDetailBinding.inflate(inflater, container, false);

        vm = new ViewModelProvider(requireActivity()).get(MyViewModel.class);

        vm.getUserById(requireContext(), vm.currentUserId).observe((LifecycleOwner) requireContext(), new Observer<UserDataTable>() {
            @Override
            public void onChanged(UserDataTable d) {
                ui.idTextView.setText(String.valueOf(d.getId()));
                ui.userNameTextView.setText(d.getFirstName());
                ui.userLastNameTextView.setText(d.getLastName());
                ui.ageTextView.setText(String.valueOf(d.getAge()));
                ui.emailTextView.setText(d.getEmail());
                ui.genderTextView.setText(d.getGender());
            }
        });


        ui.editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new EditUserDetail());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });




        return ui.getRoot();
    }
}