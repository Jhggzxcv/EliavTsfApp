package com.eliavtsf.eliavapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    Switch swich1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        swich1=findViewById(R.id.swEliavtsf);   //אחרת יהיה NULL
        swich1.setOnCheckedChangeListener(this);  //אחרת לא יקרה כלום
    }


    @Override
    public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean swich1) {
       if (swich1)
           Toast.makeText(this, "true", Toast.LENGTH_LONG).show();
       else
           Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();


    }
}