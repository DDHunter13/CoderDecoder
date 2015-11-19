
package CD;


public class Rot13 implements CoderInterface {
    
    @Override
    public String encode(String str, String key){
        StringBuilder sb = new StringBuilder();
        int rotKey = Integer.parseInt(key);
        for (char ch: str.toCharArray()){
            int i = (int)ch;
            if (i == 10){
                sb.append((char)10);
            }else {
                i += rotKey;
                sb.append((char)i);
            }            
        }
        return sb.toString();
    }
    
    @Override
    public String decode(String str, String key){
        StringBuilder sb = new StringBuilder();
        int rotKey = Integer.parseInt(key);
        for (char ch: str.toCharArray()){
            int i = (int)ch;
            if (i == 10){
                sb.append((char)10);
            }else {
                i -= rotKey;
                sb.append((char)i);
            }            
        }
        return sb.toString();
    }
 
    
}
