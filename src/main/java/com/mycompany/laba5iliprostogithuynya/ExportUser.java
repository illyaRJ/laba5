/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba5iliprostogithuynya;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Влад
 */
public class ExportUser {
    
    public static String exportUser(User user) {
        if (user == null) return null;
        String jsonUser = null;
        try {
            jsonUser = new ObjectMapper().writeValueAsString(user);
        } catch (JsonProcessingException ex) {
            System.out.println(ex.getMessage() + "  Помилка");
        }
        return jsonUser;
    }
    
}
