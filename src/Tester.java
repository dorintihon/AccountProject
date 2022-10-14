import java.util.ArrayList;

public class Tester
{
    public static void main(String[] args)
    {
        //creating an individual account for jeet
        /*
        Name=jeet
        date created=19thjan
        email:- jeet
        connections:-{"Mom","Dad"}
        accomplishments:-{"Gsoc","Some Hackathon"}
        skills:- {"Java","C++","Data Structures"}
        notice:-""
        education:-"Btech"
         */
        ArrayList<String> connections = new ArrayList<>();
        connections.add("mom");
        ArrayList<String> accomplishments = new ArrayList<>();
        accomplishments.add("GSOC");
        ArrayList<String> skills = new ArrayList<>();
        skills.add("Java");
        ArrayList<String> jobs = new ArrayList<>();
        jobs.add("Engineer");

        ArrayList<Account> x = new ArrayList<>();
        x.add(new IndividualAccount("Jeet","19thJan","jeet_email",connections,
                accomplishments,skills,"HI", "BS"));
        x.add(new IndividualAccount("Bob", "18/01/1999", "aa@email.com", connections,
                accomplishments, skills, "None", "AS"));
        x.add(new BusinessAccount("Bob", "18/01/1999", "aa@email.com", connections,
                "ab@email.com", jobs, 5));
        x.add(new BusinessAccount());
        x.add(new CommunityAccount());
        x.add(new CommunityAccount());

        for (int i = 0; i< x.size(); i++){
            System.out.println(x.get(i).toString());

        }
        System.out.println("\n");

        AccountManager accountManager = new AccountManager();
        accountManager.addToList(new IndividualAccount("Jeet","19thJan","jeet_email",connections,
                accomplishments,skills,"HI", "BS"));
        accountManager.addToList(new IndividualAccount("Bob", "18/01/1999", "aa@email.com", connections,
                accomplishments, skills, "None", "AS"));
        accountManager.addToList(new BusinessAccount("Bob", "18/01/1999", "aa@email.com", connections,
                "ab@email.com", jobs, 5));
        accountManager.addToList(new BusinessAccount());
        accountManager.addToList(new CommunityAccount());
        accountManager.addToList(new CommunityAccount());

        accountManager.print();
    }
}
