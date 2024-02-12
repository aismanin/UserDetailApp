package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.UserListFragmentBinding;
import com.example.myapplication.databinding.UserListRecyclerItemBinding;
import com.example.myapplication.room.UserDataTable;

import java.util.List;

public class UserListFragment extends Fragment {


    RecyclerViewListAdapter adapter;

    UserListFragmentBinding ui;

    List<UserDataTable> usersList;

    MyViewModel vm;

    public UserListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ui = UserListFragmentBinding.inflate(inflater, container, false);

        vm = new ViewModelProvider(requireActivity()).get(MyViewModel.class);   //this will share the same viewModel instance as its parent as requireActivity is used here

        vm.getUserDataTableDataList(requireContext()).observe((LifecycleOwner) requireContext(), new Observer<List<UserDataTable>>() {
            @Override
            public void onChanged(List<UserDataTable> userDataTablesList) {
                usersList = userDataTablesList;
                // set up the RecyclerView
                RecyclerView recyclerView = ui.userListRecyclerView;
                recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
                adapter = new RecyclerViewListAdapter();
                recyclerView.setAdapter(adapter);
                adapter.updateDataList(usersList);
            }
        });

        return ui.getRoot();
    }

    public class RecyclerViewListAdapter extends RecyclerView.Adapter<RecyclerViewListAdapter.ViewHolder> {
        public List<UserDataTable> datalist;

        public RecyclerViewListAdapter() {}

        void updateDataList(List<UserDataTable> modelObjectArrayList){
            this.datalist = modelObjectArrayList;
            notifyDataSetChanged();
        }

        @NonNull
        @Override
        public RecyclerViewListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHolder(UserListRecyclerItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerViewListAdapter.ViewHolder holder, final int position) {
            UserDataTable item = datalist.get(position);
            holder.setData(item);
        }

        @Override
        public int getItemCount() {
            return datalist == null ? 0 : datalist.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            private UserListRecyclerItemBinding recyclerItemUI;

            public ViewHolder(@NonNull UserListRecyclerItemBinding recyclerItemUI_) {
                super(recyclerItemUI_.getRoot());
                recyclerItemUI = recyclerItemUI_;
            }

            public void setData(UserDataTable item){

                recyclerItemUI.idTextView.setText(String.valueOf(item.getId()));
                recyclerItemUI.userNameTextView.setText(item.getFirstName());
                recyclerItemUI.userLastNameTextView.setText(item.getLastName());

                recyclerItemUI.recyclerItemLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        vm.currentUserId = item.getId();
                        FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment_container, new UserDetailFragment());
                        transaction.addToBackStack(null);
                        transaction.commit();
                    }
                });
            }
        }
    }
}