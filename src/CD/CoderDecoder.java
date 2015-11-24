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
public class CoderDecoder {
    
    private static String currentKey = "13";
    
    private static CoderInterface inst = new Rot13();
    
    public static CoderInterface getInstance(){
        return inst;
    }
    
    public static void setInstance(CoderInterface ci){
        inst = ci;
    }
    
    public static void keyChaged(String str){
        currentKey = str;
    } 
    
    public static String encode(String str){
        return inst.encode(str, currentKey);
    }
    
    public static String decode(String str){
        return inst.decode(str, currentKey);
    }
}
