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
public class ImportUser {
    
    public static User importUser(String jsonUser) {
        JSONParser parser = new JSONParser();
        JSONObject object = null;
        try {
            object = (JSONObject) parser.parse(jsonUser);
        } catch (ParseException ex) {
            Logger.getLogger(ImportUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        User user = new User(object.get("name") + "", object.get("email") + "", object.get("phone") + "");
        return user;
    }
}
