package Task1;

public class Main {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        emplArray[1] = new Employee("Petrov Petia", "Engineer", "petpetia@mailbox.com", "892312321", 35000, 35);
        emplArray[2] = new Employee("Dimanov Dima", "Engineer", "dimdimn@mailbox.com", "892312332", 40000, 40);
        emplArray[3] = new Employee("Igorkov Igor", "Engineer", "igig@mailbox.com", "892312314", 40000, 42);
        emplArray[4] = new Employee("Olegov Oleg", "Engineer", "ivivan@mailbox.com", "892312316", 45000, 45);

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].age > 40) {
                System.out.println(emplArray[i].toString());
            }
        }
    }
}
