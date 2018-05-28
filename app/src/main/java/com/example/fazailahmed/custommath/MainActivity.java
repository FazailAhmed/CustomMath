package com.example.fazailahmed.custommath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myutill.MyMath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addbtn=(Button)findViewById(R.id.plus_button);
        Button minbtn=(Button)findViewById(R.id.minus_button);

        addbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        EditText fstNo=(EditText)findViewById(R.id.first_number);
        int myNum = Integer.parseInt(fstNo.getText().toString());
        EditText scdNo=(EditText)findViewById(R.id.second_number);
        int my2ndNum = Integer.parseInt(scdNo.getText().toString());

        TextView result=(TextView)findViewById(R.id.result_text);


        result.setText(String.valueOf(MyMath.plus(myNum,my2ndNum)));
    }
});






    }
}
