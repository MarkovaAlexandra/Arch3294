package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {
    public int card;
    public int balance;
    public int oldCard;



    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }

    public int getCard() {
        return card;
    }

    public int getBalance() {
        return balance;
    }

    public int getOldCard() {
        return oldCard;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setOldCard(int oldCard) {
        this.oldCard = oldCard;
    }
    
}
