

package com.example.hamuj.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;

public class MainActivity extends AppCompatActivity {


  

    Boolean signUpModeActive;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);








/**
 *
 *
 *                   SAVING AND RETRIVING OBJECTS
 *
 *
 *
 *
        ParseObject gameScore = new ParseObject("GameScore");
        gameScore.put("score", 1337);
        gameScore.put("playerName", "himanshu");
        gameScore.put("cheatMode", false);
        gameScore.saveInBackground();



        if(ParseUser.getCurrentUser()==null) {
            ParseUser.getCurrentUser().logOut();
        }


        ParseObject object = new ParseObject("ExampleObject");
        object.put("myNumber", "123");
        object.put("myString", "himanshu");
        object.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException ex) {
                if (ex == null) {
                    Log.i("Parse Result", "Successful!");
                } else {
                    Log.i("Parse Result", "Failed" + ex.toString());
                }
            }
        });


        if(ParseUser.getCurrentUser()==null) {
            ParseUser.getCurrentUser().logOut();
        }
**/

       /** ParseQuery<ParseObject>query =ParseQuery.getQuery("GameScore");
        query.whereEqualTo("playerName","ashish");
        query.getInBackground("xeNn3Ge8Dx", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject gameScore , ParseException e) {
                if (e == null){
                    gameScore.put("playerName", "ashish");
                    gameScore.saveInBackground();
                    Log.i("Parse Result", "Successful");
                }
                else
                    Log.i("Parse Result", "Failed" + e.toString());

            }
        });

        ParseQuery<ParseObject>query =ParseQuery.getQuery("GameScore");
       query.whereEqualTo("playerName","ashish");
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e == null) {

                    Log.i("findInBackgroung", "retrived" + objects.size() + "results");
                    for (ParseObject object : objects) {
                        Log.i("findInBackground", String.valueOf(object.get("score")));
                        Log.i("findInBackground", String.valueOf(object.get("playerName")));
                        objects.get(0).put("score", 1000);
                        objects.get(0).saveInBackground();

                        Log.i("findInBackground", String.valueOf(object.get("score")));
                        Log.i("findInBackground", String.valueOf(object.get("playerName")));
                    }
                }
            }
        });


                          SIGNUP PROCESS




       ParseUser user =new ParseUser();
        user.setUsername("himanshu");
        user.setPassword("1234");

        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {

                if(e==null) {
                    Log.i("signup", " Successful!!");
                }else{
                    Log.i("signup" ,"failed!!");
                    e.printStackTrace();
                }
            }
        });



                         LOG IN PROCESS


       ParseUser.logInInBackground("himanshu", "1234", new LogInCallback() {
           @Override
           public void done(ParseUser user, ParseException e) {
               if(user != null) {
                   Log.i("login", "successful");
               }else{
                   Log.i("login", "failed");
                   e.printStackTrace();
               }

           }
       });



                         LOGOUT PROCESS





        ParseQuery<ParseObject>query =ParseQuery.getQuery("GameScore");
        
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e == null) {

                    Log.i("findInBackgroung", "retrived" + objects.size() + "results");
                    for (ParseObject object : objects) {
                        Log.i("findInBackground", String.valueOf(object.get("score")));
                        Log.i("findInBackground", String.valueOf(object.get("playerName")));

                    }
                }
            }
        });

        ParseUser.logOut();



                 checking user logged in or not




        if(ParseUser.getCurrentUser()!=null){
            Log.i("user","logged in");

        }else{
            Log.i("user","logged out");

        }

        **/

        ParseAnalytics.trackAppOpenedInBackground(getIntent());

    }

}
