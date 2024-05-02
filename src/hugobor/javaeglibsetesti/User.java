package hugobor.javaeglibsetesti;


public class User {
    
    int id = -1;
    String userName = ""; 
    String email = "";
    
    /** Hashing não seguro, usado como examplo.
     *  @see https://www.baeldung.com/java-password-hashing
     */
    int passwordHash = 0;
    
    static int NextId = 1;
    
    
    public User() {
	// empty
    }
    
    
    private User(int id, String userName, String email, int passwordHash) {
	super();
	this.id = id;
	this.userName = userName;
	this.email = email;
	this.passwordHash = passwordHash;
    }



    public static User of(String aName, String aPassword, String anEmail) {
	return new User(NextId++, aName, anEmail, aPassword.hashCode());
    }
    
}






















