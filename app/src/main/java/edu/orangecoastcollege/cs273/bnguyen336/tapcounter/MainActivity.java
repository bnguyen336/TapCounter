package edu.orangecoastcollege.cs273.bnguyen336.tapcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button mTapButton;
    private TextView t;
    private Counter counter = new Counter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTapButton = (Button) findViewById(R.id.tapButton);
        mTapButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter.addCount();
                t = (TextView) findViewById(R.id.counterText);
                t.setText(Integer.toString(counter.getCount()));
            }
        });
    }
}
