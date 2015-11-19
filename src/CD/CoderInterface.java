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
public interface CoderInterface {
    public String encode(String str, String key);
    public String decode(String str, String key);
}
