package app.trylingual.Model;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import app.trylingual.Model.englishQuiz.Level1.EngNounDYK;
import app.trylingual.R;

public class EnglishTrivia extends AppCompatActivity {
//ini English Trivia buat yang NOUN

    Button btn_noun, btn_verb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_trivia);

        btn_noun = findViewById(R.id.btnnoun);
        btn_verb = findViewById(R.id.btnverb);

        btn_noun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            showEngTrivWrongDialog();
            }
        });

        btn_verb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EnglishTrivia.this, EngNounDYK.class);
                startActivity(intent);
            }
        });

    }

    private void showEngTrivRightDialog() {

        Toast.makeText(EnglishTrivia.this, "You're right!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(EnglishTrivia.this, EngNounDYK.class);
        startActivity(intent);

    }

    private void showEngTrivWrongDialog() {
    AlertDialog.Builder alertDialog = new AlertDialog.Builder(EnglishTrivia.this);
    alertDialog.setTitle("Wrong");
    alertDialog.setMessage("Wrong Answer!");

       // LayoutInflater inflater = this.getLayoutInflater();
       // View english_trivia = inflater.inflate(R.layout.english_trivia,null);

        alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(EnglishTrivia.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                dialogInterface.dismiss();
            }
        });
    }

}
