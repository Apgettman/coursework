package coursework;
public class CourseWork {
    private static final Employee[] employee = new Employee[5];
    // coursework
    public static void main(String[] args) {
        employee[0] = new Employee("Петров Петр Петрович ", 1, 280000);
        employee[1] = new Employee("Иванов Иван Иванович", 2, 325500);
        employee[2] = new Employee("Семенов Семен Семенович", 3, 310000);
        employee[3] = new Employee("Павлов Павел Павлович", 4, 295000);
        employee[4] = new Employee("Александров Александр Александрович", 5, 260000);

        System.out.println("Сумма затрат на зарплаты сотрудников составляет: " + sumSalary() + " рублей!");
        System.out.println("Минимальная зарплата сотрудника " + getMinSalary() + " рублей!");
        System.out.println("Максимальная зарплата сотрудника " + getMaxSalary() + " рублей!");
        System.out.println("Среднее значение зарплат " + getAverage() + " рублей!");
        System.out.println("Список всех " + listOfEmployee() + " сотрудников!");
    }
    public static int sumSalary() {
        int sum = 0;
        for (Employee employee : employee) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public static Employee getMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee maxEmployee = null;
        for (Employee a : employee) {
            if (a != null && a.getSalary() > max) {
                max = a.getSalary();
                maxEmployee = a;
            }
        }
        return maxEmployee;
    }
    public static Employee getMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee minEmployee = null;
        for (Employee b : employee) {
            if (b != null && b.getSalary() < min) {
                min = b.getSalary();
                minEmployee = b;
            }
        }
        return minEmployee;
    }
    public static int getAverage() {
        int average = 0;
        for (Employee a : employee) {
            if (a != null) {
                average = sumSalary();
                average = average / employee.length;
            }
        }
        return average;
    }
    public static int listOfEmployee() {
        for (Employee employee : employee) {
            System.out.println(employee.getFullName());
        }
        return employee.length;
    }
}