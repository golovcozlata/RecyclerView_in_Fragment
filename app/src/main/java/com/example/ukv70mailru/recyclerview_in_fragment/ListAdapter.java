package com.example.ukv70mailru.recyclerview_in_fragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ukv70@mail.ru on 08.03.2018.
 */

public class ListAdapter extends RecyclerView.Adapter{
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);

    }

    @Override
    public int getItemCount() {
        return People.name.length;
    }


    private  class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView mItemText1;
        private TextView mItemText2;

        public ListViewHolder(View itemView){

            super(itemView);
            mItemText1 = (TextView) itemView.findViewById(R.id.itemText1);
            mItemText2 = (TextView) itemView.findViewById(R.id.itemText2);
            itemView.setOnClickListener(this);

        }

        public void bindView(int position){
            mItemText1.setText(People.name[position]);
            mItemText2.setText(People.data_[position]);
        }

        public void onClick(View view){

        }

    }
}
