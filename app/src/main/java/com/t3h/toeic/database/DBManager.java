package com.t3h.toeic.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.t3h.toeic.model.Part5;
import com.t3h.toeic.model.Part6Part7;
import com.t3h.toeic.model.WritingPassages;
import com.t3h.toeic.model.WritingQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBManager extends SQLiteOpenHelper {
    private Context context;
    private static int version = 1;

    public DBManager(Context context) {
        super(context, DBQuerys.DATABASE_NAME, null, version);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DBQuerys.sqlWritingQuestions);
        db.execSQL(DBQuerys.sqlWritingPassages);
        db.execSQL(DBQuerys.sqlQuerys);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (newVersion > oldVersion) {
        }
    }


    public void addPart5(Part5 part5) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DBQuerys.QUESTION, part5.getQuestion());
        values.put(DBQuerys.A, part5.getA());
        values.put(DBQuerys.B, part5.getB());
        values.put(DBQuerys.C, part5.getC());
        values.put(DBQuerys.D, part5.getD());
        values.put(DBQuerys.RESULT, part5.getResult());
        values.put(DBQuerys.LEVEL, part5.getLevel());
        db.insert(DBQuerys.TABLE_NAME, null, values);
        db.close();
    }

    public void addWritingPassages(WritingPassages writingPassages) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DBQuerys.WRITINGPASSAGESID, writingPassages.getWritingPassageID());
        values.put(DBQuerys.WRITINGPASSAGETITLE, writingPassages.getWritingPassageTitle());
        values.put(DBQuerys.WRITINGPASSAGECONTENT, writingPassages.getWritingPassageContent());
        values.put(DBQuerys.PART, writingPassages.getPart());
        values.put(DBQuerys.LEVEL, writingPassages.getLevel());
        db.insert(DBQuerys.WRITINGPASSAGES, null, values);
        db.close();
    }

    public void addWritingQuestions(WritingQuestions writingQuestions) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DBQuerys.WRITINGQUESTIONID, writingQuestions.getWritingQuestionID());
        values.put(DBQuerys.WRITINGQUESTIONCONTENT, writingQuestions.getWritingQuestionContent());
        values.put(DBQuerys.WRITINGQUESTIONANSWER, writingQuestions.getWritingQuestionAnswer());
        values.put(DBQuerys.WRITINGQUESTIONCHOICE1, writingQuestions.getWritingQuestionChoice1());
        values.put(DBQuerys.WRITINGQUESTIONCHOICE2, writingQuestions.getWritingQuestionChoice2());
        values.put(DBQuerys.WRITINGQUESTIONCHOICE3, writingQuestions.getWritingQuestionChoice3());
        values.put(DBQuerys.WRITINGQUESTIONCHOICE4, writingQuestions.getWritingQuestionChoice4());
        values.put(DBQuerys.WRITINGPASSAGESID, writingQuestions.getWritingPassageID());

        db.insert(DBQuerys.WRITINGQUESTIONS, null, values);
        db.close();
    }


    public List<Part5> getPart5Level(String level) {
        List<Part5> noteList = new ArrayList<Part5>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + DBQuerys.TABLE_NAME + " WHERE " + DBQuerys.LEVEL + " = '" + level + "'";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);


        // Duyệt trên con trỏ, và thêm vào danh sách.
        if (cursor.moveToFirst()) {
            do {
                Part5 note = new Part5();
                note.setQuestion(cursor.getString(1));
                note.setA(cursor.getString(2));
                note.setB(cursor.getString(3));
                note.setC(cursor.getString(4));
                note.setD(cursor.getString(5));
                note.setResult(cursor.getString(6));
                note.setLevel(cursor.getString(7));

                // Thêm vào danh sách.
                noteList.add(note);
            } while (cursor.moveToNext());
        }
        return noteList;
    }
    public Map<String,String> getIDQuestionConten(String level, String part)
    {
        Map<String,String> getList= new HashMap<>();

        String selelctQuery ="SELECT "+DBQuerys.WRITINGPASSAGESID+", "+DBQuerys.WRITINGPASSAGECONTENT+" FROM "+DBQuerys.WRITINGPASSAGES+
                " WHERE "+DBQuerys.LEVEL +" LIKE '"+ level +"' AND "+DBQuerys.PART+" LIKE '"+part+"'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selelctQuery,null);
        if(cursor.moveToFirst()){
            do {
                getList.put(cursor.getString(0),cursor.getString(1));
            } while (cursor.moveToNext());
        }
        return getList;
    }

    public List<Part6Part7> getPart6Part7(String passagesId, String part, String level) {
        List<Part6Part7> part6Part7s = new ArrayList<>();
        String selelctQuery ="SELECT * FROM "+DBQuerys.WRITINGPASSAGES+" AS a JOIN "+DBQuerys.WRITINGQUESTIONS+" AS b ON "+
                " a."+DBQuerys.WRITINGPASSAGESID+" LIKE b."+DBQuerys.WRITINGPASSAGESID+
        " WHERE a." + DBQuerys.LEVEL + " LIKE '" + level + "' AND a."+DBQuerys.PART+" LIKE '"+part
                +"' AND a."+DBQuerys.WRITINGPASSAGESID+" LIKE '"+passagesId+"'";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selelctQuery, null);


        // Duyệt trên con trỏ, và thêm vào danh sách.
        if (cursor.moveToFirst()) {
            do {
                Part6Part7 note = new Part6Part7();

                note.setWritingPassageID(cursor.getString(0));
                note.setWritingPassageTitle(cursor.getString(1));
                note.setWritingPassageContent(cursor.getString(2));
                note.setLevel(cursor.getString(4));
                note.setPart(cursor.getString(3));
                note.setWritingQuestionID(cursor.getString(5));
                note.setWritingQuestionContent(cursor.getString(6));
                note.setWritingQuestionAnswer(cursor.getString(7));
                note.setWritingQuestionChoice1(cursor.getString(8));
                note.setWritingQuestionChoice2(cursor.getString(9));
                note.setWritingQuestionChoice3(cursor.getString(10));
                note.setWritingQuestionChoice4(cursor.getString(11));
                note.setWritingPassageID(cursor.getString(12));

                // Thêm vào danh sách.
                part6Part7s.add(note);
            } while (cursor.moveToNext());
        }
        return part6Part7s;
    }

}