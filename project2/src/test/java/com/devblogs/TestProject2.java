package com.devblogs;
 
import org.junit.*;
 
public class TestProject2 {
    @Test
    public void testProject2GetMessage() {
        Project2 project2 = new Project2();
        Assert.assertEquals(project2.getMessage(), "service project1");
    }
}