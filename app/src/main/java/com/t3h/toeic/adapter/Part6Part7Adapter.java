package com.t3h.toeic.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.t3h.toeic.OnOptionSelected;
import com.t3h.toeic.R;
import com.t3h.toeic.model.Part6Part7;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

public class Part6Part7Adapter extends RecyclerView.Adapter<Part6Part7Adapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<Part6Part7> data;
    private OnOptionSelected onOptionSelected;
    private String TAG = "haq";
    private int checkedPosition = -1;
    Context context;
    int i=0;
    private int score=0;

    private boolean submit = false;
    private boolean next = false;

    public void setSubmit(boolean submit) {
        this.submit = submit;
        notifyDataSetChanged();
    }

    public int getI() {
        return i;
    }

    public int getScore() {
        return score;
    }

    public void setNext(boolean next) {
        this.next = next;
    }

    public boolean isNext() {
        return next;
    }

    public void setOnOptionSelected(OnOptionSelected onOptionSelected) {
        this.onOptionSelected = onOptionSelected;
    }

    public Part6Part7Adapter(Context context) {
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    public void setData(List<Part6Part7> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = inflater.inflate(R.layout.item_writing, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Part6Part7 item = data.get(i);
        viewHolder.bindData(item);

    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvQuestion;
        private RadioGroup radioGroup_choise;
        private RadioButton rbA, rbB, rbC, rbD;
        List<Part6Part7> part6Part7s;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            tvQuestion = itemView.findViewById(R.id.tv_item_question);
            rbA = itemView.findViewById(R.id.radioButton_part67_a);
            rbB = itemView.findViewById(R.id.radioButton_part67_b);
            rbC = itemView.findViewById(R.id.radioButton_part67_c);
            rbD = itemView.findViewById(R.id.radioButton_part67_d);

            radioGroup_choise = itemView.findViewById(R.id.radioGroup_choise);

        }

        public void bindData(Part6Part7 s) {
            Part6Part7 congViec = data.get(getAdapterPosition());
            tvQuestion.setText(s.getWritingQuestionContent());
            rbA.setText(s.getWritingQuestionChoice1());
            rbB.setText(s.getWritingQuestionChoice2());
            rbC.setText(s.getWritingQuestionChoice3());
            rbD.setText(s.getWritingQuestionChoice4());

            Log.e(TAG, "bindData: "+congViec.getWritingQuestionAnswer() );
            changeChecked(rbA, congViec.getWritingQuestionChoice1().equals(congViec.getWritingQuestionAnswer()),getAdapterPosition());
            changeChecked(rbB, congViec.getWritingQuestionChoice2().equals(congViec.getWritingQuestionAnswer()),getAdapterPosition());
            changeChecked(rbC, congViec.getWritingQuestionChoice3().equals(congViec.getWritingQuestionAnswer()),getAdapterPosition());
            changeChecked(rbD, congViec.getWritingQuestionChoice4().equals(congViec.getWritingQuestionAnswer()),getAdapterPosition());
            Log.e(TAG, "bindData: "+next );
           if(next){
               rbA.setEnabled(true);
               rbB.setEnabled(true);
               rbC.setEnabled(true);
               rbD.setEnabled(true);
               rbA.setChecked(false);
               rbB.setChecked(false);
               rbC.setChecked(false);
               rbD.setChecked(false);
               rbA.setTextColor(Color.BLACK);
               rbB.setTextColor(Color.BLACK);
               rbC.setTextColor(Color.BLACK);
               rbD.setTextColor(Color.BLACK);
           }
            }
        }
        private void changeChecked(RadioButton rd, boolean check, int index) {

            if (submit) {
                rd.setEnabled(false);
                if (rd.isChecked()&&!rd.getText().toString().equals(data.get(index).getWritingQuestionAnswer())){
                    rd.setTextColor(Color.RED);
                }
                if (rd.isChecked()&&rd.getText().toString().equals(data.get(index).getWritingQuestionAnswer())){
                    rd.setTextColor(Color.GREEN);
                    i++;
                    Log.e(TAG, "changeChecked: "+score );

                }
            }
        }
    }
