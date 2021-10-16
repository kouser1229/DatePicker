package com.example.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatePicker picker1;
        Button displayDate;
        TextView textview1;
        textview1=(TextView)findViewById(R.id.t1);
        picker1=(DatePicker)findViewById(R.id.dp);
        displayDate=(Button)findViewById(R.id.b1);
        int i=picker1.getYear();
        textview1.setText("pick ur DOB");
        displayDate.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                System.out.println("see your selected date");
            }
        });
    }
}
