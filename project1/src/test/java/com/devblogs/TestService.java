package com.devblogs;
 
import org.junit.*;
 
public class TestService {
    @Test
    public void testMessage() {
        Service service = new Service();
        Assert.assertEquals(service.getMessage(), "service project1");
    }
}