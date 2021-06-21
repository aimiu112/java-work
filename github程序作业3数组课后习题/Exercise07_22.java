public class Exercise07_22 {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println(
        "Usage: java Exercise07_22 string");
      System.exit(1);
    }

    String s = args[0];
    int total = 0;

    for (int i = 0; i < s.length(); i++) {
      if (Character.isUpperCase(s.charAt(i)))
        total++;
    }

    System.out.println("The number of uppercase letters is " +
      total);
  }
}
