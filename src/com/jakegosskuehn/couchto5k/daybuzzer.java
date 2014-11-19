
package com.jakegosskuehn.couchto5k;

import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jakegosskuehn.couchto5k.R;

public class daybuzzer extends Activity {

    
    int CURRENTday = 69;
    runpattern newdaypattern;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daybuzzer);
        CURRENTday = getDay();
        String dayget = String.valueOf(CURRENTday);
        Log.e("the day is: ", dayget);
        setNewDayPattern(CURRENTday);
        LinearLayout layout = (LinearLayout) findViewById(R.id.linearlayoutbuzzer);
        layout.setBackgroundColor(Color.argb(100, 251, 198, 167));
        
        addListenerOnButton();
        addListenerOnButton_ender();
        
        final Button button26 = (Button) findViewById(R.id.returnButton2);
        button26.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                //DO STUFF HERE
                finish();
                
                ;
                }
            });
    }
    
    @SuppressLint("CutPasteId")
    public void setNewDayPattern(int day)
    {
        switch(day){
            case 1: newdaypattern = new runpattern(1,100,100,8);
                ImageView buttonView1 = (ImageView) findViewById(R.id.dayzero);
                buttonView1.setImageResource(R.drawable.emi_day1);
            //set image background
                break;
                //Do later
            case 2:         ImageView buttonView2 = (ImageView) findViewById(R.id.dayzero);
            buttonView2.setImageResource(R.drawable.emi_day1);
                break;
            case 3:     ImageView buttonView3 = (ImageView) findViewById(R.id.dayzero);
            buttonView3.setImageResource(R.drawable.emi_day1);
                break;
            case 4:ImageView buttonView4 = (ImageView) findViewById(R.id.dayzero);
            buttonView4.setImageResource(R.drawable.emi_day456);
                break;
            case 5:ImageView buttonView5 = (ImageView) findViewById(R.id.dayzero);
            buttonView5.setImageResource(R.drawable.emi_day456);
                break;
            case 6:ImageView buttonView6 = (ImageView) findViewById(R.id.dayzero);
            buttonView6.setImageResource(R.drawable.emi_day456);
                break;
            case 7:ImageView buttonView7 = (ImageView) findViewById(R.id.dayzero);
            buttonView7.setImageResource(R.drawable.emi_day789);
                break;
            case 8:ImageView buttonView8 = (ImageView) findViewById(R.id.dayzero);
            buttonView8.setImageResource(R.drawable.emi_day789);
                break;
            case 9:ImageView buttonView9 = (ImageView) findViewById(R.id.dayzero);
            buttonView9.setImageResource(R.drawable.emi_day789);
                break;
            case 10:ImageView buttonView11 = (ImageView) findViewById(R.id.dayzero);
            buttonView11.setImageResource(R.drawable.emi_day101112);
                break;
            case 11:ImageView buttonView22 = (ImageView) findViewById(R.id.dayzero);
            buttonView22.setImageResource(R.drawable.emi_day101112);
                break;
            case 12:ImageView buttonView33 = (ImageView) findViewById(R.id.dayzero);
            buttonView33.setImageResource(R.drawable.emi_day101112);
                break;
            case 13:ImageView buttonView44 = (ImageView) findViewById(R.id.dayzero);
            buttonView44.setImageResource(R.drawable.emi_day13);
                break;
            case 14:ImageView buttonView55 = (ImageView) findViewById(R.id.dayzero);
            buttonView55.setImageResource(R.drawable.emi_day14);
                break;
            case 15:ImageView buttonView66 = (ImageView) findViewById(R.id.dayzero);
            buttonView66.setImageResource(R.drawable.emi_day15);
                break;
            case 16:ImageView buttonView77 = (ImageView) findViewById(R.id.dayzero);
            buttonView77.setImageResource(R.drawable.emi_day16);
                break;
            case 17:ImageView buttonView88 = (ImageView) findViewById(R.id.dayzero);
            buttonView88.setImageResource(R.drawable.emi_day17);
                break;
            case 18:ImageView buttonView99 = (ImageView) findViewById(R.id.dayzero);
            buttonView99.setImageResource(R.drawable.emi_day181920);
                break;
            case 19:ImageView buttonView30 = (ImageView) findViewById(R.id.dayzero);
            buttonView30.setImageResource(R.drawable.emi_day181920);
                break;
            case 20:ImageView buttonView20 = (ImageView) findViewById(R.id.dayzero);
            buttonView20.setImageResource(R.drawable.emi_day181920);
                break;
            case 21:ImageView buttonView21 = (ImageView) findViewById(R.id.dayzero);
            buttonView21.setImageResource(R.drawable.emi_day212223);
                break;
            case 22:ImageView buttonView222 = (ImageView) findViewById(R.id.dayzero);
            buttonView222.setImageResource(R.drawable.emi_day212223);
                break;
            case 23:ImageView buttonView333 = (ImageView) findViewById(R.id.dayzero);
            buttonView333.setImageResource(R.drawable.emi_day212223);
                break;
            case 24:ImageView buttonView34 = (ImageView) findViewById(R.id.dayzero);
            buttonView34.setImageResource(R.drawable.emi_day24252627);
                break;
            case 25:ImageView buttonView35 = (ImageView) findViewById(R.id.dayzero);
            buttonView35.setImageResource(R.drawable.emi_day24252627);
                break;
            case 26:ImageView buttonView36 = (ImageView) findViewById(R.id.dayzero);
            buttonView36.setImageResource(R.drawable.emi_day24252627);
                break;
            case 27:ImageView buttonView37 = (ImageView) findViewById(R.id.dayzero);
            buttonView37.setImageResource(R.drawable.emi_day24252627);
                break;
        }
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    //returns 1 if there is an error
    public int getDay()
    {
        int valueint = 1;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            valueint = extras.getInt("current_day");
        }
        return valueint;
    }
    
    public boolean vibratorOn = false;
    
    public void daybuzzer()
    {
        //vibratorCheckerTester();
        switch(CURRENTday){
            case 1: vibratorDAYONE();
//                newdaypattern = new runpattern(1,100,100,8);
                break;
                //Do later
            case 2: vibratorDAYONE();
                break;
            case 3: vibratorDAYONE();
                break;
            case 4: vibratorDAYFOUR();
                break;
            case 5: vibratorDAYFOUR();
                break;
            case 6: vibratorDAYFOUR();
                break;
            case 7: vibratorDAYSEVEN();
                break;
            case 8:vibratorDAYSEVEN();
                break;
            case 9:vibratorDAYSEVEN();
                break;
            case 10:vibratorDAYTEN();
                break;
            case 11:vibratorDAYTEN();
                break;
            case 12:vibratorDAYTEN();
                break;
            case 13:vibratorDAYTHIRTEEN();
                break;
            case 14:vibratorDAYFOURTEEN();
                break;
            case 15:vibratorDAYFIFTEEN();
                break;
            case 16:vibratorDAYSIXTEEN();
                break;
            case 17:vibratorDAYSEVENTEEN();
                break;
            case 18:vibratorDAYEIGHTEEN();
                break;
            case 19:vibratorDAYEIGHTEEN();
                break;
            case 20:vibratorDAYEIGHTEEN();
                break;
            case 21:vibratorDAYTWENTYONE();
                break;
            case 22:vibratorDAYTWENTYONE();
                break;
            case 23:vibratorDAYTWENTYONE();
                break;
            case 24:vibratorDAYTWENTYFOUR();
                break;
            case 25:vibratorDAYTWENTYFOUR();
                break;
            case 26:vibratorDAYTWENTYFOUR();
                break;
            case 27:vibratorDAYTWENTYFOUR();
                break;
        }
    }
    public void vibratorEnder()
    {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        v.cancel();
        Toast.makeText(daybuzzer.this,
                "Stopping the program.", Toast.LENGTH_LONG).show();
       
        TextView tv = (TextView) this.findViewById(R.id.onOff);
        tv.setText("STOPPED");
    
        
    }
    public void preVibe()
    {
        TextView tv = (TextView) this.findViewById(R.id.onOff);
        tv.setText("ACTIVATED");
        
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if(!v.hasVibrator())
        {
            Toast.makeText(daybuzzer.this,
                    "You need to have a vibrator on your phone for this app to work.", Toast.LENGTH_LONG).show();
        }
        else
            {
            Toast.makeText(daybuzzer.this, "Start Running in ten seconds.", Toast.LENGTH_LONG).show();
            }
        
    }
    public void vibratorDAYONE()//days one two and three
    {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        preVibe();
     // Start without a delay
     // Each element then alternates between vibrate, sleep, vibrate, sleep...
        
        long[] startpattern = {10000, 1000, 60000, 1000, 90000, 1000, 60000, 1000, 90000,  1000, 60000, 1000, 90000,  1000, 60000, 1000, 90000,  1000, 60000, 1000, 90000,  1000, 60000, 1000, 90000,  1000, 60000, 1000, 90000,  1000, 60000, 1000, 90000, 10000};
            v.vibrate(startpattern, -1); //start first
    }
    
    public void vibratorDAYFOUR()//days one two and three
    {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        preVibe();
     // Start without a delay
     // Each element then alternates between vibrate, sleep, vibrate, sleep...
        
        long[] startpattern = {10000, 1000, 90000, 1000, 120000, 1000, 90000, 1000, 120000, 1000, 90000, 1000, 120000, 1000, 90000, 1000, 120000, 1000, 90000, 1000, 120000, 1000, 90000, 1000, 120000, 10000};
            v.vibrate(startpattern, -1); //start first
    }
    public void vibratorDAYSEVEN()//days one two and three
    {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        preVibe();
     // Start without a delay
     // Each element then alternates between vibrate, sleep, vibrate, sleep...
        
        long[] startpattern = {10000, 1000, 90000, 1000, 90000, 1000, 180000, 1000, 18000, 1000, 90000, 1000, 90000, 1000, 180000, 1000, 18000, 10000};
            v.vibrate(startpattern, -1); //start first
    }
    public void vibratorDAYTEN()//days one two and three
    {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        preVibe();
     // Start without a delay
     // Each element then alternates between vibrate, sleep, vibrate, sleep...
        
        long[] startpattern = {10000, 1000, 180000, 1000, 90000, 1000, 300000, 1000, 15000, 1000, 180000, 1000, 90000, 300000, 10000};
            v.vibrate(startpattern, -1); //start first
    }
    public void vibratorDAYTHIRTEEN()//days one two and three
    {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        preVibe();
     // Start without a delay
     // Each element then alternates between vibrate, sleep, vibrate, sleep...
        
        long[] startpattern = {10000, 1000, 300000, 1000, 180000, 1000, 300000, 1000, 180000, 1000, 300000, 10000};
            v.vibrate(startpattern, -1); //start first
    }
    public void vibratorDAYFOURTEEN()//days one two and three
    {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        preVibe();
     // Start without a delay
     // Each element then alternates between vibrate, sleep, vibrate, sleep...
        
        long[] startpattern = {10000, 1000, 480000, 1000, 300000, 1000, 480000, 10000};
            v.vibrate(startpattern, -1); //start first
    }
    public void vibratorDAYFIFTEEN()//days one two and three
    {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        preVibe();
     // Start without a delay
     // Each element then alternates between vibrate, sleep, vibrate, sleep...
        
        long[] startpattern = {10000, 1000, 1260000, 10000};
            v.vibrate(startpattern, -1); //start first
    }
    public void vibratorDAYSIXTEEN()//days one two and three
    {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        preVibe();
     // Start without a delay
     // Each element then alternates between vibrate, sleep, vibrate, sleep...
        
        long[] startpattern = {10000, 1000, 300000, 1000, 180000, 1000, 480000, 1000, 180000, 300000, 10000};
            v.vibrate(startpattern, -1); //start first
    }
    public void vibratorDAYSEVENTEEN()//days one two and three
    {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        preVibe();
     // Start without a delay
     // Each element then alternates between vibrate, sleep, vibrate, sleep...
        
        long[] startpattern = {10000, 1000, 600000, 1000, 180000, 1000, 600000, 10000};
            v.vibrate(startpattern, -1); //start first
    }
    public void vibratorDAYEIGHTEEN()//days one two and three
    {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        preVibe();
     // Start without a delay
     // Each element then alternates between vibrate, sleep, vibrate, sleep...
        
        long[] startpattern = {10000, 1000, 1500000, 10000};
            v.vibrate(startpattern, -1); //start first
    }
    public void vibratorDAYTWENTYONE()//days one two and three
    {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        preVibe();
     // Start without a delay
     // Each element then alternates between vibrate, sleep, vibrate, sleep...
        
        long[] startpattern = {10000, 1000, 1680000, 10000};
            v.vibrate(startpattern, -1); //start first
    }
    public void vibratorDAYTWENTYFOUR()//days one two and three
    {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        preVibe();
     // Start without a delay
     // Each element then alternates between vibrate, sleep, vibrate, sleep...
        
        long[] startpattern = {10000, 1000, 1800000, 10000};
            v.vibrate(startpattern, -1); //start first
    }
    
    
    
    public void vibratorCheckerTester(int day)
    {
        // Get instance of Vibrator from current Context
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long[] startpattern = {1000, 500, 3000};
        long[] pattern1 = {0, 500, 1000};//sleep one minute
        long[] pattern2 = {0, 500, 3000}; //sleep 1.5
        if(!v.hasVibrator())
        {
            Toast.makeText(daybuzzer.this,
                    "You need to have a vibrator on your phone for this app to work.", Toast.LENGTH_LONG).show();
        }
        
        // Start without a delay
        // Vibrate for 100 milliseconds
        // Sleep for 1000 milliseconds
        Toast.makeText(daybuzzer.this,
                "Start Running.", Toast.LENGTH_LONG).show();
        v.vibrate(startpattern, -1);
        SystemClock.sleep(2000);
        v.vibrate(startpattern, -1);
        SystemClock.sleep(2000);
        v.vibrate(startpattern, -1);
        SystemClock.sleep(2000);
        
        
        switch(day){
            case 1:  v.vibrate(pattern1, -1); //1 min, 1.5 min, x8
                    v.vibrate(pattern2, -1);
                    v.vibrate(pattern1, -1);
                    v.vibrate(pattern2, -1);
                    v.vibrate(pattern1, -1);
                    v.vibrate(pattern2, -1);
                    v.vibrate(pattern1, -1);
                    v.vibrate(pattern2, -1);
                    v.vibrate(pattern1, -1);
                    v.vibrate(pattern2, -1);
                    v.vibrate(pattern1, -1);
                    v.vibrate(pattern2, -1);
                    v.vibrate(pattern1, -1);
                    v.vibrate(pattern2, -1);
                    v.vibrate(pattern1, -1);
                    v.vibrate(pattern2, -1);
                    v.vibrate(startpattern, -1);
                    v.vibrate(startpattern, -1);
                    v.vibrate(startpattern, -1);
                    break;
                //Do later
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                break;
//            case 6:
//                break;
//            case 7:
//                break;
//            case 8:
//                break;
//            case 9:
//                break;
//            case 10:
//                break;
//            case 11:
//                break;
        }
    }
    
    public void addListenerOnButton_ender() {
        
        final Button button = (Button) findViewById(R.id.endbuzzer);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Log.e("test", "Button Pressed");
                vibratorEnder();
                return;
            }
        });
    }
    
    public void addListenerOnButton() {
        
        final Button button = (Button) findViewById(R.id.startbuzzer);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Log.e("test", "Button Pressed");
                daybuzzer();
            }
        });
    }
}