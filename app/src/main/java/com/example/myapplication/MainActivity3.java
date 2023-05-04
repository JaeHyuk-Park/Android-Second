package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button btn = (Button) findViewById(R.id.button4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view2 = View.inflate(MainActivity3.this, R.layout.dialog, null);

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity3.this);

                dialog.setView(view2);
                dialog.show();


//
//                String item[] = new String[3];
//                item[0] = "나는 1번이다.";
//                item[1] = "나는 2번이다.";
//                item[2] = "나는 3번이다.";
//                boolean bool[] = new boolean[3];
//                bool[0] = false;
//                bool[1] = false;
//                bool[2] = false;
//
//                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity3.this);
//                dialog.setIcon(R.drawable.puppy);
//                dialog.setTitle("에베베");
//                dialog.setMultiChoiceItems(item, bool, null);
//                dialog.setPositiveButton("확인", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(MainActivity3.this, "확인 되었습니다.", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                dialog.setNegativeButton("취소", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(MainActivity3.this, "취소 되었습니다.", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                dialog.show();
            }
        });
    }
}