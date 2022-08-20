public class Main {
   static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        System.out.println("Hello SkyPRO!");

        employees[0] = new Employee("Иванов", "Виктор", "Александрович", 2, 45060.56);
        employees[1] = new Employee("Иванова", "Евгения", "Владимировна", 1, 67900.67);
        employees[2] = new Employee("Герасимов", "Иван", "Михайлович", 4, 34785.65);
        employees[3] = new Employee(null, null, null, 5, 126567.34);
        employees[4] = new Employee("Козлова", "Вероника", "Фёдоровна", 3, 54785.45);
        employees[5] = new Employee("Педалькина", "Фёкла", "Ивановна", 3, 33465.62);
        employees[7] = new Employee("Савельева", "Ирина", "Вадимовна", 5, 33256.23);
        employees[8] = new Employee("Сидоров", "Алексей", "Алексеевич", 1, 85455.23);
        employees[9] = new Employee("Козлов", "Александр", "Николаевич", 2, 93756.89);

        getAllEmployee();
        System.out.println("Cумма затрат на зарплаты : " + calculateEmployeeSalary() + "руб.");
        System.out.println("Среднее значение зарплат :" + calculateAverageSalary() + "руб.");
        System.out.println("Минимальная зарплата :" + getEmployeeMinSalary() + "руб.");
        System.out.println("Максимальная зарплата :" + getEmployeeMaxSalary() + "руб.");


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

    public static double getEmployeeMinSalary() {
        double minSalary;
        int employ;
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

            }
        }
        return minSalary;
    }

    public static double getEmployeeMaxSalary() {
        double maxSalary;
        int employ;
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

            }
        }
        return maxSalary;
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
//            1. Получить список всех сотрудников.
//            2. Посчитать сумму затрат на зарплаты.
//3. Найти сотрудника с минимальной заплатой.
//4. Найти сотрудника с максимальной зарплатой.
//5. Подсчитать среднее значение зарплат.
//
//    Далее описаны пункты, которые нужно реализовать, чтобы сделать задание. Обратите внимание, что у задания три
//    уровня сложности в зависимости от проработки вашей программы: необходимо сделать базовые пункты, задачи с
//    повышенной сложностью и очень сложные — по желанию.
//
//
//            - **Базовая сложность**
//            1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
//            2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
//            3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
//            4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
//            5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
//            6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить
//            из счетчика).
//            7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
//            8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
//            1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
//            2. Посчитать сумму затрат на зарплаты в месяц.
//        3. Найти сотрудника с минимальной зарплатой.
//        4. Найти сотрудника с максимальной зарплатой.
//        5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
//            6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
//
//            - **Критерии оценки**
//
//            – Корректно создан класс Employee.
//
//            – Реализованы геттеры для всех полей класса.
//
//            – Реализованы сеттеры для всех полей класса.
//
//            – Создано поле типа Employee[10] для хранения записей о сотрудниках.
//
//            – Созданы методы, которые корректно выводят информацию:
//
//            - список всех сотрудников со всеми данными,
//            - поиск сотрудника с минимальной зарплатой,
//            - поиск сотрудника с максимальной зарплатой,
//            - подсчет среднего значения зарплат,
//            - список Ф. И. О. всех сотрудников.
//
//            – Программа работает корректно при изменении любых данных о сотрудниках и выводит верный результат.
