package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox1);
        TextView text = (TextView) findViewById(R.id.textView2);
        RadioButton radio1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton radio2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton radio3 = (RadioButton) findViewById(R.id.radioButton3);
        Button btn = (Button) findViewById(R.id.button);
        ImageView image = (ImageView) findViewById(R.id.imageView2);

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) cb1).isChecked();

                if(checked){
                    text.setVisibility(View.VISIBLE);
                    radio1.setVisibility(View.VISIBLE);
                    radio2.setVisibility(View.VISIBLE);
                    radio3.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.VISIBLE);
                }else{
                    text.setVisibility(View.INVISIBLE);
                    radio1.setVisibility(View.INVISIBLE);
                    radio2.setVisibility(View.INVISIBLE);
                    radio3.setVisibility(View.INVISIBLE);
                    btn.setVisibility(View.INVISIBLE);
                }
            }
        });

//        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//                if(isChecked == true){
//                    text.setVisibility(View.VISIBLE);
//                    radio1.setVisibility(View.VISIBLE);
//                    radio2.setVisibility(View.VISIBLE);
//                    radio3.setVisibility(View.VISIBLE);
//                    btn.setVisibility(View.VISIBLE);
//                    image.setVisibility(View.VISIBLE);
//                }else{
//                    text.setVisibility(View.INVISIBLE);
//                    radio1.setVisibility(View.INVISIBLE);
//                    radio2.setVisibility(View.INVISIBLE);
//                    radio3.setVisibility(View.INVISIBLE);
//                    btn.setVisibility(View.INVISIBLE);
//                    image.setVisibility(View.INVISIBLE);
//                }
//            }
//        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setVisibility(View.VISIBLE);

                if(radio1.isChecked()){
                    Toast.makeText(MainActivity.this, radio1.getText()+"를 선택하셨습니다.", Toast.LENGTH_SHORT).show();
                    image.setImageResource(R.drawable.puppy);
                }else if(radio2.isChecked()){
                    Toast.makeText(MainActivity.this, radio2.getText()+"를 선택하셨습니다.", Toast.LENGTH_SHORT).show();
                    image.setImageResource(R.drawable.cat);
                }else if(radio3.isChecked()){
                    Toast.makeText(MainActivity.this, radio3.getText()+"를 선택하셨습니다.", Toast.LENGTH_SHORT).show();
                    image.setImageResource(R.drawable.rabbit);
                }
            }
        });
    }
}