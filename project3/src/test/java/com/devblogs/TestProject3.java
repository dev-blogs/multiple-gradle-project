package com.devblogs;
 
import org.junit.*;
 
public class TestProject3 {
    @Test
    public void testProject3GetMessage() {
        Project3 project3 = new Project3();
        Assert.assertEquals(project3.getMessage(), "service project1");
    }
}