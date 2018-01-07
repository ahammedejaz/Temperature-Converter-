package com.example.ejaz.temperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;


import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView tv_c, tv_f;
    SeekBar seekbar;
    double c, f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_c = (TextView) findViewById(R.id.tv_c);
        tv_f = (TextView) findViewById(R.id.tv_f);


        seekbar = (SeekBar) findViewById(R.id.seekBar);
        seekbar.setMax(400);
        seekbar.setProgress(200);


        c = seekbar.getProgress() - 200;
        f = c * 1.8 + 32;

        tv_c.setText(String.format(Locale.getDefault(), "%.1f", c));
        tv_f.setText(String.format(Locale.getDefault(), "%.1f", f));

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                c = progress - 200;
                f = c * 1.8 + 32;

                tv_c.setText(String.format(Locale.getDefault(), "%.1f C", c));
                tv_f.setText(String.format(Locale.getDefault(), "%.1f F", f));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

  }

}






