package nicebank;

public class AutomatedTeller {
    private CashSlot cashSlot;

    public AutomatedTeller(CashSlot cashSlot){
        this.cashSlot = cashSlot;
    }

    public void withdrawFrom(Account account, int dollars) {
        account.debit(new Money(dollars, 0));
        cashSlot.dispense(dollars);
    }
}
