package com.t3h.toeic;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.t3h.toeic.database.DBManager;
import com.t3h.toeic.model.Part5;

import java.util.List;

public class Part5Activity extends AppCompatActivity implements View.OnClickListener {
    private RadioGroup radioGroupChoise;
    private RadioButton radioButtonA;
    private RadioButton radioButtonB;
    private RadioButton radioButtonC;
    private RadioButton radioButtonD;
    private TextView tvQuestion,tvScore, tvNumberQuesttion;
    Button btnNext;
    List<Part5> part5s;
    String part;

    private TextView tvCheckCorrect,tvAnswer;
    int numberQuestion =0;
    int score=0;
    private String TAG="Part5Activity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part5);
        radioGroupChoise = findViewById(R.id.radioGroup_choise);
        radioButtonA = findViewById(R.id.radioButton_part5_a);
        radioButtonB = findViewById(R.id.radioButton_part5_b);
        radioButtonC = findViewById(R.id.radioButton_part67_c);
        radioButtonD = findViewById(R.id.radioButton_part67_d);
        tvQuestion = findViewById(R.id.tv_item_question);
        tvCheckCorrect = findViewById(R.id.tv_check_correct);
        tvAnswer = findViewById(R.id.tv_answer);
        tvScore=findViewById(R.id.tv_score_part67);
        tvNumberQuesttion =findViewById(R.id.tv_number_question);
        btnNext = findViewById(R.id.btn_next_part5);

        Intent intent = getIntent();
        part= intent.getStringExtra(MainActivity.PART550_750);
        DBManager dbManager = new DBManager(this);
         part5s = dbManager.getPart5Level(part);
        Log.e(TAG, "onCreate: "+part5s.toString() );
        btnNext.setOnClickListener(this);

        String Question = part5s.get(numberQuestion).getQuestion();
        tvQuestion.setText(numberQuestion+1+". "+Question);
        tvNumberQuesttion.setText(numberQuestion+1+"/"+part5s.size());
        tvScore.setText(score+"");
        radioButtonA.setText(part5s.get(numberQuestion).getA());
        radioButtonB.setText(part5s.get(numberQuestion).getB());
        radioButtonC.setText(part5s.get(numberQuestion).getC());
        radioButtonD.setText(part5s.get(numberQuestion).getD());
        tvAnswer.setText(part5s.get(numberQuestion).getResult());
        radioButtonA.setOnCheckedChangeListener(listenerRadio);
        radioButtonB.setOnCheckedChangeListener(listenerRadio);
        radioButtonC.setOnCheckedChangeListener(listenerRadio);
        radioButtonD.setOnCheckedChangeListener(listenerRadio);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_next_part5:
                if(numberQuestion>=part5s.size()-1)
                {
                    numberQuestion=part5s.size()-1;
                    String Question = part5s.get(numberQuestion).getQuestion();
                    tvNumberQuesttion.setText(numberQuestion+1+"/"+part5s.size());
                    tvQuestion.setText(numberQuestion+1+". "+Question);
                    radioButtonA.setText(part5s.get(numberQuestion).getA());
                    radioButtonB.setText(part5s.get(numberQuestion).getB());
                    radioButtonC.setText(part5s.get(numberQuestion).getC());
                    radioButtonD.setText(part5s.get(numberQuestion).getD());
                    tvScore.setText(score+"");
                    tvAnswer.setText(part5s.get(numberQuestion).getResult());
                    tvCheckCorrect.setVisibility(View.INVISIBLE);
                    radioGroupChoise.clearCheck();
                }
                else {
                    numberQuestion++;
                    String Question = part5s.get(numberQuestion).getQuestion();
                    tvNumberQuesttion.setText(numberQuestion+1+"/"+part5s.size());
                    tvQuestion.setText(numberQuestion+1+". "+Question);
                    radioButtonA.setText(part5s.get(numberQuestion).getA());
                    radioButtonB.setText(part5s.get(numberQuestion).getB());
                    radioButtonC.setText(part5s.get(numberQuestion).getC());
                    radioButtonD.setText(part5s.get(numberQuestion).getD());
                    tvScore.setText(score+"");
                    tvAnswer.setText(part5s.get(numberQuestion).getResult());
                    tvCheckCorrect.setVisibility(View.INVISIBLE);
                    radioGroupChoise.clearCheck();
                }
                Log.e(TAG, "onClick: "+numberQuestion );

                break;

        }
    }
    CompoundButton.OnCheckedChangeListener listenerRadio
            = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (b) {
                if(compoundButton.getText().equals(tvAnswer.getText()))
                {
                    tvCheckCorrect.setVisibility(View.VISIBLE);
                    compoundButton.setTextColor(Color.GREEN);
                    score+=10;
                    tvCheckCorrect.setText("Correct");
                }
                else {
                    tvCheckCorrect.setText("Incorrect");
                    compoundButton.setTextColor(Color.RED);
                    tvCheckCorrect.setVisibility(View.VISIBLE);
                }

        }
        else {
            compoundButton.setTextColor(Color.BLACK);
            radioGroupChoise.clearCheck();
            }
    }};

}
