package com.saugat984707.simplegame;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements View.OnClickListener {
GameView gameView;
    private Button flowerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView = new GameView(this);
////

        FrameLayout GameLayout = new FrameLayout(this);
        LinearLayout buttonlayout = new LinearLayout(this);



        GameLayout.addView(gameView);
        GameLayout.addView(buttonlayout);
        setContentView(GameLayout);
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameView.killThread();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        gameView.onDestroy();
    }

    @Override
    public void onClick(View v) {


    }
}
