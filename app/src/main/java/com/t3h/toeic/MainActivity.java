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


    public static final String PART550_750 = "part_550_750" ;
    private static final String PART250_550 = "part_250_550";
    private static final String PART750_990 = "part_750_990";

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

//DBManager dbManager= new DBManager(this);
//        dbManager.addPart5(new Part5("Market analysts are surprised that Xcell\n" +
//                "Electric's quarterly ------- have been\n" +
//                "steadily increasing b        DBManager dbManager = new DBManager(this);y about 4 percent.","profit450","profitable","profits","profited","profitable","450"));
/////q1p7,250
//        dbManager.addWritingPassages(new WritingPassages("Q001"
//                ,"comprehension"
//                ,"Are you setting up a small business? Worried about the costs of renting office space and employing the right people? \n" +
//                "Rebus Virtual Office World can help you. With our Basic Office Deal, we can set up a virtual office for you practically overnight. \n" +
//                "We will give your business a professional image and our polite, friendly staff will handle your calls and present your business in the best possible way. We can provide you with: a professional business address, a local phone number and we will also handle mail. \n" +
//                "For a more personal approach, with the option of forwarding mail and messages to your home address, don’t hesitate to ask us about our Premier Office Deals."
//                ,"7"
//                ,"250"));
//
//                dbManager.addWritingQuestions(new WritingQuestions("P001","Where is the text from?"
//                        ,"An advertisement for a new business service"
//        ,"A message from a business to a current client"
//        ,"An advertisement for a new business service"
//        ,"An email from one business worker to another"
//        ,"A newspaper article about a new business’s success \n","Q001"));
//
//        dbManager.addWritingQuestions(new WritingQuestions("P002"
//                ,"What does the service provide?"
//                ,"Off-site staff to perform general office duties"
//                ,"Off-site staff to perform general office duties"
//                ," A site where several businesses can locate their offices"
//                ,"Advice on how to make your business more professional "
//                ,"Temporary staff for local businesses "
//                ,"Q001"));
//
//        dbManager.addWritingQuestions(new WritingQuestions("P003"
//                ,"Which of the following is not included in the Basic Office deal?"
//                ,"A mail-forwarding service "
//                ,"A polite receptionist "
//                ,"A mail-forwarding service "
//                ,"A professional address "
//                ,"A telephone-answering service  "
//                ,"Q001"));
////q2p7,250
//        dbManager.addWritingPassages(new WritingPassages("Q002"
//                ,"comprehension"
//                ,"Dear Helen,\n" +
//                "I would like to congratulate you on organising such an excellent and informative workshop. I know a lot of people learnt a great deal from it.  Can you pass on my thanks to Doctor Friedman for his fascinating talk on Staff Motivation?  I realise how lucky we were that he was able to find the time for us.  The feedback from the staff was very positive.  Let’s hope we actually see an improvement in staff motivation as a result!\n" +
//                "By the way, I’m missing my list of addresses of the delegates who attended.  Did I happen to leave it in your office?  It’s just that I haven’t seen it since our meeting on Friday.\n" +
//                "Thanks again for a great day,\n" +
//                "Anne"
//                ,"7"
//                ,"250"));
//
//
//        dbManager.addWritingQuestions(new WritingQuestions("P004"
//                ,"What is the main objective of the message?"
//                ,"to praise  "
//                ,"to inform "
//                ," to accuse  "
//                ,"to make a request  "
//                ,"to praise  "
//                ,"Q002"));
//        dbManager.addWritingQuestions(new WritingQuestions("P005"
//                ,"What can be implied about Dr Friedman?"
//                ,"He has a very busy schedule"
//                ,"It included several talks."
//                ,"He has a very busy schedule"
//                ,"He is a leading expert on staff motivation"
//                ,"nne knows him better than Helen does. \n "
//                ,"Q002"));
//        dbManager.addWritingQuestions(new WritingQuestions("P006"
//                ,"What has happened to the address list?"
//                ,"Anne has lost it. "
//                ,"Anne has lost it. "
//                ,"Anne has found it. "
//                ,"Anne has sent it to Helen.  "
//                ,"Anne has completed it.  "
//                ,"Q002"));
//
//        //q3p7,250
//        dbManager.addWritingPassages(new WritingPassages("Q003"
//                ,"comprehension"
//                ,"Here’s a mouth-watering cookie recipe for you to try at home. You will need two cups each of margarine, white sugar and brown sugar; four eggs, " +
//                "\n four cups of flour, 1 teaspoon of baking powder, a pinch of salt and a cup of milk chocolate chips. First of all, pre-heat the oven to 350 degrees Fahrenheit. Take a large bowl and cream together the margarine and sugar until they are smooth.  Then add the eggs, one by one.  Sift the flour and baking powder into the mixture and add the salt. Finally add the chocolate chips.  Drop spoonfuls of the mixture onto ungreased cookie sheets and bake for eight to ten minutes until the edges are golden brown.  Cool for one hour before eating."
//                ,"7"
//                ,"250"));
//
//        dbManager.addWritingQuestions(new WritingQuestions("P007"
//                ,"Which of the following is NOT an ingredient in the recipe?"
//                ,"cream"
//                ,"cream"
//                ,"flour  "
//                ,"eggs"
//                ,"margarine"
//                ,"Q003"));
//
//        dbManager.addWritingQuestions(new WritingQuestions("P008"
//                ,"Which of the following is NOT an ingredient in the recipe?"
//                ,"cream"
//                ,"cream"
//                ,"flour  "
//                ,"eggs"
//                ,"margarine"
//                ,"Q003"));
//
//        dbManager.addWritingQuestions(new WritingQuestions("P009"
//                ,"What must the cook do first?"
//                ,"Turn on the oven"
//                ,"Put the margarine and sugar in a bowl "
//                ,"Turn on the oven"
//                ,"Sift the flour "
//                ,"Break the eggs "
//                ,"Q003"));
//
//        dbManager.addWritingQuestions(new WritingQuestions("P010"
//                ,"Which of the following items is needed to make this recipe?"
//                ,"a sieve"
//                ,"a microwave "
//                ,"a sieve"
//                ,"a saucepan"
//                ,"a knife"
//                ,"Q003"));
//        dbManager.addWritingQuestions(new WritingQuestions("P011"
//                ,"Which of the following ingredients is added last?"
//                ,"chocolate chips"
//                ,"salt "
//                ,"baking powder"
//                ,"chocolate chips"
//                ,"eggs "
//                ,"Q003"));
//
//        //q1p7,550
//        dbManager.addWritingPassages(new WritingPassages("Q004"
//                ,"comprehension"
//                ,"A new ruling which came into effect last week requires some homeowners to purchase new smoke alarms.  The ordinance states that there should be a fire alarm installed in every bedroom of the house, and these alarms must comply with certain safety standards. Some local residents are displeased at these new regulations.  Gwen Ellis of McKinley says that to meet with the new regulations, she has to buy five new alarms to replace the ones she installed just six months ago.  With fire alarms costing up to $20 apiece, this is an unwelcome ruling for many people. Fortunately, the McKinley Fire Department is offering grants for homeowners and will provide and install new fire alarms free of charge.  If you have small children or are older than 65 years of age, you may be eligible for these.  The McKinley Fire Department has 5,000 smoke alarms to give away.  To inquire about obtaining a free alarm, or to find out whether you qualify, call 692-569-0372"
//                ,"7"
//                ,"550"));
//        dbManager.addWritingQuestions(new WritingQuestions("P012"
//                ,"Which of the following is true about the new rule?"
//                ,"All fire alarms must be of a certain quality."
//                ,"Every house should have five fire alarms. "
//                ,"All fire alarms must be of a certain quality."
//                ,"All fire alarms need to first be approved by the Fire Department. "
//                ,"All fire alarms must be less than six months old.  "
//                ,"Q004"));
//        dbManager.addWritingQuestions(new WritingQuestions("P013"
//                ,"How much do five fire alarms cost?"
//                ,"$100 "
//                ,"$20 "
//                ,"$100 "
//                ,"$120 "
//                ,"$4"
//                ,"Q004"));
//        dbManager.addWritingQuestions(new WritingQuestions("P014"
//                ,"Which of the following people may be able to receive a free fire alarm?"
//                ,"an elderly couple"
//                ,"an elderly couple"
//                ,"a family of two adults and two teenagers"
//                ,"a woman living alone "
//                ,"a man who owns his own home "
//                ,"Q004"));
//        dbManager.addWritingQuestions(new WritingQuestions("P015"
//                ,"What does the number 5,000 refer to?"
//                ,"the number of smoke alarms which are available free to certain people \n"
//                ,"the number of people who are eligible for free smoke alarms "
//                ,"the number of smoke alarms which need to be replaced in the town of McKinley "
//                ,"the number of smoke alarms which have already been installed by the Fire Department "
//                ,"the number of smoke alarms which are available free to certain people \n"
//                ,"Q004"));
//        dbManager.addWritingQuestions(new WritingQuestions("P015"
//                ,"Why did Gwen Ellis have to buy new smoke alarms?"
//                ,"her previous alarms didn’t meet the safety regulations "
//                ,"her old alarms stopped working "
//                ,"she now has a young family "
//                ,"her previous alarms didn’t meet the safety regulations "
//                ,"she has just moved into a new house "
//                ,"Q004"));
//
//        //p1part7,750
//        dbManager.addWritingPassages(new WritingPassages("Q005"
//                ,"Switch to Energy First"
//                ,"Energy First is one of the UK’s most innovative energy suppliers. We were the first energy supplier in the country to offer smart meters free of charge to our customers. These computerized meters submit automatic electricity readings for once an hour and once daily for gas. This information goes directly to the customer’s online account, allowing them to view and monitor energy usage. By understanding how much money they are spending on energy, we strongly believe that people can take control of how much energy they use and make significant savings to their monthly bills. \n" +
//                "If you want to benefit from our smart meters, all you have to do is make us your energy supplier. Switching is simple. The first step is to click the ‘show prices’ button below to compare our tariff with that of your current provider. \n" +
//                "If you decide to go ahead, apply using our simple online form. We’ll handle the rest, and keep you regularly updated with the progress.. There’s no need to contact your current supplier. \n" +
//                "If, within 7 days of submitting your form, you change your mind about switching energy suppliers, don’t worry. We give you a 7-day cooling-off period during which you can cancel your application with no penalty.\n" +
//                "It will take approximately 5 weeks for us to complete the process of transferring you to our supply. A week before your supply goes live, we will email you to confirm a start date. \n" +
//                "Once you have become a customer, you’ll be contacted over the phone by a local installer to arrange a convenient time to fit your smart meters. You will need to be at home when these are fitted. Once they are installed, you can check your energy use online. Until then, you can submit monthly readings online in order to obtain an accurate bill."
//                ,"7"
//                ,"750"));
//
//        dbManager.addWritingQuestions(new WritingQuestions("P016"
//                ,"What is the purpose of smart meters?"
//                ,"to show customers how much energy they use "
//                ,"to reduce the costs of energy bills "
//                ,"to inform customers which suppliers offer the best rates "
//                ,"to allow customers to pay their bills online "
//                ,"to show customers how much energy they use "
//                ,"Q005"));
//        dbManager.addWritingQuestions(new WritingQuestions("P017"
//                ," Customers switching to Energy First do NOT need to"
//                ,"inform the company that currently provides their energy"
//                ,"complete an application form online "
//                ,"inform the company that currently provides their energy"
//                ,"be at home when the meters are installed "
//                ," allow 6 weeks for the suppliers to be switched "
//                ,"Q005"));
//        dbManager.addWritingQuestions(new WritingQuestions("P018"
//                ," What can be inferred from the passage?"
//                ," You have to pay a fine if you cancel your application after 7 days. "
//                ,"Energy First offers cheaper energy rates than other companies."
//                ,"inform the company that currently provides their energy"
//                ," You have to pay a fine if you cancel your application after 7 days. "
//                ," All Energy First customers must have smart meters if they want accurate bills. \n"
//                ,"Q005"));
//        dbManager.addWritingQuestions(new WritingQuestions("P019"
//                ,"Once customers’ supplies go live, they will soon receive"
//                ," a phone call from a meter installer."
//                ," a phone call from a meter installer."
//                ,"a smart meter in the mail."
//                ,"an energy bill from their previous suppliers."
//                ,"a meter reading from the new suppliers."
//                ,"Q005"));
////p2part7,750
//        dbManager.addWritingPassages(new WritingPassages("Q006"
//                ,"Switch to Energy First"
//                ,"We'll beat: PC Express, Mercury Com, Arnot, Megabytes\n" +
//                "\n" +
//                "At Meteor Electronics, we're always confident that we can give you the best prices for all the products in our stores, but if you discover that one of the competitors listed above offer the same product more cheaply than we do, call 0800 686 686. We'll not only match their price, but we promise to beat it by 10% of the difference.\n" +
//                "\n" +
//                "Terms and conditions apply:\n" +
//                "\n" +
//                "The product must be exactly the same model as the one sold on our website\n" +
//                "The product offered by the competitor must be displayed on their website. It must be in stock and ready for delivery.\n" +
//                "The competitor’s nearest store where the product is in stock must be within 30 miles of the customer’s home.\n" +
//                "The product must be in stock on our website.\n" +
//                "Our offer applies only to the price of the product, and does not cover delivery\n" +
//                "This offer only applies to single purchases, not multiple purchases\n" +
//                "Our offer applies up to seven days after you have made your purchase from our competitor’s store, allowing you to return the item with no penalty."
//                ,"7"
//                ,"750"));
//        dbManager.addWritingQuestions(new WritingQuestions("P020"
//                ,"This article gives information about:"
//                ,"a price promise "
//                ,"a sale"
//                ,"a price promise "
//                ,"a new store "
//                ,"a warrantee "
//                ,"Q006"));
//        dbManager.addWritingQuestions(new WritingQuestions("P021"
//                ,"PC Express sells a computer for $500 and Meteor Electronics sells exactly the same computer for $540. According to the article you can buy the computer from Meteor Electronics for:"
//                ,"$496 "
//                ,"$450 "
//                ,"$490"
//                ,"$496 "
//                ,"$500"
//                ,"Q006"));
//        dbManager.addWritingQuestions(new WritingQuestions("P022"
//                ,"Which of the following is NOT a condition of this offer?"
//                ,"The price must be at least 10% lower on the competitor’s website."
//                ,"The price must be at least 10% lower on the competitor’s website."
//                ,"The item must be available on both online stores"
//                ," The two items must be identical. "
//                ,"The price of the items must not include delivery. \n"
//                ,"Q006"));
//
//
//    //p3,part7,750
//        dbManager.addWritingPassages(new WritingPassages("Q007"
//                ,"Switch to Energy First"
//                ,"We are delighted to offer for sale this dry cleaning company which was established 13 years ago. It has been in the hands of the current owner for the last 7 years, who now intends to relocate.  It is located on a busy high street and is part of a parade of shops. \n" +
//                "\n" +
//                "The business provides a dry cleaning service, alterations, shoe repairs and a free collection and delivery service. The positive attributes of the business are: \n" +
//                "Loyal clientele. \n" +
//                "Fully equipped premises\n" +
//                "Turnover of $105,600 pa\n" +
//                "An easily run operation.\n" +
//                "Loyal, trained staff\n" +
//                "Low rent, rates and overheads\n" +
//                "A niche operation with little competition.\n" +
//                "Good local reputation\n" +
//                "The concern currently employs 1 full time employee who has a good understanding of the business. Until now, she has not had a management role, as the owner has had full involvement in the day to day running of the business. However, she is very capable of managing. If required, the owner would be able to provide extensive training to the new owners during the handover period. The owner would also be happy for prospective buyers to observe the business at work prior to making an offer.\n" +
//                "\n" +
//                "The business is located in an affluent area with good pedestrian flow and is well-known. Consequently, marketing and promotion has not been deemed necessary in the past few years. \n" +
//                "\n" +
//                "There are 15 years remaining on the lease. This is renewable or negotiable for longer term if required. The rent is $30,000 pa, and rates are $4,200."
//                ,"7"
//                ,"750"));
//
//        dbManager.addWritingQuestions(new WritingQuestions("P023"
//                ," What is the purpose of this article?"
//                ,"to sell a business"
//                ," to give business advice  "
//                ," to give business advice "
//                ,"to sell a business"
//                ," to offer a job "
//                ,"Q007"));
//        dbManager.addWritingQuestions(new WritingQuestions("P024"
//                ,"Which of the following is NOT a benefit of this business?"
//                ,"The business has a six-figure annual profit \n "
//                ," There is a good customer base "
//                ," There are no similar businesses locally"
//                ,"The business is located in a rich area  "
//                ,"The business has a six-figure annual profit \n"
//                ,"Q007"));
//        dbManager.addWritingQuestions(new WritingQuestions("P025"
//                ,"According to the text, the current owner…"
//                ," is moving to another area."
//                ," is moving to another area."
//                ," never managed the business."
//                ,"is planning to retire.  "
//                ," is female"
//                ,"Q007"));
     //   dbManager.addWritingPassages(new WritingPassages("Q002"
//                ,"2Order your seed catalog now!"
//                ,"2This is the largest and best known seed catalog published today, featuring over 280 pages with 1500 color photographs and including more than 500 varieties.  This book tells you everything you want to know about growing anything from seed and tell you where to get the seeds. Bulbs, vegetables, cacti, potted plants, trees, perennials and annuals-you name it."
//                ,"6"
//                ,"250"));
//        dbManager.addWritingPassages(new WritingPassages("Q003"
//                ,"3Order your seed catalog now!"
//                ,"3This is the largest and best known seed catalog published today, featuring over 280 pages with 1500 color photographs and including more than 500 varieties.  This book tells you everything you want to know about growing anything from seed and tell you where to get the seeds. Bulbs, vegetables, cacti, potted plants, trees, perennials and annuals-you name it."
//                ,"6"
//                ,"250"));
//
//        dbManager.addWritingQuestions(new WritingQuestions("P001","Who will order this catalog?","People who like to grow plants"
//        ,"People who like to grow plants"
//        ,"People who sell vegetables"
//        ,"People who live on farms"
//        ,"People who sell catalogs","Q001"));
//
//
//        dbManager.addWritingQuestions(new WritingQuestions("P002",
//                "2Who will order this catalog?","People who like to grow plants"
//                ,"2People who like to grow plants"
//                ,"2People who sell vegetables"
//                ,"2People who live on farms"
//                ,"2People who sell catalogs","Q001"));
//        dbManager.addWritingQuestions(new WritingQuestions("P003"
//                ,"3Who will order this catalog?","People who like to grow plants"
//                ,"3People who like to grow plants"
//                ,"3People who sell vegetables"
//                ,"3People who live on farms"
//                ,"3People who sell catalogs","Q002"));
//        dbManager.addWritingQuestions(new WritingQuestions("P004"
//                ,"4Who will order this catalog?","People who like to grow plants"l
//                ,"4People who like to grow plants"
//                ,"4People who sell vegetables"
//                ,"4People who live on farms"
//                ,"4People who sell catalogs","Q002"));
//
//
//        dbManager.addWritingQuestions(new WritingQuestions("P005"
//                ,"5Who will order this catalog?","People who like to grow plants"
//                ,"5People who like to grow plants"
//                ,"5People who sell vegetables"
//                ,"5People who live on farms"
//                ,"5People who sell catalogs"
//                ,"Q002"));
//
//        dbManager.addWritingQuestions(new WritingQuestions("P006"
//                ,"6Who will order this catalog?","People who like to grow plants"
//                ,"6People who like to grow plants"
//                ,"6People who sell vegetables"
//                ,"6People who live on farms"
//                ,"6People who sell catalogs"
//                ,"Q001"));
//
//        dbManager.addWritingQuestions(new WritingQuestions("P007"
//                ,"7Who will order this catalog?","People who like to grow plants"
//                ,"7People who like to grow plants"
//                ,"7People who sell vegetables"
//                ,"7People who live on farms"
//                ,"7People who sell catalogs"
//                ,"Q003"));

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
            intent.putExtra(PART250_550,"250");
            startActivity(intent);


        } else if (id == R.id.nav_level_2) {
            Intent intent = new Intent(this,Writing67Activity.class);
            intent.putExtra(PART550_750,"250");
            startActivity(intent);


        } else if (id == R.id.nav_level_3) {
            Intent intent = new Intent(this,Writing67Activity.class);
            intent.putExtra(PART750_990,"750");
            startActivity(intent);

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
