package replacement;

public class Encrypt {

    public static String encryption(String msg, int key){
        String msgCript = "";
        for(int i = 0; i < msg.length(); i++) {
            msgCript += (char) (msg.charAt(i) + key);
        }
        return msgCript;
    }

}
