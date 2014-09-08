package com.nfsysu.sheldon.lightbulb;

import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;


public class Activity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        ToggleButton switchBtn = (ToggleButton) findViewById(R.id.switchBtn);

        switchBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                changeImage(isChecked);
            }
        });
    }

    private void changeImage(boolean isChecked) {
        ImageView image = (ImageView) findViewById(R.id.off);

        int resId= 0;

        if (isChecked) {
            resId = R.drawable.on;
        } else {
            resId = R.drawable.off;
        }

        image.setImageResource(resId);
    }

}
