import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double[] monthlySalary = new double[3];

    Employee(int empId, String empName, double[] monthlySalary) {
        this.empId = empId;
        this.empName = empName;
        this.monthlySalary = monthlySalary;
    }

    
    double calculateTotalSalary() {
        double total = 0;
        for (double salary : monthlySalary) {
            total += salary;
        }
        return total;
    }

    
    double calculateAverageSalary() {
        return calculateTotalSalary() / monthlySalary.length;
    }

    
    int countVowels() {
        int count = 0;
        String name = empName.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

   
    String reverseName() {
        String reversed = "";
        for (int i = empName.length() - 1; i >= 0; i--) {
            reversed += empName.charAt(i);
        }
        return reversed;
    }

    
    void displayDetails() {
        System.out.println("\nEmployee ID : " + empId);
        System.out.println("Employee Name : " + empName);

        System.out.println("\nTotal Salary : " + (int) calculateTotalSalary());
        System.out.println("Average Salary : " + (int) calculateAverageSalary());

        System.out.println("\nNumber of Vowels : " + countVowels());

        System.out.println("\nReversed Name : " + reverseName());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID : ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Employee Name : ");
        String name = sc.nextLine();

        double[] salaries = new double[3];

        System.out.println("\nMonthly Salaries:");
        for (int i = 0; i < 3; i++) {
            salaries[i] = sc.nextDouble();
        }

        Employee emp = new Employee(id, name, salaries);

        emp.displayDetails();

        sc.close();
    }
}