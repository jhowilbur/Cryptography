package replacement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppRun {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type the message: \n");
        String msg = reader.readLine();
        int key = 3;

        String msgEncrypt = Encrypt.encryption(msg, key);
        System.out.println("Msg encryption: " + msgEncrypt);
        String msgDecrypt = Decrypt.decryption(msgEncrypt, key);
        System.out.println("Msg decryption: " + msgDecrypt);
    }

}
