package edu.temple.helloworld5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

import java.text.BreakIterator;


public class MainActivity extends AppCompatActivity {

    private BreakIterator txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        Button button;
        final TextView txtView;

        //assigns the button w/ id clickButton to the variable button
        //casting is redundant
        button =(Button)findViewById(R.id.clickButton);

        //assigns the TextView w/ id textView to the variable txtView

        txtView = (TextView) findViewById(R.id.textView);


        //implements the listener for the btn so that when btn is
        //clicked the android will listen to it
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //sets the text of the textView to "You clicked the button"
                txtView.setText("You clicked the button");
            }
        });



    }

}
