/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba5iliprostogithuynya;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Влад
 */
public class ImportUserIllyaVersion {
    
    public static User importUser(String jsonUser) {
        if (jsonUser == null) {
            return null;
        } else if (jsonUser.isEmpty()) {
            return null;
        }
        JSONObject object = null;
        try {
            object = (JSONObject) new JSONParser().parse(jsonUser);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage() + "  Помилка");
        }
        return new User(object.get("name") + "", object.get("email") + "", object.get("phone") + "");
    }
    
}
