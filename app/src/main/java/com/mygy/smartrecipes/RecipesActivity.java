package com.mygy.smartrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import java.util.ArrayList;

public class RecipesActivity extends AppCompatActivity {
    public static Category category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        ImageButton backBtn = findViewById(R.id.recipes_back);
        backBtn.setOnClickListener(v -> {
            finish();
        });



                ArrayList<Reciepe> selected = new ArrayList<>();
                for(Reciepe r:category.getResiepes()){
                    for(Ingridient i:Ingridient.selectedIngridient){
                        boolean end = false;
                        for(Ingridient ii :r.getIngridients().keySet()) {
                            if (ii.getName().equals(i.getName())) {
                                System.out.println("ffffffffffffzzzzzzzzzzzzf"+r.getName());
                                selected.add(r);
                                end = true;
                                break;
                            }
                        }
                        if(end) break;
                    }
                }

                System.out.println(Ingridient.selectedIngridient.size()+"-------"+category.getResiepes().size()+"++++++++++"+selected.size());
                RecyclerView recycler = findViewById(R.id.recipes_recycler);
                RecipesRecyclerAdapter adapter = new RecipesRecyclerAdapter(this,selected);
                recycler.setAdapter(adapter);
    }
}