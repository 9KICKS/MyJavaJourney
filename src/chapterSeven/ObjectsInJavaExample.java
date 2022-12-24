package chapterSeven;

public class ObjectsInJavaExample {
    public static void main(String[] args) {
        MyAccount myAccount = new MyAccount("Folahan", 5.00);
        System.out.println("Account before squareAccountBalance: " +myAccount);
        squareAccountBalance(myAccount);
        System.out.println("Account after squareAccountBalance: " +myAccount);
    }
    private static void squareAccountBalance(MyAccount myAccount) {
        myAccount.setMyAccount(myAccount.getMyAccount() * myAccount.getMyAccount());
    }
}
