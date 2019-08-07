package com.t3h.toeic;

import android.content.Intent;
import android.os.Bundle;

import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.t3h.toeic.database.DBManager;
import com.t3h.toeic.model.Part5;
import com.t3h.toeic.model.WritingPassages;
import com.t3h.toeic.model.WritingQuestions;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        DBManager dbManager = new DBManager(this);

//        dbManager.addPart5(new Part5("Market analysts are surprised that Xcell\n" +
//                "Electric's quarterly ------- have been\n" +
//                "steadily increasing by about 4 percent.","profit450","profitable","profits","profited","profitable","450"));
//        dbManager.addWritingPassages(new WritingPassages("Q002"
//                ,"Order your seed catalog now!"
//                ,"This is the largest and best known seed catalog published today, featuring over 280 pages with 1500 color photographs and including more than 500 varieties.  This book tells you everything you want to know about growing anything from seed and tell you where to get the seeds. Bulbs, vegetables, cacti, potted plants, trees, perennials and annuals-you name it."
//                ,"6"
//                ,"250"));
//        dbManager.addWritingQuestions(new WritingQuestions("Q001","Who will order this catalog?","People who like to grow plants"
//        ,"People who like to grow plants"
//        ,"People who sell vegetables"
//        ,"People who live on farms"
//        ,"People who sell catalogs","P001"));

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_level_1) {
            Intent intent = new Intent(this,Part5Activity.class);
            startActivity(intent);


        } else if (id == R.id.nav_level_2) {

        } else if (id == R.id.nav_level_3) {

        } else if (id == R.id.nav_grammar) {

        } else if (id == R.id.nav_vocabulary) {

        } else if (id == R.id.nav_solution_toiec) {

        }else if(id == R.id.nav_experience_toeic){

        }else if(id == R.id.nav_mini_test){

        }else if(id == R.id.nav_skill_test){

        }else if(id == R.id.nav_set_up){

        }else if(id == R.id.nav_support){

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
