package com.t3h.toeic.model;

public class Part5 {
    private int id;
    private String question;
    private String a;
    private String b;
    private String c;
    private String d;
    private String result;
    private String level;

    public Part5(int id, String question, String a, String b, String c, String d, String result, String level) {
        this.id = id;
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.result = result;
        this.level = level;
    }

    public Part5(String question, String a, String b, String c, String d, String result, String level) {
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.result = result;
        this.level = level;
    }

    public Part5() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Part5{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", result='" + result + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
