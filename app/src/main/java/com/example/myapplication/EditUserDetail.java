package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentEditUserDetailBinding;
import com.example.myapplication.room.UserDataTable;


public class EditUserDetail extends Fragment {

    FragmentEditUserDetailBinding ui;
    MyViewModel vm;

    public EditUserDetail() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ui = FragmentEditUserDetailBinding.inflate(inflater, container, false);
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


                ui.submitButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name = String.valueOf(ui.userNameTextView.getText());
                        String lastName = String.valueOf(ui.userLastNameTextView.getText());
                        String age = String.valueOf(ui.ageTextView.getText());
                        String email = String.valueOf(ui.emailTextView.getText());
                        String gender = String.valueOf(ui.genderTextView.getText());

                        d.setFirstName(name);
                        d.setLastName(lastName);
                        d.setAge(Integer.parseInt(age));
                        d.setEmail(email);
                        d.setGender(gender);

                        vm.updateUserData(requireContext(), d);

                        Toast.makeText(requireContext(), "Detail updated successfully", Toast.LENGTH_LONG).show();
                        requireActivity().onBackPressed();
                    }
                });
            }
        });


        return ui.getRoot();
    }
}