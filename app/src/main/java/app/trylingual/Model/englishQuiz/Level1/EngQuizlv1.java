package app.trylingual.Model.englishQuiz.Level1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.trylingual.Model.englishQuiz.ActivityUKlearnNoun;
import app.trylingual.Model.englishQuiz.ActivityUKlearnVerb;
import app.trylingual.R;

public class EngQuizlv1 extends AppCompatActivity {

    Button btnuk_nounlv1,btnuk_verblv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_quizlv1);

        btnuk_nounlv1 = findViewById(R.id.uk_nounlv1);
        btnuk_verblv1 = findViewById(R.id.uk_verblv1);

        btnuk_nounlv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UKlearnNoun();
            }
        });

        btnuk_verblv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UKlearnVerb();
            }
        });
    }
    private void UKlearnNoun() {
        Intent intent = new Intent(EngQuizlv1.this, ActivityUKlearnNoun.class);
        startActivity(intent);
    }
    private void UKlearnVerb() {
        Intent intent = new Intent(EngQuizlv1.this, ActivityUKlearnVerb.class);
        startActivity(intent);
    }
}
