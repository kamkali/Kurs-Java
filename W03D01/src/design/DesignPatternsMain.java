package design;

import design.adapter.exercise.Deska;
import design.adapter.exercise.DeskaAdapter;
import design.adapter.exercise.Drewno;
import design.adapter.exercise.DrewnoConverter;
import design.builder.Builder;
import design.builder.Kebab;
import design.builder.KebabBuilder;
import design.builder.KebabNested;
import design.decorator.exercise.*;
import design.decorator.theory.BasicCar;
import design.decorator.theory.Car;
import design.decorator.theory.SportsCar;
import design.decorator.theory.TruckCar;
import design.factory.exercise.Flower;
import design.factory.exercise.FlowerFactory;
import design.factory.exercise.FlowerType;
import design.singleton.BankingAccountSingleton;

public class DesignPatternsMain {
    public static void main(String[] args) {
        singletonExample();
        factoryExample();
        nestedBuilderExample();
        builderExample();
        adapterExample();
        decoratorExample();
        decoratorExercise();
    }

    private static void decoratorExercise() {
        XmasTree decoratedTree =
                new XmasBulbs(
                        new XmasChains(
                                new XmasLights(
                                        new XmasTreeImpl())));
        decoratedTree.decorate();
    }

    private static void decoratorExample() {
        Car basic = new BasicCar();
        basic.assembly();
        System.out.println();

        Car sports = new SportsCar(basic);
        sports.assembly();
        System.out.println();

        Car truck = new TruckCar(basic);
        truck.assembly();
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
