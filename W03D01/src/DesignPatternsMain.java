import factory.builder.Hall;
import factory.builder.Kebab;
import factory.exercise.Flower;
import factory.exercise.FlowerFactory;
import factory.exercise.FlowerType;
import singleton.BankingAccountSingleton;

public class DesignPatternsMain {
    public static void main(String[] args) {
//        singletonExample();
//        factoryExample();
        builderExample();
    }

    private static void builderExample() {
        Kebab kebab1 = new Kebab.Builder()
                .setBun(Kebab.Bun.TORTILLA)
                .setMeat(Kebab.Meat.CHICKEN)
                .setSauce(Kebab.Sauce.MIXED)
                .build();

        Kebab kebab2 = new Kebab.Builder()
                .setBun(Kebab.Bun.BREAD_BUN)
                .setMeat(Kebab.Meat.BEEF)
                .setLettuce()
                .setOnion()
                .setSauce(Kebab.Sauce.GARLIC)
                .build();

        System.out.println(kebab1);
        System.out.println(kebab2);
    }

    private static void factoryExample() {
        FlowerFactory factory = new FlowerFactory();

        Flower flower1 = factory.createFlower();
        System.out.println(flower1.name());

        Flower rose = factory.createFlower(FlowerType.ROSE);
        System.out.println(rose.name() + " " + rose.color());
    }

    private static void singletonExample() {
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
