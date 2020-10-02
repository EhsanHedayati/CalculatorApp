package com.mylab.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
   private Button btn;
   private TextView tv1;
   private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);


        
        
        
        
      
        
        
        
        
  }
    public String returnName(){

        return "This is change ";

    }
    // This a comment to test the git pull mechanism from AS
    // This is second command there.
}
