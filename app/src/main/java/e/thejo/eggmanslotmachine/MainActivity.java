package e.thejo.eggmanslotmachine;

import android.graphics.drawable.Drawable;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Handler;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button Spinbtn;
    private ImageView slot1;
    private ImageView slot2;
    private ImageView slot3;
    private SeekBar seek;
    private Handler handler;
    private Update update;
    private Update2 update2;
    private Update3 update3;
    private TextView score;
    private int speedvalue = 90;
    private int slotIndex1 = 0;
    private int slotIndex2 = 0;
    private int slotIndex3 = 0;
    private int gameScore = 0;

    private void Spin()
    {
        slotIndex1++;
        if (slotIndex1 > 5)
            slotIndex1 = 0;
        Drawable image = getResources().getDrawable(R.drawable.sonic);;
        if (slotIndex1 == 0) {
            image = getResources().getDrawable(R.drawable.sonic);
        }
        else if (slotIndex1 == 1) {
            image = getResources().getDrawable(R.drawable.tails);
        }
        else if (slotIndex1 == 2) {
            image = getResources().getDrawable(R.drawable.knuckles);
        }
        else if (slotIndex1 == 3) {
            image = getResources().getDrawable(R.drawable.amy);
        }
        else if (slotIndex1 == 4) {
            image = getResources().getDrawable(R.drawable.shadow);
        }
        else if (slotIndex1 == 5) {
            image = getResources().getDrawable(R.drawable.eggman);
        }
        slot1.setImageDrawable(image);
    }

    private void Spin2()
    {
        slotIndex2++;
        if (slotIndex2 > 5)
            slotIndex2 = 0;
        Drawable image = getResources().getDrawable(R.drawable.sonic);;
        if (slotIndex2 == 0) {
            image = getResources().getDrawable(R.drawable.sonic);
        }
        else if (slotIndex2 == 1) {
            image = getResources().getDrawable(R.drawable.tails);
        }
        else if (slotIndex2 == 2) {
            image = getResources().getDrawable(R.drawable.knuckles);
        }
        else if (slotIndex2 == 3) {
            image = getResources().getDrawable(R.drawable.amy);
        }
        else if (slotIndex2 == 4) {
            image = getResources().getDrawable(R.drawable.shadow);
        }
        else if (slotIndex2 == 5) {
            image = getResources().getDrawable(R.drawable.eggman);
        }
        slot2.setImageDrawable(image);
    }

    private void Spin3()
    {
        slotIndex3++;
        if (slotIndex3 > 5)
            slotIndex3 = 0;
        Drawable image = getResources().getDrawable(R.drawable.sonic);;
        if (slotIndex3 == 0) {
            image = getResources().getDrawable(R.drawable.sonic);
        }
        else if (slotIndex3 == 1) {
            image = getResources().getDrawable(R.drawable.tails);
        }
        else if (slotIndex3 == 2) {
            image = getResources().getDrawable(R.drawable.knuckles);
        }
        else if (slotIndex3 == 3) {
            image = getResources().getDrawable(R.drawable.amy);
        }
        else if (slotIndex3 == 4) {
            image = getResources().getDrawable(R.drawable.shadow);
        }
        else if (slotIndex3 == 5) {
            image = getResources().getDrawable(R.drawable.eggman);
        }
        slot3.setImageDrawable(image);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinbtn = findViewById(R.id.Spinbtn);
        slot1 = findViewById(R.id.Slot1);
        slot2 = findViewById(R.id.Slot2);
        slot3 = findViewById(R.id.Slot3);
        seek = findViewById(R.id.Speed);
        handler = new Handler();
        update = new Update();
        update2 = new Update2();
        update3 = new Update3();
        score = findViewById(R.id.Score);
        Random slotRan = new Random();
        slotIndex1 = slotRan.nextInt(5);
        slotIndex2 = slotRan.nextInt(5);
        slotIndex3 = slotRan.nextInt(5);


        if (savedInstanceState != null)
        {
            gameScore = savedInstanceState.getInt("GameScore");
            slotIndex1 = savedInstanceState.getInt("slot1");
            slotIndex2 = savedInstanceState.getInt("slot2");
            slotIndex3 = savedInstanceState.getInt("slot3");
        }
        score.setText("Score: " + gameScore);

        Drawable image = getResources().getDrawable(R.drawable.sonic);;
        if (slotIndex1 == 0) {
            image = getResources().getDrawable(R.drawable.sonic);
        }
        else if (slotIndex1 == 1) {
            image = getResources().getDrawable(R.drawable.tails);
        }
        else if (slotIndex1 == 2) {
            image = getResources().getDrawable(R.drawable.knuckles);
        }
        else if (slotIndex1 == 3) {
            image = getResources().getDrawable(R.drawable.amy);
        }
        else if (slotIndex1 == 4) {
            image = getResources().getDrawable(R.drawable.shadow);
        }
        else if (slotIndex1 == 5) {
            image = getResources().getDrawable(R.drawable.eggman);
        }
        slot1.setImageDrawable(image);

        if (slotIndex2 == 0) {
            image = getResources().getDrawable(R.drawable.sonic);
        }
        else if (slotIndex2 == 1) {
            image = getResources().getDrawable(R.drawable.tails);
        }
        else if (slotIndex2 == 2) {
            image = getResources().getDrawable(R.drawable.knuckles);
        }
        else if (slotIndex2 == 3) {
            image = getResources().getDrawable(R.drawable.amy);
        }
        else if (slotIndex2 == 4) {
            image = getResources().getDrawable(R.drawable.shadow);
        }
        else if (slotIndex2 == 5) {
            image = getResources().getDrawable(R.drawable.eggman);
        }
        slot2.setImageDrawable(image);

        if (slotIndex3 == 0) {
            image = getResources().getDrawable(R.drawable.sonic);
        }
        else if (slotIndex3 == 1) {
            image = getResources().getDrawable(R.drawable.tails);
        }
        else if (slotIndex3 == 2) {
            image = getResources().getDrawable(R.drawable.knuckles);
        }
        else if (slotIndex3 == 3) {
            image = getResources().getDrawable(R.drawable.amy);
        }
        else if (slotIndex3 == 4) {
            image = getResources().getDrawable(R.drawable.shadow);
        }
        else if (slotIndex3 == 5) {
            image = getResources().getDrawable(R.drawable.eggman);
        }
        slot3.setImageDrawable(image);

        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                speedvalue = 100 - i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState)
    {
        super.onSaveInstanceState(saveInstanceState);
        saveInstanceState.putInt("GameScore", gameScore);
        saveInstanceState.putInt("slot1", slotIndex1);
        saveInstanceState.putInt("slot2", slotIndex2);
        saveInstanceState.putInt("slot3", slotIndex3);
    }

    boolean Switch = false;
    public void buttonHandler(View v)
    {
        if (!Switch)
        {
            handler.postDelayed(update, speedvalue + 35);
            handler.postDelayed(update2, speedvalue + 100);
            handler.postDelayed(update3, speedvalue + 53);
            Spinbtn.setText("Stop");
        }
        else
        {
            Spinbtn.setText("Start");
            handler.removeCallbacks(update);
            handler.removeCallbacks(update2);
            handler.removeCallbacks(update3);
            int total = 0;
            if (slotIndex1 == 0 && slotIndex2 == 0 && slotIndex3 == 0) {
                total += 20 * 20 * 20;
            }
            else if (slotIndex1 == 1 && slotIndex2 == 1 && slotIndex3 == 1) {
                total += 10 * 10 * 10;
            }
            else if (slotIndex1 == 2 && slotIndex2 == 2 && slotIndex3 == 2) {
                total += 5 * 5 * 5;
            }
            else if (slotIndex1 == 3 && slotIndex2 == 3 && slotIndex3 == 3) {
                total += 15 * 15 * 15;
            }
            else if (slotIndex1 == 4 && slotIndex2 == 4 && slotIndex3 == 4) {
                total += 30 * 30 * 30;
            }
            else if (slotIndex1 == 5 && slotIndex2 == 5 && slotIndex3 == 5) {
                gameScore = 0;
                Toast.makeText(this, "Ma ha ha ha ha. You lose!", Toast.LENGTH_SHORT).show();
            }
            else {
                if (slotIndex1 == 0)
                    total += 20;
                else if (slotIndex1 == 1)
                    total += 10;
                else if (slotIndex1 == 2)
                    total += 5;
                else if (slotIndex1 == 3)
                    total += 15;
                else if (slotIndex1 == 4)
                    total += 30;

                if (slotIndex2 == 0)
                    total += 20;
                else if (slotIndex2 == 1)
                    total += 10;
                else if (slotIndex2 == 2)
                    total += 5;
                else if (slotIndex2 == 3)
                    total += 15;
                else if (slotIndex2 == 4)
                    total += 30;

                if (slotIndex3 == 0)
                    total += 20;
                else if (slotIndex3 == 1)
                    total += 10;
                else if (slotIndex3 == 2)
                    total += 5;
                else if (slotIndex3 == 3)
                    total += 15;
                else if (slotIndex3 == 4)
                    total += 30;
            }

            gameScore += total;
            if (gameScore < 0)
                gameScore = 0;

            score.setText("Score: " + gameScore);
        }
        Switch = !Switch;
    }

    public void gotoRules(View v)
    {
        Intent i = new Intent(this, rules.class);
        i.putExtra("score", gameScore);
        startActivity(i);
    }

    private class Update implements Runnable
    {
        @Override
        public void run()
        {
            Spin();
            handler.postDelayed(update, speedvalue + 35);
        }
    }

    private class Update2 implements Runnable
    {
        @Override
        public void run()
        {
            Spin2();
            handler.postDelayed(update2, speedvalue + 100);
        }
    }

    private class Update3 implements Runnable
    {
        @Override
        public void run()
        {
            Spin3();
            handler.postDelayed(update3, speedvalue + 10);
        }
    }
}
