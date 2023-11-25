package com.mygy.smartrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Map;

public class ReciepeInfoActivity extends AppCompatActivity {
    public static Reciepe reciepe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciepe_info);

        ImageButton backBtn = findViewById(R.id.recipeInfo_back);
        backBtn.setOnClickListener(v -> {
            finish();
        });

        ImageView ico = findViewById(R.id.recipeInfo_ico);
        ico.setImageResource(reciepe.getIcoRes());

        TextView name = findViewById(R.id.recipeInfo_name);
        name.setText(reciepe.getName());

        TextView steps = findViewById(R.id.recipeInfo_steps);
        steps.setText(reciepe.getCookingSteps());

        TextView ingridients = findViewById(R.id.recipeInfo_ingridients);
        StringBuilder res = new StringBuilder();
        for(Map.Entry<Ingridient,String> i:reciepe.getIngridients().entrySet()){
            res.append(i.getKey().getName()+" - "+i.getValue()+"\n\n");
        }
        ingridients.setText(res);

    }
}