package org.example;

import static org.example.main.toDo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue() {
        String check = "asd asdfga bcasd gfdas basdf aqwer";
        assertEquals("asd asdfga aqwer \n" +
                "bcasd basdf \n" +
                "gfdas \n",toDo(check));
    }
}
