package org.ninjabodyguard.namechooser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] nameList = {
                "Ione",
                "Alexandra",
                "Aria",
                "Artemis",
                "Cassiope",
                "Calla",
                "Athena",
                "Cameron",
                "Charlotte",
                "Chava",
                "Coral",
                "Dalia",
                "Drew",
                "Elisabeth",
                "Esther",
                "Fiona",
                "Freya",
                "Garnet",
                "Harley",
                "Hazel",
                "Isabelle",
                "Ishtar",
                "Ivy",
                "Jacqueline",
                "Jade",
                "Jordan",
                "Juliette",
                "Kira",
                "Lily",
                "Madeline",
                "Maia",
                "Micah",
                "Miriam",
                "Morgan",
                "Nadine",
                "Naomi",
                "Noelle",
                "Opal",
                "Ophelia",
                "Ophira",
                "Rachel",
                "Ramona",
                "Rona",
                "Renee",
                "Rose",
                "Ruby",
                "Scarlet",
                "Shira",
                "Shoshana",
                "Thea",
                "Viola",
                "Ziva"
        };

        Button button = (Button) findViewById(R.id.button);
        final TextView textView = (TextView) findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(nameList[new Random().nextInt(nameList.length)]);
            }
        });
    }
}
