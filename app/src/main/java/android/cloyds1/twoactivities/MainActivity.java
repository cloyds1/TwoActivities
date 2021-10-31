package android.cloyds1.twoactivities;

import android.cloyds1.twoactivities.databinding.ActivityMainBinding;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
    }

    public void launchSecondActivity(View view) {

        Log.d(LOG_TAG, "Button clicked!");

        int id = view.getId();
        Intent intent = new Intent(this, SecondActivity.class);

        if(id == button1.getId()){
            intent.putExtra("passageId", 1);
        }

        else if(id == button2.getId()){
            intent.putExtra("passageId", 2);
        }

        else if(id == button3.getId()){
            intent.putExtra("passageId", 3);
        }

        startActivity(intent);

    }

}