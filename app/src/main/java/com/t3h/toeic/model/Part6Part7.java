package com.t3h.toeic.model;

import java.util.List;

public class Part6Part7 {
    private String writingPassageID;
    private String writingPassageTitle;
    private String writingPassageContent;
    private String part;
    private String level;

    private String writingQuestionID;
    private String writingQuestionContent;
    private String writingQuestionAnswer;
    private String writingQuestionChoice1;
    private String writingQuestionChoice2;
    private String writingQuestionChoice3;
    private String writingQuestionChoice4;

    public String getWritingPassageID() {
        return writingPassageID;
    }

    public void setWritingPassageID(String writingPassageID) {
        this.writingPassageID = writingPassageID;
    }

    public String getWritingPassageTitle() {
        return writingPassageTitle;
    }

    public void setWritingPassageTitle(String writingPassageTitle) {
        this.writingPassageTitle = writingPassageTitle;
    }

    public String getWritingPassageContent() {
        return writingPassageContent;
    }

    public void setWritingPassageContent(String writingPassageContent) {
        this.writingPassageContent = writingPassageContent;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getWritingQuestionID() {
        return writingQuestionID;
    }

    public void setWritingQuestionID(String writingQuestionID) {
        this.writingQuestionID = writingQuestionID;
    }

    public String getWritingQuestionContent() {
        return writingQuestionContent;
    }

    public void setWritingQuestionContent(String writingQuestionContent) {
        this.writingQuestionContent = writingQuestionContent;
    }

    public String getWritingQuestionAnswer() {
        return writingQuestionAnswer;
    }

    public void setWritingQuestionAnswer(String writingQuestionAnswer) {
        this.writingQuestionAnswer = writingQuestionAnswer;
    }

    public String getWritingQuestionChoice1() {
        return writingQuestionChoice1;
    }

    public void setWritingQuestionChoice1(String writingQuestionChoice1) {
        this.writingQuestionChoice1 = writingQuestionChoice1;
    }

    public String getWritingQuestionChoice2() {
        return writingQuestionChoice2;
    }

    public void setWritingQuestionChoice2(String writingQuestionChoice2) {
        this.writingQuestionChoice2 = writingQuestionChoice2;
    }

    public String getWritingQuestionChoice3() {
        return writingQuestionChoice3;
    }

    public void setWritingQuestionChoice3(String writingQuestionChoice3) {
        this.writingQuestionChoice3 = writingQuestionChoice3;
    }

    @Override
    public String toString() {
        return "Part6Part7{" +
                "writingPassageID='" + writingPassageID + '\'' +
                ", writingPassageTitle='" + writingPassageTitle + '\'' +
                ", writingPassageContent='" + writingPassageContent + '\'' +
                ", part='" + part + '\'' +
                ", level='" + level + '\'' +
                ", writingQuestionID='" + writingQuestionID + '\'' +
                ", writingQuestionContent='" + writingQuestionContent + '\'' +
                ", writingQuestionAnswer='" + writingQuestionAnswer + '\'' +
                ", writingQuestionChoice1='" + writingQuestionChoice1 + '\'' +
                ", writingQuestionChoice2='" + writingQuestionChoice2 + '\'' +
                ", writingQuestionChoice3='" + writingQuestionChoice3 + '\'' +
                ", writingQuestionChoice4='" + writingQuestionChoice4 + '\'' +
                '}';
    }

    public String getWritingQuestionChoice4() {
        return writingQuestionChoice4;
    }

    public void setWritingQuestionChoice4(String writingQuestionChoice4) {
        this.writingQuestionChoice4 = writingQuestionChoice4;
    }
}
