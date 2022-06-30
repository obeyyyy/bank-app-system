public class operations {

    int balance;

    public String balance()
      {
        return "Your balance is : £" + balance;
      }
    public void Withdaw(int with)
      {
        balance -= with;
      }
    public void Deposit(int add)
      {
        balance += add;
      }
}



