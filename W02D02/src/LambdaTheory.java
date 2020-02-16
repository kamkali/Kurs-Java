public class LambdaTheory {
    public static void main(String[] args) {
        ValidatorTest validator = new ValidatorTest();

        System.out.println(validator.isEven(51));

        // Annonymous class
        Validator<Integer> annonymousValidator = new Validator<Integer>() {
            @Override
            public boolean isEven(Integer object) {
                return object % 2 == 0;
            }
        };

        System.out.println(annonymousValidator.isEven(50));

        // Lambda
        Validator<Integer> lambdaValidator = object -> object % 2 == 0;

        System.out.println(lambdaValidator.isEven(40));
    }
}
