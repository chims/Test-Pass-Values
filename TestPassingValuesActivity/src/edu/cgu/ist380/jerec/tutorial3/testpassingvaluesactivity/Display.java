package edu.cgu.ist380.jerec.tutorial3.testpassingvaluesactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends Activity {

	   /** Called when the activity is first created. - Chims */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display); {
      	
        	Intent i = getIntent();
            Bundle b = i.getExtras();
            String ageText = b.getString("Age");
         
            TextView title = (TextView) findViewById(R.id.age);
            title.setText("my age is: " + ageText);  
       
        }
    }
	
	
}
