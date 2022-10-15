import java.util.ArrayList;
//Dorin Tihon
/**
 Account class to define the account object to represent the account information
 that has name, date of creation, email and connections
 */

abstract class Account{
    //Private variables for this class
    private String name;
    private String dateCreated;
    private String email;
    private ArrayList<String> connections;

    //Default constructor
     public Account(){
        name="No Name";
        dateCreated ="No Date";
        email="No email";
        connections=new ArrayList<>();
    }

    //Constructor with parameters
    public Account(String name, String date, String email, ArrayList<String> connections) {
        this.name = name;
        dateCreated = date;
        this.email = email;
        this.connections = connections;
    }

    //Abstract method accountType() for defining the type of account in other classes
    public abstract String accountType();

     //getName() returns the name on account
    public String getName() {
        return name;
    }

    //setName(String name) sets the name on account with a string parameter
    public void setName(String name) {
        this.name = name;
    }

    //getDateCreated() returns the date when account was created
    public String getDateCreated() {
        return dateCreated;
    }

    //setDateCreated(String dateCreated) sets the date of creations with a string parameter
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    //getEmail() returns the email variable
    public String getEmail() {
        return email;
    }

    //setEmail(String email) sets the variable email a string parameter
    public void setEmail(String email) {
        this.email = email;
    }

    //getConnections() returns the connections array
    public ArrayList<String> getConnections() {
        return connections;
    }

    //setConnections(ArrayList<String> connections) sets the connections variable with an ArrayList parameter
    public void setConnections(ArrayList<String> connections) {
        this.connections = connections;
    }

    //toString() method returns the values of Account class in string format
    @Override
    public String toString() {
        return "Name on Account: " + name + "\n" +
                "Date when it was created: " + dateCreated + "\n" +
                "Email: " + email + "\n" +
                "Connections: " + connections + "\n";
    }

    //equals(Object obj) to check whether two objects have same data or not
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            Account other = (Account) obj;
            return name.equals(other.getName()) && dateCreated.equals(other.getDateCreated()) &&
                    email.equals(other.getEmail()) && connections == other.getConnections();
        }
        return false;
    }


}
