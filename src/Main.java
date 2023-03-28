import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Input name");
            String name = scan.nextLine();
            System.out.println("Input surname");
            String surname = scan.nextLine();
            System.out.println("Input salary");
            int salary = scan.nextInt();
            Employee employee = new Employee(name, surname, salary);
            System.out.println("Employee " + employee.getId() + "\n" + employee.getName() + " "
                    + employee.getSurname() + "\nSalary: " + employee.getSalary());
        }catch (FieldLengthLimitException | IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }
    }
}