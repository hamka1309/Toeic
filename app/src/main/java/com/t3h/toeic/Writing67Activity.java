package com.t3h.toeic;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.t3h.toeic.adapter.Part6Part7Adapter;
import com.t3h.toeic.database.DBManager;
import com.t3h.toeic.model.Part6Part7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Writing67Activity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ha";
    private Part6Part7Adapter part6Part7Adapter;
    private List<Part6Part7> part6Part7s;
    private RecyclerView lvPart6Part7;
    private DBManager dbManager;
    private TextView tvQuestionPart67, tvScore, tvNumberPart67;
    private Map<String, String> getlistquestionContent;
    Button btnNextPart67;
    Button btnSubmitPart67;
    ArrayList<String> arrayList;
    int i = 1;
    String part;
    int score;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writing_67);
        initView();
    }

    private void initView() {
        dbManager = new DBManager(this);
        lvPart6Part7 = findViewById(R.id.lv_list_question_part67);
        tvQuestionPart67 = findViewById(R.id.tv_part67_question);
        btnNextPart67 = findViewById(R.id.btn_next_part67);
        btnSubmitPart67 = findViewById(R.id.btn_submit_part67);
        tvScore = findViewById(R.id.tv_score_part67);
        tvNumberPart67 = findViewById(R.id.tv_number_question);

        part6Part7Adapter = new Part6Part7Adapter(this);
        lvPart6Part7.setAdapter(part6Part7Adapter);

        btnNextPart67.setOnClickListener(this);
        btnSubmitPart67.setOnClickListener(this);

        getData();
    }

    private void getData() {
        getlistquestionContent = dbManager.getIDQuestionConten("250","7");
        Log.e(TAG, "getData: "+getlistquestionContent.toString() );
        arrayList = new ArrayList<>();
        for (String s : getlistquestionContent.keySet()) {
            arrayList.add(s);
        }
        Log.e(TAG, "getData: getlist "+arrayList.toString() );
        Intent intent = getIntent();
        part = intent.getStringExtra(MainActivity.PART550_750);
        part6Part7s = dbManager.getPart6Part7(arrayList.get(0), "7", "250");
        tvScore.setText(part6Part7Adapter.getI()*10 + "");
        tvNumberPart67.setText(i + "/" + getlistquestionContent.size());
        part6Part7Adapter.setData(part6Part7s);
        tvQuestionPart67.setText(part6Part7s.get(0).getWritingPassageContent());

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_next_part67:
                Log.e(TAG, "onClick: "+i+"  "+part6Part7s.size() );

                if(i>getlistquestionContent.size()-1)
                {
                    i=getlistquestionContent.size()-1;
                    part6Part7s = dbManager.getPart6Part7(arrayList.get(i), "7", "250");
                    part6Part7Adapter.setData(part6Part7s);
                    tvQuestionPart67.setText(getlistquestionContent.get(arrayList.get(i)));
                    part6Part7Adapter.setNext(true);
                    i++;
                    tvNumberPart67.setText(i + "/" + getlistquestionContent.size());
                    for (Part6Part7 part6Part7 : part6Part7s) {
                        part6Part7Adapter.setNext(true);
                    }
                }else {
                    part6Part7s = dbManager.getPart6Part7(arrayList.get(i), "7", "250");
                    part6Part7Adapter.setData(part6Part7s);
                    tvQuestionPart67.setText(getlistquestionContent.get(arrayList.get(i)));
                    part6Part7Adapter.setNext(true);
                    i++;
                    tvNumberPart67.setText(i + "/" + getlistquestionContent.size());
                    Log.e(TAG, "onClick: submit"+part6Part7Adapter.getI());
                    for (Part6Part7 part6Part7 : part6Part7s) {
                        part6Part7Adapter.setNext(true);
                    }
                }

                break;
            case R.id.btn_submit_part67:
                part6Part7Adapter.setSubmit(true);
                tvScore.setText(part6Part7Adapter.getScore() + "");
                part6Part7Adapter.setNext(false);
                break;
        }
    }

}
