package az.ms.jeans.git;

import java.util.Scanner;

public class Bank {
    private String bankAccountName;
    private Integer bankUserEnterCode;

    public Bank(String bankAccountName, Integer bankUserEnterCode) {
        this.bankAccountName = bankAccountName;
        this.bankUserEnterCode = bankUserEnterCode;
    }

    public Bank getBankInstance(String name, Integer number) {

        return new Bank(name, number);
    }

    private void littleTalking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = scanner.nextLine();
        System.out.println("Enter your age ");
        Integer age = scanner.nextInt();
        System.out.println("Hello "+name+"We are defined your age as " + age);
    }
}
