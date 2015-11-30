
package CD;


public class Rot13 implements CoderInterface {
    
    @Override
    public String encode(String str, String key){
        StringBuilder sb = new StringBuilder();
        int rotKey = Integer.parseInt(key);
        for (char ch: str.toCharArray()){
            if (((int)ch >= 65) && ((int)ch <= 90)){
                ch += rotKey;
                 while ((int)ch > 90){
                    ch -= 26;
                }
            }else{
                if (((int)ch >= 97) && ((int)ch <= 122)){
                    ch += rotKey;
                    while ((int)ch > 122) {
                        ch -= 26;
                    }
                }
            }
            sb.append(ch);
        }    
        return sb.toString();
    }
    
    @Override
    public String decode(String str, String key){
        StringBuilder sb = new StringBuilder();
        int rotKey = Integer.parseInt(key);
        for (char ch: str.toCharArray()){
            int j = (int)ch;
            if (((int)ch >= 65) && ((int)ch <= 90)){
                j -= rotKey;
                while (j < 65){
                    j += 26;
                }
            }else{
                if (((int)ch >= 97) && ((int)ch <= 122)){
                    j -= rotKey;
                    while (j < 97) {
                        j += 26;
                    }
                }
            }
            sb.append((char)j);            
        }
        return sb.toString();
    }
 
    
}
