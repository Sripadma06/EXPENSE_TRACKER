import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Employee emp = new Employee();
                    System.out.print("Enter Name: ");
                    emp.setName(sc.next());
                    System.out.print("Enter Department: ");
                    emp.setDepartment(sc.next());
                    System.out.print("Enter Salary: ");
                    emp.setSalary(sc.nextDouble());

                    dao.addEmployee(emp);
                    break;

                case 2:
                    dao.viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter New Salary: ");
                    double sal = sc.nextDouble();

                    dao.updateEmployee(id, sal);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    dao.deleteEmployee(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    dao.searchEmployee(sc.nextInt());
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}