public class Main {
    public static void main(String[] args) {
        Employee ceo = new Employee("Rico", "CEO", 100_000);
        
        Employee headSales = new Employee("Jelane", "Head Sales", 90_000);
        
        Employee headMarketing = new Employee("Suvo", "Head Marketing", 80_000);

        Employee clerk1 = new Employee("Clerk1", "Marketing", 25_000);
        Employee clerk2 = new Employee("Clerk2", "Marketing", 25_000);

        Employee salesExecutive1 = new Employee("Exec1", "Sale", 30_000);
        Employee salesExecutive2 = new Employee("Exec2", "Sales", 30_000);

        ceo.addSubordinate(headSales);
        ceo.addSubordinate(headMarketing);

        headMarketing.addSubordinate(clerk1);
        headMarketing.addSubordinate(clerk2);

        headSales.addSubordinate(salesExecutive1);
        headSales.addSubordinate(salesExecutive2);

        ceo.getEmployeeInfo();

        for(Employee headEmployee: ceo.getSubordinates()){
            headEmployee.getEmployeeInfo();

            for(Employee employee: headEmployee.getSubordinates()){
                employee.getEmployeeInfo();
            }
        }
    }
}
