
package CD;


public class Rot13 implements CoderInterface {
    
    @Override
    public String encode(String str, String key){
        StringBuilder sb = new StringBuilder();
        int rotKey = Integer.parseInt(key);
        for (char ch: str.toCharArray()){
            if ((int)ch == 10){
                sb.append(ch);
            }else{
            sb.append(ch += rotKey );
            }
        }    
        return sb.toString();
    }
    
    @Override
    public String decode(String str, String key){
        StringBuilder sb = new StringBuilder();
        int rotKey = Integer.parseInt(key);
        for (char ch: str.toCharArray()){
            if ((int)ch == 10){
                sb.append(ch);
            }else {
                sb.append(ch -= rotKey);
            }            
        }
        return sb.toString();
    }
 
    
}
