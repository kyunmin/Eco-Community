package com.example.eco_community;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.eco_community.adapter.MenuRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<MainMenu> allMenuInfo = getAllMenuInfo();
        MenuRecyclerViewAdapter menuRecyclerViewAdapter = new MenuRecyclerViewAdapter(MainActivity.this, allMenuInfo);
        recyclerView.setAdapter(menuRecyclerViewAdapter);
    }

    private List<MainMenu> getAllMenuInfo(){
        List<MainMenu> allMenu = new ArrayList<MainMenu>();

        allMenu.add(new MainMenu("Time to Recycle",R.drawable.recycle));
        allMenu.add(new MainMenu("Time to Donate", R.drawable.donate));
        allMenu.add(new MainMenu("Rewards For You",R.drawable.rewards));
        allMenu.add(new MainMenu("Your Rewards",R.drawable.yourrewards));
        allMenu.add(new MainMenu("Your Points",R.drawable.points));

        return allMenu;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;

        switch (item.getItemId()){
            case R.id.menu_logout:
                Toast.makeText(MainActivity.this,"Log Out", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, LogOutActivity.class);
                startActivity(intent);
                break;

            case R.id.menu_profile:
                Toast.makeText(MainActivity.this,"Profile", Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}