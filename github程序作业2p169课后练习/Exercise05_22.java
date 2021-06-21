public class Exercise05_22 {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

  
    System.out.print(
      "Enter loan amount, for example 120000.95: ");
    double loanAmount = input.nextDouble();

   
    System.out.print(
      "Enter number of years as an integer, for example 5: ");
    int numOfYears = input.nextInt();

 
    System.out.print("Enter yearly interest rate, for example 8.25: ");
    double annualInterestRate = input.nextDouble();

    double monthlyInterestRate = annualInterestRate/1200;

  
    double monthlyPayment = loanAmount*monthlyInterestRate /
      (1 - (Math.pow(1 / (1 + monthlyInterestRate), numOfYears * 12)));

    double balance = loanAmount;
    double interest;
    double principal;

    System.out.println("Monthly Payment: " + (int)(monthlyPayment * 100) / 100.0 );
    System.out.println("Total Payment: " + (int)(monthlyPayment * 12 * numOfYears * 100) / 100.0 + "\n" );

    
    System.out.printf("%-15s%-15s%-15s%-15s\n", "Payment#", "Interest", "Principal", "Balance");
    for (int i = 1; i <= numOfYears * 12; i++) {
      interest = monthlyInterestRate * balance;
      principal = monthlyPayment - interest;
      balance = balance - principal;
      System.out.printf("%-15d%-15.2f%-15.2f%-15.2f\n", i, interest, principal, balance);
    }
  }
}
