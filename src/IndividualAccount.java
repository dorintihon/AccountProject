import java.util.ArrayList;
//Dorin Tihon
/**
 IndividualAccount class to define the individual account object to represent the account information
 that has all the values of Account class + a list of accomplishments, a list of skills, a notice and education information
 as well as ability to delete notice.
 */
class IndividualAccount extends Account{
    //Private variables for this class
    private ArrayList<String> accomplishments;
    private ArrayList<String> skills;
    private String notice;
    private String education;

    //Default constructor with extension of Account Class constructor
    public IndividualAccount(){
        super();
        accomplishments=new ArrayList<>();
        skills=new ArrayList<>();
        notice="No notice";
        education="No education";
    }

    //Constructor with parameters with extension of Account Class constructor
    public IndividualAccount(String name, String date, String email, ArrayList<String> connections,
                             ArrayList<String> accomplishments, ArrayList<String> skills,
                             String notice, String education) {
        super(name, date, email, connections);
        this.accomplishments=accomplishments;
        this.skills=skills;
        this.notice=notice;
        this.education=education;
    }

    //accountType() implements the abstract method from Account class and returns a string
    public String accountType(){
        return "Individual";
    }

    //getAccomplishments() returns accomplishments variable
    public ArrayList<String> getAccomplishments() {
        return accomplishments;
    }

    //setAccomplishments(ArrayList<String> accomplishments) sets the accomplishments variable to given parameter
    public void setAccomplishments(ArrayList<String> accomplishments) {
        this.accomplishments = accomplishments;
    }

    //getSkills() returns skills variable
    public ArrayList<String> getSkills() {
        return skills;
    }

    //setSkills(ArrayList<String> skills) sets the skills variable to given parameter
    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    //getNotice() returns notice variable
    public String getNotice() {
        return notice;
    }

    //setNotice(String notice) sets the notice variable to given parameter
    public void setNotice(String notice) {
        this.notice = notice;
    }

    //deleteNotice() sets the notice variable to a default value
    public void deleteNotice(){
        this.notice = "No notice";
    }

    //getEducation() returns the education variable
    public String getEducation() {
        return education;
    }

    //setEducation(String education) sets the education variable to given parameter
    public void setEducation(String education) {
        this.education = education;
    }

    //toString() method returns the values of IndividualAccount class in string format
    @Override
    public String toString() {
        return super.toString() +
                "Accomplishments: " + accomplishments + "\n" +
                "Skills: " + skills + "\n" +
                "Notice: " + notice + "\n" +
                "Education: " + education + "\n" +
                "AccountType: " + accountType();
    }

    //equals(Object obj) to check whether two objects have same data or not
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            IndividualAccount indAcc = (IndividualAccount) obj;
            return super.equals(obj) && accomplishments == indAcc.getAccomplishments() && skills == indAcc.getSkills() &&
                    notice.equals(indAcc.getNotice()) && education.equals(indAcc.getEducation());
        }
        return false;
    }

}
