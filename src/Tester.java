import java.util.ArrayList;
//Dorin Tihon
/**
 Tester class creates the AccountManager object and  .
 creates 6 Account objects and adding them to the list.
 */
public class Tester
{
    public static void main(String[] args)
    {

        //Create the AccountManager object
        AccountManager accountManager = new AccountManager();

        //Defining the first object and adding it to the list
        ArrayList<String> connectionList1 = new ArrayList<>();
        connectionList1.add("SC");
        connectionList1.add("DC");
        ArrayList<String> accomplishmentsList = new ArrayList<>();
        accomplishmentsList.add("Handled clients effectively");
        accomplishmentsList.add("Good reputation for working well on a team");
        ArrayList<String> skillList = new ArrayList<>();
        skillList.add("Storytelling");
        skillList.add("Teaching");
        accountManager.setIa1(new IndividualAccount("Bob1","15/04/1944","ia@email.com",connectionList1,
                accomplishmentsList,skillList,"HI", "BS"));

        //Defining the second object and adding it to the list
        ArrayList<String> connection2 = new ArrayList<>();
        connection2.add("OC");
        ArrayList<String> accomplishmentsList2 = new ArrayList<>();
        accomplishmentsList2.add("Raised more than $10,000 at annual fundraiser");
        ArrayList<String> skillList2 = new ArrayList<>();
        skillList2.add("Presenting");
        skillList2.add("Reporting");
        accountManager.setIa2(new IndividualAccount("Bob", "18/01/1999", "ia@email.com", connection2,
                accomplishmentsList2, skillList2, "None", "AS"));

        //Defining the third object and adding it to the list
        ArrayList<String> connectionList3 = new ArrayList<>();
        connectionList3.add("SC");
        connectionList3.add("OC");
        ArrayList<String> jobList = new ArrayList<>();
        jobList.add("Electrician");
        jobList.add("Cashier");
        accountManager.setBa1(new BusinessAccount("Bob", "18/01/1999", "ba@email.com", connectionList3,
                "ab@email.com", jobList, 5));

        //Defining the fourth object and adding it to the list
        ArrayList<String> connectionList4 = new ArrayList<>();
        connectionList4.add("SC");
        ArrayList<String> jobList2 = new ArrayList<>();
        jobList2.add("Driver");
        jobList2.add("Priest");
        accountManager.setBa2(new BusinessAccount("Anya", "12/12/1545", "ba@email.com", connectionList4, "ba2@email.com", jobList2, 6));

        //Defining the fifth object and adding it to the list
        ArrayList<String> connectionList5 = new ArrayList<>();
        connectionList5.add("DC");
        ArrayList<String> topicList = new ArrayList<>();
        topicList.add("AA");
        topicList.add("bb");
        accountManager.setCa1(new CommunityAccount("Laurentiu", "11/11/1546", "ca@email.com", connectionList5, topicList, "http://ca.com",  "Birhtday"));

        //Defining the sixth object and adding it to the list
        ArrayList<String> connectionList6 = new ArrayList<>();
        connectionList5.add("DC");
        ArrayList<String> topicList2 = new ArrayList<>();
        topicList.add("AA");
        topicList.add("VV");
        accountManager.setCa2(new CommunityAccount("Sasha", "10/10/1547", "ca2@email.com", connectionList6, topicList2, "http://ca2.com", "Wedding"));

        //Print all objects
        accountManager.printAccounts();

        //Print a specific Account object's information given the name of the account
        System.out.println(accountManager.getAccountInfo("Bob1"));
        System.out.println("\n");
        System.out.println(accountManager.getAccountInfo("Anya"));
        System.out.println("\n");
        System.out.println(accountManager.getAccountInfo("Ann"));
    }
}
