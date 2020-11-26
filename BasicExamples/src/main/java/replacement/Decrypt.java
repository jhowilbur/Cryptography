package replacement;

public class Decrypt {

    public static String decryption(String msgCript, int key){
        String msg = "";
        for(int i = 0; i < msgCript.length(); i++) {
            msg += (char) (msgCript.charAt(i) - key);
        }
        return msg;
    }

}
