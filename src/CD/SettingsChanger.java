package CD;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class SettingsChanger {
    
    public static void methodChanged(String name){
        CoderInterface i;
        switch (name){
            case Methods.ROT13:
                i = new Rot13();
                CoderDecoder.setInstance(i);
                break;
            case Methods.NO:
                i = new No();
                CoderDecoder.setInstance(i);
                break;
                
        }
                
    }
}
