package DesignPatterns.BehaviouralDesignPatterns.TemplatePattern;

public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();

    //This is template method which defines order of steps to execute the task
    public final void sendMoney() {

        //step1
        validateRequest();

        //step2
        debitAmount();

        //step3
        calculateFees();

        //step4
        creditAmount();
    }
}
