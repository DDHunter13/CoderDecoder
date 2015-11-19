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
public class No implements CoderInterface{
    
    @Override
    public String encode(String str, String key){
        return str;
    }
    @Override
     public String decode(String str, String key){
        return str;
    }
}
