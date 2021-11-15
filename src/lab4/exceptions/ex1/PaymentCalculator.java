package lab4.exceptions.ex1;

public class PaymentCalculator {

    public int process(int nr){
        if (nr == 0){
            throw new DivByZeroException();
        }
        return 5000 / nr + 300;
    }
    private void checkHours(int numberOfHours) throws FewHoursException {
        if (numberOfHours < 30 && numberOfHours > 0){
            throw new FewHoursException();
        }
    }
    public int calculate(int numberOfHours) throws FewHoursException {
        int result = 0;

        try {
            checkHours(numberOfHours);
        } catch(FewHoursException ex){
            System.out.println("Not enough exception occurred.");
            numberOfHours = 31;
        }
        result = process(numberOfHours);
        return result;
    }
}
