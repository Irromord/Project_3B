package com.mygy.smartrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class IngridientsSelectorActivity extends AppCompatActivity {
    public static Category category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingridients_selector);

        ImageButton backBtn = findViewById(R.id.selectIngridients_back);
        backBtn.setOnClickListener(v -> {
            Ingridient.selectedIngridient.clear();
            finish();
        });


            if(category != null){
                Store.banana.getName();

                RecyclerView recycler = findViewById(R.id.selectIngridients_recycler);
                IngridientsRecyclerAdapter adapter = new IngridientsRecyclerAdapter(this, Ingridient.allIngridients);
                recycler.setAdapter(adapter);

                ImageButton recipeBtn = findViewById(R.id.selectIngridients_recipeBtn);
                recipeBtn.setOnClickListener(v -> {
                    Intent intent = new Intent(this, RecipesActivity.class);
                    RecipesActivity.category = category;
                    startActivity(intent);
                });
        }
    }
}