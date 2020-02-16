public class ValidatorTest implements Validator<Integer> {

    @Override
    public boolean isEven(Integer object) {
        return object % 2 == 0;
    }
}
