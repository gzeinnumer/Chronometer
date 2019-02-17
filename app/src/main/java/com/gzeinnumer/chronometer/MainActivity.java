package com.gzeinnumer.chronometer;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.widget.Chronometer;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.chronometerDown)
    Chronometer chronometerDown;
    @BindView(R.id.chronometerUp)
    Chronometer chronometerUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        chronometerDown.setBase(SystemClock.elapsedRealtime());
        chronometerDown.start();
        chronometerUp.setBase(SystemClock.elapsedRealtime());
        chronometerUp.start();

    }
}
