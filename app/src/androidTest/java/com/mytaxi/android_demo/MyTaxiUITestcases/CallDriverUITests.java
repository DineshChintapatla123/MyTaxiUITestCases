package com.mytaxi.android_demo.MyTaxiUITestcases;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;

import com.mytaxi.android_demo.CommonTestMethods.CommonTestMethodImpl;
import com.mytaxi.android_demo.activities.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class CallDriverUITests extends ActivityInstrumentationTestCase2<MainActivity>
{
    private CommonTestMethodImpl commonTestMethod = new CommonTestMethodImpl();

    public CallDriverUITests() {
        super(MainActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
    }

    @Test
    //This test case verifies user can call selected driver
    public void callDriver()
    {
        getActivity();
        commonTestMethod.login("crazydog335", "venture");
        commonTestMethod.searchAndSelectDriver("Sarah Scott");
        commonTestMethod.dialingAction();
    }
}