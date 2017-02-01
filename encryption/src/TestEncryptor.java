public class TestEncryptor {
    public static void main(String[] args) {
        Encryptor e = new Encryptor("Hi there");

        String encrypted = e.encrypt("Hi there");
        String decrypted = e.decrypt(encrypted);

        System.out.println(encrypted);
        System.out.println(decrypted);
    }
}