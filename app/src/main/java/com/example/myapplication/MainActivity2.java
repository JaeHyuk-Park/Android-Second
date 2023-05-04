package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView text = (TextView) findViewById(R.id.text);
        registerForContextMenu(text);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.item1){
            Toast.makeText(this, item.getItemId()+"", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.item2){
            Toast.makeText(this, item.getItemId()+"", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, item.getItemId()+"", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.textconnect, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if(!item.getTitle().equals("")){
            Toast.makeText(this, item.getTitle()+"", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "내용이 없습니다.", Toast.LENGTH_SHORT).show();
        }

        return super.onContextItemSelected(item);
    }
}