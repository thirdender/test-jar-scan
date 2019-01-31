import javax.crypto.KeyGenerator;
import java.security.Key;

public class CryptoKeysTooShort {
  public static void main(String[] args) throws Exception {
    KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
    keyGen.init(64);
    Key key = keyGen.generateKey();
    System.out.println(key);
  }
}
