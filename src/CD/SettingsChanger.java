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
        switch (name){
            case Methods.ROT13:
                CoderDecoder.inst = new Rot13();
                break;
            case Methods.NO:
                CoderDecoder.inst = new No();
                break;
                
        }
                
    }
}
