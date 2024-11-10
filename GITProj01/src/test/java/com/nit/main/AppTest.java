package com.nit.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class AppTest {

    
    @Test
    public void testWithPositives() {
        App app=new App();
       int x=10;
        int y=20;
        int actual=30;
        int expected=app.sum(x, y);
        assertEquals(actual,expected);
    }
    @Test
    public void testWithNegatives() {
        App app=new App();
       int x=-10;
        int y=-20;
        int actual=-30;
        int expected=app.sum(x, y);
        assertEquals(actual,expected);
    }
    @Test
    public void testWithMixedValues() {
        App app=new App();
       int x=-10;
        int y=20;
        int actual=10;
        int expected=app.sum(x, y);
        assertEquals(actual,expected);
    }
    @Test
    public void testWithZeroes() {
        App app=new App();
       int x=0;
        int y=0;
        int actual=0;
        int expected=app.sum(x, y);
        assertEquals(actual,expected);
    }
}
