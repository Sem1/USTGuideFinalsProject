package com.example.ustguide;

import android.content.Intent;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Courses extends Activity {

   
    Button courses, map;
    TextView line,line1, course1, course2, course3, course4, course5,course6,course7,course8,course9,course10,course11,course12,course13,course14,course15,course16,course17,course18,course19,course20,course21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


      
        setContentView(R.layout.activity_courses);

      

        courses =(Button) findViewById(R.id.courses);
        map = (Button) findViewById(R.id.map);
        line = (TextView) findViewById(R.id.line);
        line1 = (TextView) findViewById(R.id.line1);


        course1 = (TextView) findViewById(R.id.course1);
        course2 = (TextView) findViewById(R.id.course2);
        course3 = (TextView) findViewById(R.id.course3);
        course4 = (TextView) findViewById(R.id.course4);
        course5 = (TextView) findViewById(R.id.course5);
        course6 = (TextView) findViewById(R.id.course6);
        course7 = (TextView) findViewById(R.id.course7);
        course8 = (TextView) findViewById(R.id.course8);
        course9 = (TextView) findViewById(R.id.course9);
        course10 = (TextView) findViewById(R.id.course10);
        course11 = (TextView) findViewById(R.id.course11);
        course12 = (TextView) findViewById(R.id.course12);
        course14 = (TextView) findViewById(R.id.course14);
        course15 = (TextView) findViewById(R.id.course15);
        course16 = (TextView) findViewById(R.id.course16);
        course17 = (TextView) findViewById(R.id.course17);
        course18 = (TextView) findViewById(R.id.course18);
        course19 = (TextView) findViewById(R.id.course19);
        course21 = (TextView) findViewById(R.id.course21);
    
        
        courses.setBackgroundColor(Color.YELLOW);
        map.setBackgroundColor(Color.GRAY);
        line.setBackgroundColor(Color.BLACK);
        line1.setBackgroundColor(Color.BLACK);

    
        
        map.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Courses.this, Map.class));
                
            }
        });

    
     
        course1.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Courses.this, Course1.class));
                finish();
            }
        });

        course2.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Courses.this, Course2.class));
                finish();
            }
        });

        course3.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Courses.this, Course3.class));
                finish();
            }
        });

       course4.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(Courses.this, Course4.class));
                finish();
            }
        });
       course5.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course5.class));
               finish();
           }
       });
       course6.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course6.class));
               finish();
           }
       });
       course7.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course7.class));
               finish();
           }
       });
       course8.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course8.class));
               finish();
           }
       });
       course9.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course9.class));
               finish();
           }
       });
       course10.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course10.class));
               finish();
           }
       });
       course11.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course11.class));
               finish();
           }
       });
       course12.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course12.class));
               finish();
           }
       });
       course14.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course14.class));
               finish();
           }
       });
       course15.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course15.class));
               finish();
           }
       });
       course16.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course16.class));
               finish();
           }
       });
       course17.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course17.class));
               finish();
           }
       });
       course18.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               //TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course18.class));
               finish();
           }
       });
       course19.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course19.class));
               finish();
           }
       });
       course21.setOnClickListener( new OnClickListener() {
           @Override
           public void onClick(View v) {
               // TODO Auto-generated method stub
               startActivity(new Intent(Courses.this, Course21.class));
               finish();
           }
       });


    }

}