package sg.edu.rp.webservices.demonavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    Button btnNewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab = findViewById(R.id.fab);
        btnNewActivity = findViewById(R.id.button);

        btnNewActivity.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent i = new Intent(MainActivity.this, NewActivity.class);
                                                  startActivity(i);
                                              }

                                          }
        );

        fab.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                              //action
                                              }

                                          }
        );



    }

}