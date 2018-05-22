package app.trylingual.Model.englishQuiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import app.trylingual.R;

public class EnglishTriviaVerb extends AppCompatActivity {
    Button UKtrivquiz1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_trivia_verb);

        UKtrivquiz1 = findViewById(R.id.btn_UKverbtrivquiz);


    }
}
