import adapter.exercise.Deska;
import adapter.exercise.DeskaAdapter;
import adapter.exercise.Drewno;
import adapter.exercise.DrewnoConverter;
import builder.Builder;
import builder.Kebab;
import builder.KebabBuilder;
import builder.KebabNested;
import factory.exercise.Flower;
import factory.exercise.FlowerFactory;
import factory.exercise.FlowerType;
import singleton.BankingAccountSingleton;

public class DesignPatternsMain {
    public static void main(String[] args) {
//        singletonExample();
//        factoryExample();
//        nestedBuilderExample();
//        builderExample();
        adapterExample();
    }

    private static void adapterExample() {
        Drewno deska = new Deska(100, 20);

        DrewnoConverter deskaConv = new DeskaAdapter(deska);

        System.out.println(deska.getLength() + ", " + deska.getMass());
        System.out.println(deskaConv.getLength() + ", " + deskaConv.getMass());
    }

    private static void builderExample() {
        KebabBuilder builder = new KebabBuilder();

        builder.setBun(Builder.Bun.BREAD_BUN);
        builder.setMeat(Builder.Meat.CHICKEN);
        builder.setTopping(Builder.Toppings.TOMATO);

        Kebab kebab = builder.build();
        System.out.println(kebab);
    }

    private static void nestedBuilderExample() {
        KebabNested kebabNested1 = new KebabNested.Builder()
                .setBun(KebabNested.Bun.TORTILLA)
                .setMeat(KebabNested.Meat.CHICKEN)
                .setSauce(KebabNested.Sauce.MIXED)
                .build();

        KebabNested kebabNested2 = new KebabNested.Builder()
                .setBun(KebabNested.Bun.BREAD_BUN)
                .setMeat(KebabNested.Meat.BEEF)
                .setLettuce()
                .setOnion()
                .setSauce(KebabNested.Sauce.GARLIC)
                .build();

        System.out.println(kebabNested1);
        System.out.println(kebabNested2);
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
