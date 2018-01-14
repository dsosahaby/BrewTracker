package haby.sosa.daniel.brewtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {

    private ImageButton brewBttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        // ---Define onCreate Variables--- \\
        brewBttn = (ImageButton) findViewById(R.id.brewBttn);



        // ---Listeners--- \\
        brewBttn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                //Toast.makeText(HomeScreen.this, "Brew Button Works", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeScreen.this, BrewScreen.class));


            }
        });
    }
}
