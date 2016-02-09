package se.letsbringit.reuselayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Instansvariabler
    RelativeLayout mainContainer;
    TextView greeting;
    // Klassvariabler

    // Konstruktioner

    // Instansmetoder

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Tilldela mainContent motsvarande
        mainContainer = (RelativeLayout) findViewById(R.id.main_container);
        greeting = new TextView(this); // Skapa en textView
        // Klassmetoder

        // Ändra på attributen på vår textview

        greeting.setText("Hell world"); // TODO: Fixa i strings.xml
        greeting.setTextSize(20);


            // Lägg till text i main_container

        mainContainer.addView(greeting);


    }
}
