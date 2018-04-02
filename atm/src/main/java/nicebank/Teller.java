package nicebank;

public class Teller {
    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdrawFrom(Account account, int dollars) {
        account.debit(new Money(dollars,0));
        cashSlot.dispense(dollars);
    }
}
