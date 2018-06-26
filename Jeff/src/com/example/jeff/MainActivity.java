package com.example.jeff;

import org.w3c.dom.Text;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	private Button btnone, btntwo, btnthree;
	private TextView textone, texttwo,textthree;
		
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        btnone = (Button)findViewById(R.id.button1);
        btntwo = (Button)findViewById(R.id.button2);
        btnthree=(Button)findViewById(R.id.button3);
        textone=(TextView)findViewById(R.id.textView2);
        texttwo=(TextView)findViewById(R.id.textView3);
        textthree=(TextView)findViewById(R.id.textView4);
        
        btnone.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				textone.setText("this is btnone");
				texttwo.setText("");
				textthree.setText("");
			}
		});
        btntwo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				texttwo.setText("this is btntwo");
				textone.setText("");
				textthree.setText("");
			}
		});
        btnthree.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				textthree.setText("this is btnthree");
				textone.setText("");
				texttwo.setText("");
			}
		});
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
