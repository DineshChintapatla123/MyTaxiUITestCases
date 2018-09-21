package com.mytaxi.android_demo.MyTaxiUITestcases;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;

import com.mytaxi.android_demo.CommonTestMethods.CommonTestMethodImpl;
import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.activities.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class SearchDriverUITests extends ActivityInstrumentationTestCase2<MainActivity>
{
    private CommonTestMethodImpl commonTestMethod = new CommonTestMethodImpl();

    public SearchDriverUITests()
    {
        super(MainActivity.class);
    }

    @Before
    public void setUp() throws Exception
    {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
    }

    @Test
    //This test case verifies user can login and search and select driver with name
    public void searchAndSelectSecondName() {
        getActivity();
        commonTestMethod.login("crazydog335", "venture");
        commonTestMethod.searchAndSelectDriver("Sarah Scott");
        onView(withText("Sarah Scott")).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.fab)).check(ViewAssertions.matches(isDisplayed()));
    }
}
