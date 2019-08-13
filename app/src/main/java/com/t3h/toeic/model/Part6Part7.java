package com.t3h.toeic.model;

import java.util.List;

public class Part6Part7 {
    private String question;
    private List<WritingQuestions> writingQuestions;

    public Part6Part7(String question, List<WritingQuestions> writingQuestions) {
        this.question = question;
        this.writingQuestions = writingQuestions;
    }

    public Part6Part7() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<WritingQuestions> getWritingQuestions() {
        return writingQuestions;
    }

    public void setWritingQuestions(List<WritingQuestions> writingQuestions) {
        this.writingQuestions = writingQuestions;
    }
}
