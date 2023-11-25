package com.mygy.smartrecipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecipesRecyclerAdapter extends RecyclerView.Adapter<RecipesRecyclerAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Reciepe> recipes;

    public RecipesRecyclerAdapter(Context context, List<Reciepe> recipes) {
        this.recipes = recipes;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public RecipesRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recipe_button_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecipesRecyclerAdapter.ViewHolder holder, int position) {
        Reciepe reciepe = recipes.get(position);

        holder.btn.setImageResource(reciepe.getBtnImgRes());
        holder.btn.setOnClickListener(v -> {
            Intent intent = new Intent(inflater.getContext(), ReciepeInfoActivity.class);
            ReciepeInfoActivity.reciepe = reciepe;
            inflater.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView btn;
        ViewHolder(View view){
            super(view);
            btn = view.findViewById(R.id.recipe_btn);
        }
    }
}
