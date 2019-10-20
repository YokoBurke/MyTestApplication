package com.example.android.mytestapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private static final String LOG_TAG = MyAdapter.class.getSimpleName();

    private List<Coffee> myCoffeeList;
    private Context myContext;

    public MyAdapter (List<Coffee> mCoffee) {
        myCoffeeList = mCoffee;

    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView strengthTextView;
        public TextView flavourTextView;

        public MyViewHolder(View itemView) {
            super(itemView);
            strengthTextView = (TextView) itemView.findViewById(R.id.my_strength);
            flavourTextView = (TextView) itemView.findViewById(R.id.my_flavour);
        }


    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        Context context = parent.getContext();
        int myLayoutID = R.layout.detail;
        View itemView = LayoutInflater.from(parent.getContext()).inflate(myLayoutID, parent, false);
        MyViewHolder CoffeeViewHolder = new MyViewHolder(itemView);
        return CoffeeViewHolder;
    }

    @Override
    public void onBindViewHolder (@NonNull MyAdapter.MyViewHolder holder, int position){

        String myCoffeeFlavour = myCoffeeList.get(position).getFlavour();
        int myCoffeeStrength = myCoffeeList.get(position).getStrength();
        Log.i(LOG_TAG, myCoffeeFlavour);

        holder.flavourTextView.setText(myCoffeeFlavour);
        holder.strengthTextView.setText(Integer.toString(myCoffeeStrength));
    }

    @Override
    public int getItemCount(){
        return myCoffeeList.size();
    }
}
