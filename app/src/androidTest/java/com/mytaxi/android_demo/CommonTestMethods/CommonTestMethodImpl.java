package com.mytaxi.android_demo.CommonTestMethods;

import android.support.test.espresso.assertion.ViewAssertions;
import com.mytaxi.android_demo.R;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

// This class file contains common methods for UI test in mytaxi demo app
public class CommonTestMethodImpl {

    //This method contains login steps
    public void login(String username,String password){
        onView(withId(R.id.edt_username)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.edt_username)).perform(typeText(username));
        onView(withId(R.id.edt_password)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.edt_password)).perform(typeText(password));
        onView(withId(R.id.btn_login)).perform((click()));
    }

    //This method  search name starts with "sa" and selects "Sarah Scott"
    public void searchAndSelectDriver(String driverName){
        onView(withId(R.id.textSearch)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.textSearch)).perform(typeText(driverName.substring(0,2)));
        onView(withText(driverName)).check(ViewAssertions.matches(isDisplayed()));
        onView(withText(driverName)).perform(click());
    }
    //This method contains click on call button action
    public void dialingAction(){
        onView(withId(R.id.fab)).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.fab)).perform(click());

    }
}
