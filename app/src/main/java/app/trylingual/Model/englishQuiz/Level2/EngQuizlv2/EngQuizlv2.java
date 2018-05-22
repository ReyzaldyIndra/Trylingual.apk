package app.trylingual.Model.englishQuiz.Level2.EngQuizlv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import app.trylingual.R;

public class EngQuizlv2 extends AppCompatActivity {
    private TextView scoreView, Question;
    private TextView DescQuestion;

    private Button btnEngNounc0, btnEngNounc1, btnEngNounc2, btnEngNounc3;

    private int mScore = 0;
    private String mAnswer;
    private int mQuestionNumber = 0;

    private Firebase QuestionRef, descQuestionRef, choice0Ref, choice1Ref, choice2Ref, choice3Ref, answerRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_eng_noun_quizlv1);

        scoreView =  findViewById(R.id.score);
        Question =  findViewById(R.id.question);
        DescQuestion = findViewById(R.id.desc_quest);

        btnEngNounc0 = findViewById(R.id.choice1);
        btnEngNounc1 = findViewById(R.id.choice2);
        btnEngNounc2 = findViewById(R.id.choice3);
        btnEngNounc3 = findViewById(R.id.choice4);
        updateQuestion();
        updatedescQuestion();


        btnEngNounc0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnEngNounc0.getText().equals(mAnswer)){
                    mScore = mScore + 10;
                    updateScore(mScore);
                    updateQuestion();
                    updatedescQuestion();
                    }
                else{
                    updateQuestion();
                    updatedescQuestion();
                }
            }
        });

        btnEngNounc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnEngNounc1.getText().equals(mAnswer)){
                    mScore = mScore + 10;
                    updateScore(mScore);
                    updateQuestion();
                    updatedescQuestion();}
                else{
                    updateQuestion();
                    updatedescQuestion();
                }
            }
        });

        btnEngNounc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnEngNounc2.getText().equals(mAnswer)){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    updatedescQuestion();}
                else{
                    updateQuestion();
                    updatedescQuestion();
                }
            }
        });

        btnEngNounc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnEngNounc3.getText().equals(mAnswer)){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    updatedescQuestion();}
                else{
                    updateQuestion();
                    updatedescQuestion();
                }
            }
        });
    }

    private void updateScore(int score){
        scoreView.setText(""+mScore);
    }
    public void updateQuestion() {
        QuestionRef = new Firebase("https://trylingual-0001.firebaseio.com/englishleveltwo/" + mQuestionNumber + "/question");
        QuestionRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String question = dataSnapshot.getValue(String.class);
                Question.setText(question);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
        public void updatedescQuestion(){
            descQuestionRef = new Firebase("https://trylingual-0001.firebaseio.com/englishleveltwo/"+ mQuestionNumber+"/text");
            descQuestionRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    String descQuestion = dataSnapshot.getValue(String.class);
                    DescQuestion.setText(descQuestion);

                }

                @Override
                public void onCancelled(FirebaseError firebaseError) {

                }
            });

        choice0Ref = new Firebase("https://trylingual-0001.firebaseio.com/englishleveltwo/"+ mQuestionNumber +"/answers/choice1");
        choice0Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice = dataSnapshot.getValue(String.class);
                btnEngNounc0.setText(choice);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        choice1Ref = new Firebase("https://trylingual-0001.firebaseio.com/englishleveltwo/"+ mQuestionNumber +"/answers/choice2");
        choice1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice = dataSnapshot.getValue(String.class);
                btnEngNounc1.setText(choice);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        choice2Ref = new Firebase("https://trylingual-0001.firebaseio.com/englishlevel/two/"+ mQuestionNumber +"/answers/choice3");
        choice2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice = dataSnapshot.getValue(String.class);
                btnEngNounc2.setText(choice);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        choice3Ref = new Firebase("https://trylingual-0001.firebaseio.com/englishleveltwo/"+ mQuestionNumber +"/answers/choice4");
        choice3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String choice = dataSnapshot.getValue(String.class);
                btnEngNounc3.setText(choice);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        answerRef = new Firebase("https://trylingual-0001.firebaseio.com/englishleveltwo/"+ mQuestionNumber +"/correctIndex");
        answerRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                mAnswer = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        mQuestionNumber++;
    }
}
