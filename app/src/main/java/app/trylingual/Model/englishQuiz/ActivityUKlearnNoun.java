package app.trylingual.Model.englishQuiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.trylingual.Model.EnglishTrivia;
import app.trylingual.R;

public class ActivityUKlearnNoun extends AppCompatActivity {

    Button toUKtrivia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uklearn_noun);

        toUKtrivia = findViewById(R.id.btn_toUKtrivia);

        toUKtrivia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityUKlearnNoun.this, EnglishTrivia.class);
                startActivity(intent);
            }
        });
    }
}
