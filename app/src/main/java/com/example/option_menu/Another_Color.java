package com.example.option_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class Another_Color extends AppCompatActivity {
    int id;
    LinearLayout ll;

    /**
     * @author Dvir Dadon
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another__color);
        ll = findViewById(R.id.ll);
    }

    /**
     * @Since 11/9/2019
     * The method moving you back to the last activity
     */
    public void Back(View view) {
        finish();
    }

    /**
     * @Since 11/9/2019
     * @return The method return true if the user click in something in the option menu
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.first_option_menu,menu);
        menu.add(0,0,350,"Green");
        return true;
    }

    /**
     * @Since 11/9/2019
     * @return the option return where the user clicked.
     */

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        id=item.getItemId();
        if (id==R.id.black)
            ll.setBackgroundColor(Color.BLACK);
        else if (id==R.id.blue)
            ll.setBackgroundColor(Color.BLUE);
        else if (id==R.id.red)
            ll.setBackgroundColor(Color.RED);
        else
            ll.setBackgroundColor(Color.GREEN);
        return  true;
    }
}
