package haby.sosa.daniel.brewtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {

    private ImageButton newBrewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        // ---Define onCreate Variables--- \\
        newBrewButton = (ImageButton) findViewById(R.id.newBrewIcon);



        // ---Listeners--- \\
        newBrewButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Toast.makeText(HomeScreen.this, "Brew Button Works", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
