import java.util.ArrayList;

class CommunityAccount extends Account{
    private ArrayList<String> topic;
    private String website;
    private String event;
    public CommunityAccount(){
        super();
        topic =new ArrayList<>();
        website ="No website";
        event = "No event";
    }

    public CommunityAccount(String name, String date, String email, ArrayList<String> connections, ArrayList<String> topic, String website, String event) {
        super(name, date, email, connections);
        this.topic = topic;
        this.website = website;
        this.event = event;
    }

    public String accountType(){
        return "Community";
    }

    public ArrayList<String> getTopic() {
        return topic;
    }

    public void setTopic(ArrayList<String> topic) {
        this.topic = topic;
    }

    public void addTopic(String topic){
        this.topic.add(topic);
    }
    public void deleteTopic(String topic){
        this.topic.remove(String.valueOf(topic));
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void deleteWebsite(){
        this.website = "No website";
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void deleteEvent(){
        this.event = "No event";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Topics of interests: " + topic + "\n" +
                "Website link: " + website + "\n" +
                "Current event: " + event + "\n" +
                "Account type: " + accountType();
    }

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