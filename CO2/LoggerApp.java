class User {
    String password;                      
    String role;                        
    String username;                       
    final static String SYSTEM_NAME = "AccessLogger";  

    User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    void showUserDetails() {
        System.out.println("System: " + SYSTEM_NAME);
        System.out.println("Username: " + username);
        System.out.println("Role: " + role);
        System.out.println("Password: " + password);
    }
}
public class LoggerApp {
    public static void main(String[] args) {
        User user1 = new User("alice", "pass123", "admin");

        System.out.println("---- Direct Access ----");
        System.out.println("Username: " + user1.username);  
        System.out.println("System Name: " + User.SYSTEM_NAME);  

        // Try accessing private and protected fields
        // System.out.println("Password: " + user1.password); 
        // System.out.println("Role: " + user1.role);          
        System.out.println("\n---- Access via Method ----");
        user1.showUserDetails();  
    }
}