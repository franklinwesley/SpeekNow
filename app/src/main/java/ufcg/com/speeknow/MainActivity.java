package ufcg.com.speeknow;

import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final int RESULT_SPEECH = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
//        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "pt-BR");
//        startActivityForResult(intent, RESULT_SPEECH);

        Intent intent = new Intent(this, VoiceRecognitionActivity.class);
        startActivityForResult(intent, RESULT_SPEECH);
    }
}
