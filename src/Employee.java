public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private int departament;
    private double salary;
    private int id ;
    private static int numberOfСycles = 1;


    public Employee(String lastName, String firstName, String middleName, int departament, double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.departament = departament;
        this.salary = salary;
        this.id = numberOfСycles++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartament() {
        return departament;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartament(int departament) {
        if (departament < 1 || departament >5) {
            throw new IllegalArgumentException("Существующие департаменты от 1 до 5");
        }
        this.departament = departament;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ". "+"Сотрудник: ФИО - " + firstName + " " + lastName + " " + middleName + "; Департамент - " + departament + "; Зарплата - " + salary + "руб.";
    }
}
