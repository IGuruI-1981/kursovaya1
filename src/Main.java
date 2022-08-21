public class Main {
   static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        System.out.println("Hello SkyPRO!");

        employees[0] = new Employee("Иванов", "Виктор", "Александрович", 2, 45060.56);
        employees[1] = new Employee("Иванова", "Евгения", "Владимировна", 1, 67900.67);
        employees[2] = new Employee("Герасимов", "Иван", "Михайлович", 4, 34785.65);
        employees[3] = new Employee(null, null, null, 5, 56567.34);
        employees[4] = new Employee("Козлова", "Вероника", "Фёдоровна", 3, 54785.45);
        employees[5] = new Employee("Педалькина", "Фёкла", "Ивановна", 3, 33465.62);
        employees[7] = new Employee("Савельева", "Ирина", "Вадимовна", 5, 33256.23);
        employees[8] = new Employee("Сидоров", "Алексей", "Алексеевич", 1, 85455.23);
        employees[9] = new Employee("Козлов", "Александр", "Николаевич", 2, 93756.89);

        getAllEmployee();
        System.out.println("Cумма затрат на зарплаты : " + calculateEmployeeSalary() + "руб.");
        System.out.println("Среднее значение зарплат :" + calculateAverageSalary() + "руб.");
        System.out.println("Минимальная зарплата у сотрудника:" + employees[getEmployeeMinSalary()] + "руб.");
        System.out.println("Максимальная зарплата у сотрудника:" + employees[getEmployeeMaxSalary()] + "руб.");


        fullNameAllEmploees();
    }

    public static void getAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public static double calculateEmployeeSalary() {
        double sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sumSalary = sumSalary + employees[i].getSalary();
            }
            
        }
        return sumSalary;
    }

//    public static int searchIndexNotNull() {
//        int employ;
//        for (employ = 0; employ < employees.length; employ++) {
//            if (employees[employ] != null) {
//                break;
//            }
//            break;
//            return employ;
//    }
    public static int getEmployeeMinSalary() {
        double minSalary;
        int employ;
        int id = 0;
        for (employ = 0; employ < employees.length; employ++) {
            if (employees[employ] != null) {
                break;
            }
            break;
        }
        minSalary = employees[employ].getSalary();
        for (int i = employ++; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                id =i;
            }
        }
        return id;
    }

    public static int getEmployeeMaxSalary() {
        double maxSalary;
        int employ;
        int id =0;
        for (employ = 0; employ < employees.length; employ++) {   // пребераем массив до поиска не нулевого
            if (employees[employ] != null) {
                break;
            }
            break;
        }
        maxSalary = employees[employ].getSalary();
        for (int i = employ++; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                id = i;

            }
        }
        return id;
    }

    public static double calculateAverageSalary() {
        double sumAverege;
        if (employees.length != 0) {
            sumAverege = calculateEmployeeSalary() / employees.length;
        } else {
            sumAverege = 0;
        }
        return sumAverege;
    }

    public static void fullNameAllEmploees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("ФИО сотрудника : " + employees[i].getFirstName() + " " + employees[i].getLastName() + " " + employees[i].getMiddleName());
            }
        }
    }
}

//- **Повышенная сложность**
//
//        Создать дополнительные статические методы для решения следующих задач.
//
//        1. Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
//        2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
//        1. Сотрудника с минимальной зарплатой.
//        2. Сотрудника с максимальной зарплатой.
//        3. Сумму затрат на зарплату по отделу.
//        4. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
//        5. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
//        6. Напечатать всех сотрудников отдела (все данные, кроме отдела).
//        3. Получить в качестве параметра число и найти:
//        1. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
//        2. Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
//
//        - Критерии оценки