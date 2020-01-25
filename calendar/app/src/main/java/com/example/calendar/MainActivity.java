package com.example.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1,res;
    DatePicker d1,d2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res=findViewById(R.id.res);
        t1=findViewById(R.id.t1);
        b1=findViewById(R.id.b1);
        d1=findViewById(R.id.cal);//DOB
        d2=findViewById(R.id.cal2);//End date
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                int dy1,m1,y1,dy2,m2,y2;
                dy1=d1.getDayOfMonth();
                dy2=d2.getDayOfMonth();
                m1=d1.getMonth()+1;
                m2=d2.getMonth()+1;
                y1=d1.getYear();
                y2=d2.getYear();

                if(dy2<dy1)
                {
                    dy2+=30;
                    m2--;


                }
                if(m2<m1)
                {
                    m2+=12;
                    y2--;

                }
                String str=(dy2-dy1)+" Days "+(m2-m1)+" Month "+(y2-y1)+" Year";
                res.setText(str);

            }
        });

    }
}
