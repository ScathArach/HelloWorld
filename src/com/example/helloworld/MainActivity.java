package com.example.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    
    public void goodBye(View v)
    {    	
    	TextView text = (TextView) findViewById(R.id.tv);
    	Button button = (Button) findViewById(R.id.bt);
    	CharSequence buttonText = button.getText();  
    	
    	if (buttonText == this.getString(R.string.goodBye))
    	{
    		text.setText(R.string.bye_world);
    		button.setText(R.string.hello);
    	}
    	else 
    	{
    		text.setText(R.string.hello_world);
    		button.setText(R.string.goodBye);
    	}
    }
}