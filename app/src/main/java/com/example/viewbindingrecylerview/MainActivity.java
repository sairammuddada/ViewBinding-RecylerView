package com.example.viewbindingrecylerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.viewbindingrecylerview.databinding.ActivityMainBinding;
import com.example.viewbindingrecylerview.databinding.ListViewBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    ArrayList<Model> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        activityMainBinding.recylerview.setAdapter(new ListAdapter(list));
        list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Model model = new Model(R.drawable.siva,
                    "Siva",
                    "siva@gmail.com",
                    "21/06/2000",
                    "9876543210");
            list.add(model);
            Model model1 = new Model(R.drawable.surya,
                    "Surya",
                    "surya@gmail.com",
                    "21/06/2001",
                    "7876543210");
            list.add(model1);
            Model model2 = new Model(R.drawable.krishna,
                    "Krishna",
                    "krishna@gmail.com",
                    "21/06/2002",
                    "8876543210");
            list.add(model2);
            Model model3 = new Model(R.drawable.vinayaka,
                    "Vinayaka",
                    "vinayaka@gmail.com",
                    "21/06/2003",
                    "7876543210");
            list.add(model3);

        }
        activityMainBinding.recylerview.setAdapter(new ListAdapter(list));
    }

    public static class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

        ArrayList<Model> list;
        public ListAdapter(ArrayList<Model> list) {
            this.list = list;
        }

        @NonNull
        @Override
        public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            ListViewBinding binding = ListViewBinding.inflate(
                    LayoutInflater.from(parent.getContext()), parent, false);
            return new ViewHolder(binding);
        }

        @Override
        public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
            holder.binding.image.setImageResource(list.get(position).getImage());
            holder.binding.name.setText(list.get(position).getName());
            holder.binding.email.setText(list.get(position).getEmail());
            holder.binding.dateOfBirth.setText(list.get(position).getDateOfBirth());
            holder.binding.Mobile.setText(list.get(position).getMobile());
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {
            ListViewBinding binding;
            public ViewHolder(@NonNull ListViewBinding listViewBinding) {
                super(listViewBinding.getRoot());
                binding = listViewBinding;
            }
        }
    }
}