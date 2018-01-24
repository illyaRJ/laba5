/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba5iliprostogithuynya;

/**
 *
 * @author Влад
 */
public class Main {
    
    public static void main(String[] args) {
        User user = new User("Vlad", "kekonmonday@gmail.com", "380990764093");
        String userJson = ExportUser.exportUser(user);
        System.out.println(userJson);
        User user2 = ImportUser.importUser(userJson);
        System.out.println(user2);
    }
    
}
