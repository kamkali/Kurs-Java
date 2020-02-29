import singleton.BankingAccountSingleton;

public class DesignPatternsMain {
    public static void main(String[] args) {
        BankingAccountSingleton bankAcc = BankingAccountSingleton.getInstance();

        bankAcc.setBalance(1000);
        System.out.println(bankAcc.getBalance());

        edit1();
        System.out.println(bankAcc.getBalance());

        edit2();
        System.out.println(bankAcc.getBalance());
    }

    private static void edit1() {
        BankingAccountSingleton.getInstance().setBalance(900);
    }

    private static void edit2() {
        BankingAccountSingleton.getInstance().setBalance(1200);
    }
}
