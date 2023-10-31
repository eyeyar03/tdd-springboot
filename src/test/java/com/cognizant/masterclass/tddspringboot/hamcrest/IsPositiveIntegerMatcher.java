package com.cognizant.masterclass.tddspringboot.hamcrest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

class IsPositiveIntegerMatcher extends TypeSafeMatcher<Integer> {
  public static Matcher<Integer> isAPositiveInteger() {
    return new IsPositiveIntegerMatcher();
  }

  @Override
  protected boolean matchesSafely(Integer integer) {
    return integer > 0;
  }

  @Override
  public void describeTo(Description description) {
    description.appendText("a positive integer");
  }
}
