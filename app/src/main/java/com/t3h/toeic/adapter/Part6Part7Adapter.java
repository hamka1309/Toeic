package com.t3h.toeic.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.t3h.toeic.R;
import com.t3h.toeic.model.Part6Part7;

import java.util.List;

public class Part6Part7Adapter  extends RecyclerView.Adapter<Part6Part7Adapter.ViewHolder>{
    private LayoutInflater inflater;
    private List<Part6Part7> data;
    private String TAG="haq";
    Context context;

    public Part6Part7Adapter(Context context) {
        inflater = LayoutInflater.from(context);
        this.context=context;
    }

    public void setData(List<Part6Part7> data) {
        this.data = data;
        Log.e(TAG, "setData: "+data.size()+data.toString() );
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
        Toast.makeText(context,viewHolder.rbA.getText(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvQuestion;
        private RadioButton rbA,rbB,rbC,rbD;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvQuestion = itemView.findViewById(R.id.tv_item_question);
            rbA = itemView.findViewById(R.id.radioButton_part67_a);
            rbB = itemView.findViewById(R.id.radioButton_part67_b);
            rbC = itemView.findViewById(R.id.radioButton_part67_c);
            rbD = itemView.findViewById(R.id.radioButton_part67_d);
        }

        public void bindData(Part6Part7 s) {
            tvQuestion.setText(s.getWritingQuestionContent());
            rbA.setText(s.getWritingQuestionChoice1());
            rbB.setText(s.getWritingQuestionChoice2());
            rbC.setText(s.getWritingQuestionChoice3());
            rbD.setText(s.getWritingQuestionChoice4());

        }
    }
}
