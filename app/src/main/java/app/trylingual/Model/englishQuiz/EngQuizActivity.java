package app.trylingual.Model.englishQuiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import app.trylingual.Model.englishQuiz.Level1.EngQuizlv1;
import app.trylingual.Model.englishQuiz.Level2.EngQuizlv2.EngQuizlv2;
import app.trylingual.Model.englishQuiz.Level3.EngQuizlv3.EngQuizlv3;
import app.trylingual.R;

public class EngQuizActivity extends AppCompatActivity {

    Button btnuklevel1, btnuklevel2, btnuklevel3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_quiz);

        btnuklevel1 = findViewById(R.id.btn_uklv1);
        btnuklevel2 = findViewById(R.id.btn_uklv2);
        btnuklevel3 = findViewById(R.id.btn_uklv3);

        btnuklevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uklevel1();
            }
        });

        btnuklevel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uklevel2();
            }
        });

        btnuklevel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uklevel3();
            }
        });
    }
    private void uklevel1(){
        Intent intent = new Intent(EngQuizActivity.this, EngQuizlv1.class);
        startActivity(intent);
    }
    private void uklevel2(){
        Intent intent = new Intent(EngQuizActivity.this, EngQuizlv2.class);
        startActivity(intent);
    }
    private void uklevel3(){
        Intent intent = new Intent(EngQuizActivity.this, EngQuizlv3.class);
        startActivity(intent);
    }


}
