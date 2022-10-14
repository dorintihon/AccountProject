import java.util.ArrayList;

class BusinessAccount extends Account{
    private String secondaryEmail;
    private ArrayList<String> jobs;
    private int days;
    public BusinessAccount(){
        super();
        secondaryEmail="No email";
        jobs=new ArrayList<>();
        days = 0 ;
    }

    public BusinessAccount(String name, String date_created, String email, ArrayList<String> connections,
                           String secondaryEmail, ArrayList<String> jobs, int days) {
        super(name, date_created, email, connections);
        this.secondaryEmail = secondaryEmail;
        this.jobs = jobs;
        this.days = days;
    }

    public String accountType(){
        return "Business";
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public ArrayList<String> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<String> jobs) {
        this.jobs = jobs;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void changeEmailAddress(String newEmail){
        secondaryEmail=newEmail;
    }
    /* public void deleteJob(String job){
        //finding the number of days for that job so that we can update the number of days list too
        for(int i = 0; i<jobs.size() ; i++){
            if(jobs.get(i).equals(job))
                break;

        }
        this.jobs.remove(String.valueOf(job));
        this.days = 0;
    }*/
    public void deleteJob(){
        jobs.clear();
        days = 0;
    }
    public void addJob(String job){
        jobs.add(job);
    }
    public void currentDay(int day){
        if(day == days){
            deleteJob();
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Secondary Email: " + secondaryEmail + "\n" +
                "Jobs: " + jobs + "\n" +
                "Days for advertisement: " + days + "\n" +
                "Account type: " + accountType();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            BusinessAccount bussAcc = (BusinessAccount) obj;
            return super.equals(obj) && secondaryEmail.equals(bussAcc.getSecondaryEmail()) &&
                    jobs == bussAcc.getJobs() && days == bussAcc.getDays();
        }
        return false;
    }

}
