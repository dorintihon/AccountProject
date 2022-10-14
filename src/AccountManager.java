import java.util.ArrayList;

class AccountManager{

    ArrayList<Account> accountList;
    private Account ia1;
    private Account ia2;
    private Account ba1;
    private Account ba2;
    private Account ca1;
    private Account ca2;


    public AccountManager() {
        accountList = new ArrayList<>();
        ia1 = new IndividualAccount();
        ia2 = new IndividualAccount();
        ba1 = new BusinessAccount();
        ba2 = new BusinessAccount();
        ca1 = new CommunityAccount();
        ca2 = new CommunityAccount();
    }

    public AccountManager(IndividualAccount ia1, IndividualAccount ia2,
                          BusinessAccount ba1, BusinessAccount ba2,
                          CommunityAccount ca1, CommunityAccount ca2){
        this.ia1 = ia1;
        this.ia2 = ia2;
        this.ba1 = ba1;
        this.ba2 = ba2;
        this.ca1 = ca1;
        this.ca2 = ca2;

    }
    public void print(){
        for(int i =0; i< accountList.size(); i++){
            System.out.println(accountList.get(i).toString());
            System.out.println("\n");
        }
    }
    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

    public int getListSize(){
        return accountList.size();
    }

    public void addToList(Account obj) {
        this.accountList.add(obj);
    }


    public Account getIa1() {
        return ia1;
    }

    public void setIa1(Account ia1) {
        this.ia1 = ia1;
    }

    public Account getIa2() {
        return ia2;
    }

    public void setIa2(Account ia2) {
        this.ia2 = ia2;
    }

    public Account getBa1() {
        return ba1;
    }

    public void setBa1(Account ba1) {
        this.ba1 = ba1;
    }

    public Account getBa2() {
        return ba2;
    }

    public void setBa2(Account ba2) {
        this.ba2 = ba2;
    }

    public Account getCa1() {
        return ca1;
    }

    public void setCa1(Account ca1) {
        this.ca1 = ca1;
    }

    public Account getCa2() {
        return ca2;
    }

    public void setCa2(Account ca2) {
        this.ca2 = ca2;
    }

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

}