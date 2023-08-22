package src.main;


public class Program {

    public static void main(String[] args) {

        LinkedList<Employee> employeeLinkedList = new LinkedList<>();
        employeeLinkedList.addFirst(new Employee("Анна", 21));
        employeeLinkedList.addFirst(new Employee("Виктория", 33));
        employeeLinkedList.addFirst(new Employee("Елена", 40));
        employeeLinkedList.addFirst(new Employee("Дианна", 34));
        employeeLinkedList.addFirst(new Employee("Ксения", 44));
        employeeLinkedList.addFirst(new Employee("Жанна", 51));
        employeeLinkedList.addFirst(new Employee("Зинаида", 33));
        employeeLinkedList.addFirst(new Employee("Ирина", 32));
        employeeLinkedList.addFirst(new Employee("Галина", 38));

        System.out.println(employeeLinkedList);
        System.out.println();

        employeeLinkedList.reversal();
        System.out.println(employeeLinkedList);



    }

}
