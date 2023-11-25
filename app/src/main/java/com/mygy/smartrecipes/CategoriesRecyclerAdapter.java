package com.mygy.smartrecipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoriesRecyclerAdapter extends RecyclerView.Adapter<CategoriesRecyclerAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Category> categories;

    public CategoriesRecyclerAdapter(Context context, List<Category> categories) {
        this.categories = categories;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public CategoriesRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.category_button_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoriesRecyclerAdapter.ViewHolder holder, int position) {
        Category category = categories.get(position);

        holder.btn.setImageResource(category.getBtnImageRes());
        holder.btn.setOnClickListener(v -> {
            Intent intent = new Intent(inflater.getContext(), IngridientsSelectorActivity.class);
            IngridientsSelectorActivity.category = category;
            inflater.getContext().startActivity(intent);

        });
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView btn;
        ViewHolder(View view){
            super(view);
            btn = view.findViewById(R.id.category_btn);
        }
    }
}
