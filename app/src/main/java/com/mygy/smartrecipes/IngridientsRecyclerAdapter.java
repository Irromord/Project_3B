package com.mygy.smartrecipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class IngridientsRecyclerAdapter extends RecyclerView.Adapter<IngridientsRecyclerAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Ingridient> ingridients;

    public IngridientsRecyclerAdapter(Context context, List<Ingridient> ingridients) {
        this.ingridients = ingridients;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public IngridientsRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.ingridient_item, parent, false);
        return new IngridientsRecyclerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(IngridientsRecyclerAdapter.ViewHolder holder, int position) {
        Ingridient ingridient = ingridients.get(position);

        holder.btn.setText(ingridient.getName());
        holder.btn.setOnClickListener(v -> {
            if(Ingridient.selectedIngridient.contains(ingridient)){
                holder.selectIco.setVisibility(View.INVISIBLE);
                Ingridient.selectedIngridient.remove(ingridient);
            }else{
                holder.selectIco.setVisibility(View.VISIBLE);
                Ingridient.selectedIngridient.add(ingridient);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ingridients.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView btn;
        final ImageView selectIco;
        ViewHolder(View view){
            super(view);
            btn = view.findViewById(R.id.ingridient_btn);
            selectIco = view.findViewById(R.id.ingridient_selectIco);
        }
    }
}
