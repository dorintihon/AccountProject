import java.util.ArrayList;
//Dorin Tihon
/**
 AccountManager class that gives the ability to manage other classes.
 It has an ArrayList of 6 Account objects, 2 of each specific account types.
 With a method to print all the objects, a method to get account information by name
 */


class AccountManager{

    //Private variables for this class
    private ArrayList<Account> accountList;
    private Account ia1;
    private Account ia2;
    private Account ba1;
    private Account ba2;
    private Account ca1;
    private Account ca2;

    //Default constructor
    public AccountManager() {
        accountList = new ArrayList<>();
        ia1 = new IndividualAccount();
        ia2 = new IndividualAccount();
        ba1 = new BusinessAccount();
        ba2 = new BusinessAccount();
        ca1 = new CommunityAccount();
        ca2 = new CommunityAccount();
    }

    //Constructor with parameters
    public AccountManager(IndividualAccount ia1, IndividualAccount ia2,
                          BusinessAccount ba1, BusinessAccount ba2,
                          CommunityAccount ca1, CommunityAccount ca2){
        accountList = new ArrayList<>();
        accountList.add(ia1);
        accountList.add(ia2);
        accountList.add(ba1);
        accountList.add(ba2);
        accountList.add(ca1);
        accountList.add(ca2);

    }

    //printAccounts() it prints all objects information.
    public void printAccounts(){
        for(int i =0; i< accountList.size(); i++){
            System.out.println(accountList.get(i).toString());
            System.out.println("\n");
        }
    }

    //getAccountList() returns the accountList variable
    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    //setAccountList(ArrayList<Account> accountList) sets the accountList variable to the give parameter
    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

    //getListSize() returns the size of the account list
    public int getListSize(){
        return accountList.size();
    }

    //getAccountInfo(String name) returns the information of the object which contains the specified parameter
    public Account getAccountInfo(String name){

        for (int i = 0; i < accountList.size(); i++){
            if(accountList.get(i).getName().equals(name)){
                return accountList.get(i);
            }
        }

        return null;
    }


    //getIa1() returns the ia1 variable
    public Account getIa1() {return ia1;}

    public void setIa1(Account ia1) {
        this.ia1 = ia1;
        accountList.add(ia1);
    }

    //getIa2() returns the ia2 variable
    public Account getIa2() {
        return ia2;
    }

    //setIa2(Account ia2) sets the ia2 variable to the given parameter
    public void setIa2(Account ia2) {
        this.ia2 = ia2;
        accountList.add(ia2);
    }

    //getBa1() returns the ba1 variable
    public Account getBa1() {
        return ba1;

    }

    //setBa1(Account ba1) sets the ba1 variable to the given parameter
    public void setBa1(Account ba1) {
        this.ba1 = ba1;
        accountList.add(ba1);
    }

    //getBa2() returns the ba2 variable
    public Account getBa2() {
        return ba2;
    }

    //setBa2(Account ba2) sets the ba2 variable to the given parameter
    public void setBa2(Account ba2) {
        this.ba2 = ba2;
        accountList.add(ba2);
    }

    //getCa1() returns the ca1 variable
    public Account getCa1() {
        return ca1;
    }

    //setCa1(Account ca1) sets the ca1 variable to the given parameter
    public void setCa1(Account ca1) {
        this.ca1 = ca1;
        accountList.add(ca1);
    }

    //getCa2() returns the ca2 variable
    public Account getCa2() {
        return ca2;
    }

    //setCa2(Account ca2) sets the ca2 variable to the given parameter
    public void setCa2(Account ca2) {
        this.ca2 = ca2;
        accountList.add(ca1);
    }


    //toString() method returns the values of AccountManager class in string format
    @Override
    public String toString() {
        return "accountList=" + accountList +
                ", indAcc1=" + ia1 +
                ", indAcc2=" + ia2 +
                ", bussAcc1=" + ba1 +
                ", bussAcc2=" + ba2 +
                ", comAcc1=" + ca1 +
                ", comAcc2=" + ca2 ;
    }

    //equals(Object obj) to check whether two objects have same data or not
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            AccountManager accManager = (AccountManager) obj;
            return  accountList == accManager.getAccountList() && ia1.equals(accManager.getIa1()) && ia2.equals(accManager.getIa2()) &&
                    ba1.equals(accManager.getBa1()) && ba2.equals(accManager.getBa2()) && ca1.equals(accManager.getCa1()) && ca2.equals(accManager.getCa2());
        }
        return false;
    }

}