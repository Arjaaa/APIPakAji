package com.example.tugaspakaji;
import com.example.tugaspakaji.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainMenu extends AppCompatActivity {

    private Button btnPremierLeague, btnSpain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btnPremierLeague = findViewById(R.id.btnPremierLeague);
        btnSpain = findViewById(R.id.btnSpain);


        btnPremierLeague.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Tambahkan intent ke LigaActivity
        btnSpain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ligaIntent = new Intent(MainMenu.this, Liga.class);
                startActivity(ligaIntent);
            }
        });
    }
}
