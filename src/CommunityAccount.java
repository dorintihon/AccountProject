import java.util.ArrayList;
//Dorin Tihon
/**
 CommunityAccount class to define the Community account object to represent the account information
 that has all the values of Account class + a list of topics, a link to website and an event
 also it has the ability to modify list of topics and delete the current event.
 */
class CommunityAccount extends Account{
    //Private variables for this class
    private ArrayList<String> topic;
    private String website;
    private String event;

    //Default constructor with extension of Account Class constructor
    public CommunityAccount(){
        super();
        topic =new ArrayList<>();
        website ="No website";
        event = "No event";
    }

    //Constructor with parameters with extension of Account Class constructor
    public CommunityAccount(String name, String date, String email, ArrayList<String> connections, ArrayList<String> topic, String website, String event) {
        super(name, date, email, connections);
        this.topic = topic;
        this.website = website;
        this.event = event;
    }

    //accountType() implements the abstract method from Account class and returns a string
    public String accountType(){
        return "Community";
    }

    //getTopic() returns the topic variable
    public ArrayList<String> getTopic() {
        return topic;
    }

    //setTopic(ArrayList<String> topic) sets the topic variable to given parameter
    public void setTopic(ArrayList<String> topic) {
        this.topic = topic;
    }

    //addTopic(String topic) adds a string to the topic list
    public void addTopic(String topic){
        this.topic.add(topic);
    }

    //deleteTopic(String topic) deletes the topic
    public void deleteTopic(String topic){
        this.topic.remove(String.valueOf(topic));
    }

    //getWebsite() returns the website variable
    public String getWebsite() {
        return website;
    }

    //setWebsite(String website) sets the website variable to given parameter
    public void setWebsite(String website) {
        this.website = website;
    }

    //deleteWebsite() sets website variable to a default value
    public void deleteWebsite(){
        this.website = "No website";
    }

    //getEvent() returns the event variable
    public String getEvent() {
        return event;
    }

    //setEvent(String event) sets the event variable to given parameter
    public void setEvent(String event) {
        this.event = event;
    }

    //deleteEvent() sets event variable to a default value
    public void deleteEvent(){
        this.event = "No event";
    }

    //toString() method returns the values of CommunityAccount class in string format
    @Override
    public String toString() {
        return super.toString() +
                "Topics of interests: " + topic + "\n" +
                "Website link: " + website + "\n" +
                "Current event: " + event + "\n" +
                "Account type: " + accountType();
    }

    //equals(Object obj) to check whether two objects have same data or not
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            CommunityAccount comAcc = (CommunityAccount) obj;
            return super.equals(obj) && topic == comAcc.getTopic() &&
                    website.equals(comAcc.getWebsite()) && event.equals(comAcc.getEvent());
        }
        return false;
    }
}