package com.example.diceroller;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public int roll_the_dice(){
        Random r = new Random();
        int number = r.nextInt (6)+1;
        return number;
    }

    public void on_button_click(View view)  {

        TextView tv = this.findViewById(R.id.DiceText);

        tv.setText(Integer.toString(roll_the_dice()));
    }


    public void on_button_click_D_Ice(View view)  {

        TextView tv = this.findViewById(R.id.DiceText);

        switch(roll_the_dice()) {
            case 1:
                tv.setText("If you could go anywhere in the world, where would you go?");
                break;
            case 2:
                tv.setText("If you were stranded on a desert island, what three things would you want to take with you?");
                break;
            case 3:
                tv.setText("If you could eat only one food for the rest of your life, what would that be?");
                break;
            case 4:
                tv.setText("If you won a million dollars, what is the first thing you would buy?");
                break;
            case 5:
                tv.setText("If you could spaned the day with one fictional character, who would it be?");
                break;
            case 6:
                tv.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish?");
                break;
        }

    }
}
