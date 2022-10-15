import java.util.ArrayList;
//Dorin Tihon
/**
 BusinessAccount class to define the Business account object to represent the account information
 that has all the values of Account class + a secondary email, a list of jobs and max number of days for advertising the jobs
 also it has the ability to add or delete jobs.
 */

class BusinessAccount extends Account{
    //Private variables for this class
    private String secondEmail;
    private ArrayList<String> jobs;
    private int days;

    //Default constructor with extension of Account Class constructor
    public BusinessAccount(){
        super();
        secondEmail ="No email";
        jobs=new ArrayList<>();
        days = 0 ;
    }
    //Constructor with parameters with extension of Account Class constructor
    public BusinessAccount(String name, String date_created, String email, ArrayList<String> connections,
                           String secondaryEmail, ArrayList<String> jobs, int days) {
        super(name, date_created, email, connections);
        this.secondEmail = secondaryEmail;
        this.jobs = jobs;
        this.days = days;
    }

    //accountType() implements the abstract method from Account class and returns a string
    public String accountType(){
        return "Business";
    }

    //getSecondEmail() returns the secondEmail variable
    public String getSecondEmail() {
        return secondEmail;
    }

    //etSecondEmail(String secondEmail) sets the secondEmail variable to given parameter
    public void setSecondEmail(String secondEmail) {
        this.secondEmail = secondEmail;
    }

    //getJobs() returns the jobs variable
    public ArrayList<String> getJobs() {
        return jobs;
    }

    //setJobs(ArrayList<String> jobs) sets the jobs variable to given parameter
    public void setJobs(ArrayList<String> jobs) {
        this.jobs = jobs;
    }

    //getDays() returns the days variable
    public int getDays() {
        return days;
    }

    //setDays(int days) sets the days variable to given parameter
    public void setDays(int days) {
        this.days = days;
    }


    //deleteJob() deletes the jobs list and sets the days variable to zero
    public void deleteJob(){
        jobs.clear();
        days = 0;
    }
    //addJob(String job) adds a string value to the jobs list
    public void addJob(String job){
        jobs.add(job);
    }

    //currentDay(int day) gets the day parameter then it calls the deleteJob() method if the days matches
    public void currentDay(int day){
        if(day == days){
            deleteJob();
        }
    }

    //toString() method returns the values of BusinessAccount class in string format
    @Override
    public String toString() {
        return super.toString() +
                "Secondary Email: " + secondEmail + "\n" +
                "Jobs: " + jobs + "\n" +
                "Days for advertisement: " + days + "\n" +
                "Account type: " + accountType();
    }

    //equals(Object obj) to check whether two objects have same data or not
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            BusinessAccount bussAcc = (BusinessAccount) obj;
            return super.equals(obj) && secondEmail.equals(bussAcc.getSecondEmail()) &&
                    jobs == bussAcc.getJobs() && days == bussAcc.getDays();
        }
        return false;
    }

}
