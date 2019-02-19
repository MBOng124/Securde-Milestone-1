package Controller;

import Model.User;
import View.Frame;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Main {

    public SQLite sqlite;

    //Created Attributes 
    private String password;
    private String username;

    public static void main(String[] args) {
        new Main().init();
    }

    public void init() {
        // Initialize a driver object
        sqlite = new SQLite();

        // Create a database
//        sqlite.createNewDatabase();
//
//        // Drop users table if needed
//        sqlite.dropUserTable();
//
//        // Create users table if not exist
//        sqlite.createUserTable();
//
//        // Add users
//        sqlite.addUser("admin", "qwerty1234", 5);
//        sqlite.addUser("manager", "qwerty1234", 4);
//        sqlite.addUser("staff", "qwerty1234", 3);
//        sqlite.addUser("client1", "qwerty1234", 2);
//        sqlite.addUser("client2", "qwerty1234", 2);

        // Get users
        ArrayList<User> users = sqlite.getUsers();
        for (int nCtr = 0; nCtr < users.size(); nCtr++) {
            System.out.println("===== User " + users.get(nCtr).getId() + " =====");
            System.out.println(" Username: " + users.get(nCtr).getUsername());
            System.out.println(" Password: " + users.get(nCtr).getPassword());
            System.out.println(" Role: " + users.get(nCtr).getRole());
        }

        // Initialize User Interface
        Frame frame = new Frame();
        frame.init(this);

        setPassword("");
    }

    // THIS WILL CONVERT THE PASSWORD INTO *
    public String convertPassword() {
        String convertedPassword = "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < password.length(); i++) {
            sb.append("*");
        }
        convertedPassword = sb.toString();
        return convertedPassword;
    }

    // THIS WILL SAVE THE PASSWORD FOR LOGIN
    public void savePassword(char passText, int index) {
        StringBuilder sb = new StringBuilder(getPassword());
        sb.insert(index, passText);

        setPassword(sb.toString());
//        System.out.println("getPassword() = " + getPassword());// DEBUGGING PURPOSES
    }

    // WHEN THERE IS AN BACKSPACE EVENT THIS FUNCTION WILL TRIGGER
    public void backSpace(int start, int end, int caretIndex) {
        StringBuffer sb = new StringBuffer(password);
        System.out.println("start + end = " + start + end);
        if ((start != end) && (start >= 0 && end > 0)) {
            sb.delete(start, end);
        } else {
            if (password.length() > 0) {
                sb.deleteCharAt(caretIndex);
            }
        }
        this.setPassword(sb.toString());
//        System.out.println("sb = " + sb.toString()); //DEBUGGING PURPOSES
    }

    public User loginUser(String username, String password) {
        ArrayList<User> users = sqlite.getUsers();
        for (int nCtr = 0; nCtr < users.size(); nCtr++) {
            if (users.get(nCtr).getUsername().equals(username)
                    && users.get(nCtr).getPassword().equals(password)) {
                return users.get(nCtr);
            }
        }
        return null;
    }

    public boolean checkIfUserExists(String username) {
        ArrayList<User> users = sqlite.getUsers();
        for (int nCtr = 0; nCtr < users.size(); nCtr++) {
            if (users.get(nCtr).getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public static String hashString(String password) {
        try {
            // getInstance() method is called with algorithm SHA-512
            MessageDigest md = MessageDigest.getInstance("SHA-512");

            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(password.getBytes());

            // Convert byte array into signum representation
            BigInteger bigInteger = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashedPw = bigInteger.toString(16);

            // Add preceding 0s to make it 32 bit
            while (hashedPw.length() < 32) {
                hashedPw = "0" + hashedPw;
            }

            // return the HashText
            return hashedPw;
        } // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
}
