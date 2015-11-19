
package CD;

public class KeyGenerator {
    
    public static String generateKey(){
        StringBuilder sb = new StringBuilder();
        int in = (int) (Math.random()*10);
        for (int i = 0; i < in; ++i){
            sb.append((char)(65 + (Math.random()*57)));
        }
        return sb.toString();
    }

}
