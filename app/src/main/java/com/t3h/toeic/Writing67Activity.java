package com.t3h.toeic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.t3h.toeic.adapter.Part6Part7Adapter;
import com.t3h.toeic.database.DBManager;
import com.t3h.toeic.model.Part6Part7;

import java.util.List;


public class Writing67Activity extends AppCompatActivity {
    private static final String TAG = "ha";
    private Part6Part7Adapter part6Part7Adapter;
    private List<Part6Part7> part6Part7s;
    private RecyclerView lvPart6Part7;
    private DBManager dbManager;
    private TextView tvQuestionPart67;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writing_67);
        initView();
    }

    private void initView() {
        dbManager = new DBManager(this);
        lvPart6Part7 = findViewById(R.id.lv_list_question);
        tvQuestionPart67 = findViewById(R.id.tv_part67_question);

        part6Part7Adapter = new Part6Part7Adapter(this);
        lvPart6Part7.setAdapter(part6Part7Adapter);
        getData();

    }

    private void getData() {
        part6Part7s = dbManager.getPart6Part7();
        Log.e(TAG, "getData: " + part6Part7s.size() + part6Part7s.toString());
        part6Part7Adapter.setData(part6Part7s);
        tvQuestionPart67.setText(part6Part7s.get(1).getWritingPassageContent());
    }
}
