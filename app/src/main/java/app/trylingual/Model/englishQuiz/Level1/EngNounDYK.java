package app.trylingual.Model.englishQuiz.Level1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.trylingual.R;

public class EngNounDYK extends AppCompatActivity {

    Button btnUK_noun_dyk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_noun_dyk);

        btnUK_noun_dyk = findViewById(R.id.btn_UKnountoquiz);
        btnUK_noun_dyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EngNounDYK.this, EngNounQuizlv1.class);
                startActivity(intent);
            }
        });
    }
}
