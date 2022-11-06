package jp.suntech.c21008.com.example.myphotoalbum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        HelloListener listener = new HelloListener();

        TextView textSub = findViewById(R.id.titleMain);
        textSub.setText(R.string.sub_title);

        Button downerButton = findViewById(R.id.water_downer);
        downerButton.setOnClickListener(listener);

        Button upperButton = findViewById(R.id.water_upper);
        upperButton.setOnClickListener(listener);

        Button returnButton = findViewById(R.id.subButton);
        returnButton.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            Fragment sample1Fragment = new SubFragment1();
            Fragment sample2Fragment = new SubFragment2();

            switch (view.getId()) {
                case R.id.water_downer:
                    fragmentTransaction.replace(R.id.subFragment, sample1Fragment).addToBackStack(null).commit();
                    break;

                case R.id.water_upper:
                    fragmentTransaction.replace(R.id.subFragment,  sample2Fragment).addToBackStack(null).commit();
                    break;

                case R.id.subButton:
                    finish();
            }
        }
    }
}