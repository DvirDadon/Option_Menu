package com.example.option_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author Dvir Dadon
 */

public class MainActivity extends AppCompatActivity {
    int id;
    LinearLayout Ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ll = findViewById(R.id.Ll);
    }

    /**
     * @Since 9/11/2019
     * @return  The method return true if the user clicked in the option menu
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.first_option_menu,menu);
        return true;
    }

    /**
     * @Since 9/11/2019
     * @return  The method checking where the user is clicked in the list
     */

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        id = item.getItemId();
        if (id==R.id.black)
            Ll.setBackgroundColor(Color.BLACK);
        else if (id==R.id.blue)
            Ll.setBackgroundColor(Color.BLUE);
        else
            Ll.setBackgroundColor(Color.RED);
        return true;
    }

    /**
     * @Since 9/11/2019
     * The method is moving you to the next activity
     */

    public void Next(View view) {
        Intent si = new Intent(this,Another_Color.class);
        startActivity(si);
    }
}
