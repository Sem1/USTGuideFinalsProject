package com.example.ustguide;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Course1 extends Activity {

    
    Button courses, map;
    TextView line,line1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        
        setContentView(R.layout.activity_course1);

   

        courses =(Button) findViewById(R.id.courses);
        map = (Button) findViewById(R.id.map);
        line = (TextView) findViewById(R.id.line);
        line1 = (TextView) findViewById(R.id.line1);


        courses.setBackgroundColor(Color.YELLOW);
        map.setBackgroundColor(Color.GRAY);
        line.setBackgroundColor(Color.BLACK);
        line1.setBackgroundColor(Color.BLACK);
       
        
        courses.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Course1.this, Courses.class));
                finish();
            }
        });


        
        map.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Course1.this, Map.class));
                finish();
            }
        });





    }



}