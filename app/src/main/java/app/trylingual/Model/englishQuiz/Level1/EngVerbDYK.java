package app.trylingual.Model.englishQuiz.Level1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.trylingual.R;

public class EngVerbDYK extends AppCompatActivity {

    Button btnUK_verb_dyk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_verb_dyk);

        btnUK_verb_dyk = findViewById(R.id.btn_UKnountoquiz);
        btnUK_verb_dyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EngVerbDYK.this, EngVerbQuizlv1.class);
                startActivity(intent);
            }
        });
    }
}
