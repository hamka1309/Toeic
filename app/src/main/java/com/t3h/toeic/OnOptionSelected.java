package com.t3h.toeic;

import com.t3h.toeic.model.Part6Part7;

import java.util.List;

public interface OnOptionSelected {
  void onOptionSelected(int position, int itemSelected);
   void getSelected(List<Part6Part7> part6Part7s);
}
