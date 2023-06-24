package com.prankit.androidmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // add option menu to this page
    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        // display menu option text with icon
        if(menu instanceof MenuBuilder){
            MenuBuilder m = (MenuBuilder) menu;
            m.setOptionalIconsVisible(true);
        }
        return true;
    }

    // add action on clicking menu items
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.home) Toast.makeText(this, "You are already on Home page", Toast.LENGTH_SHORT).show();
        if (item.getItemId()==R.id.toast) Toast.makeText(this, "You have clicked Toast option", Toast.LENGTH_SHORT).show();
        if (item.getItemId()==R.id.logout) Toast.makeText(this, "Currently there is no authentication functionality", Toast.LENGTH_SHORT).show();
        return true;
    }
}