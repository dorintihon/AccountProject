import java.util.ArrayList;

class IndividualAccount extends Account{
    private ArrayList<String> accomplishments;
    private ArrayList<String> skills;
    private String notice;
    private String education;
    public IndividualAccount(){
        super();
        accomplishments=new ArrayList<>();
        skills=new ArrayList<>();
        notice="No notice";
        education="No education";
    }

    public IndividualAccount(String name, String date, String email, ArrayList<String> connections,
                             ArrayList<String> accomplishments, ArrayList<String> skills,
                             String notice, String education) {
        super(name, date, email, connections);
        this.accomplishments=accomplishments;
        this.skills=skills;
        this.notice=notice;
        this.education=education;
    }

    public String accountType(){
        return "Individual";
    }
    public ArrayList<String> getAccomplishments() {
        return accomplishments;
    }
    public void setAccomplishments(ArrayList<String> accomplishments) {
        this.accomplishments = accomplishments;
    }
    public ArrayList<String> getSkills() {
        return skills;
    }
    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
    public String getNotice() {
        return notice;
    }
    public void setNotice(String notice) {
        this.notice = notice;
        if (notice.equals("Delete")){
            this.notice = "No notice";
        }
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    @Override
    public String toString() {
        return super.toString() +
                "Accomplishments: " + accomplishments + "\n" +
                "Skills: " + skills + "\n" +
                "Notice: " + notice + "\n" +
                "Education: " + education + "\n" +
                "AccountType: " + accountType();
    }

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
