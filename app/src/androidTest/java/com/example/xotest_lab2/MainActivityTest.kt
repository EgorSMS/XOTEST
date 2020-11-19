package com.example.xotest_lab2

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {
    @Rule
    @JvmField
    var activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java)
    @Test
    fun testUserInputScenario() {
        Espresso.onView(withId(activityRule.activity.btn1.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn2.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn4.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn5.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn7.id)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.winner)).check(ViewAssertions.matches(ViewMatchers.withText("Победитель X!")))
    }

    @Test
    fun testUserInputScenarioSec() {
        Espresso.onView(withId(activityRule.activity.btn1.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn2.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn4.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn5.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn3.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn8.id)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.winner)).check(ViewAssertions.matches(ViewMatchers.withText("Победитель O!")))
    }

    @Test
    fun testUserInputScenarioThird() {
        Espresso.onView(withId(activityRule.activity.btn1.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn2.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn3.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn7.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn8.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn9.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn4.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn5.id)).perform(ViewActions.click())
        Espresso.onView(withId(activityRule.activity.btn6.id)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.winner)).check(ViewAssertions.matches(ViewMatchers.withText("Победитель дружба!")))
    }
}
