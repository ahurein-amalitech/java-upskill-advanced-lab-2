package org.example;

import java.util.HashMap;
import java.util.Map;

public class App 
{
    private Map<Integer, String> users = new HashMap<>();

    public App(){
        users.put(1, "ahurein");
        users.put(2, "eben");
    }

    public String getUserName(Integer userId)
    {
        return users.getOrDefault(userId, "");
    }
}
