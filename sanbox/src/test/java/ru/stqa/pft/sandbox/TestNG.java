package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {
  public class TestPoint {

    @Test
    public void testArea() {
      Square s = new Square(5);
      Assert.assertEquals(s.area(), 25.0);


    }
  }
}
