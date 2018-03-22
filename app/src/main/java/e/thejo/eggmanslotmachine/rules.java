package e.thejo.eggmanslotmachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class rules extends AppCompatActivity {

    TextView currentScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        currentScore = findViewById(R.id.currentScore);
        currentScore.setText("Current Score: " + getIntent().getIntExtra("score", 0));
    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_OK, null);
        finish();
    }
}
