package haby.sosa.daniel.brewtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.content.Intent;



public class BrewScreen extends AppCompatActivity {


    ImageButton backBttn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brew_screen);

        backBttn = (ImageButton)findViewById(R.id.backBttn);



        backBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BrewScreen.this, HomeScreen.class));


            }
        });
    }


}
