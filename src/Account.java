import java.util.ArrayList;


abstract class Account{
    private String name;
    private String dateCreated;
    private String email;
    private ArrayList<String> connections;
     public Account(){
        name="No Name";
        dateCreated ="No Date";
        email="No email";
        connections=new ArrayList<>();
    }

    public Account(String name, String date, String email, ArrayList<String> connections) {
        this.name = name;
        dateCreated = date;
        this.email = email;
        this.connections = connections;
    }

    public abstract String accountType();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<String> getConnections() {
        return connections;
    }
    public void setConnections(ArrayList<String> connections) {
        this.connections = connections;
    }

    @Override
    public String toString() {
        return "Name on Account: " + name + "\n" +
                "Date when it was created: " + dateCreated + "\n" +
                "Email: " + email + "\n" +
                "Connections: " + connections + "\n";
    }

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
