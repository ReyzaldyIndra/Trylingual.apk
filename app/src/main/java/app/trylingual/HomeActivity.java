package app.trylingual;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import app.trylingual.Model.englishQuiz.EngQuizActivity;


public class HomeActivity extends AppCompatActivity {

    ImageView uk, id, nd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        uk = findViewById(R.id.icon_uk);
        id = findViewById(R.id.icon_id);
        nd = findViewById(R.id.icon_nd);

        uk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, EngQuizActivity.class);
                startActivity(intent);
            }
        });
    }
}
