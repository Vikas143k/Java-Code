class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public void getName() {
        System.out.println(name);
    }

    public void changeName(String n) {
        name = n;
    }

    public class practice {
        public static void main(String[] args) {
            Employee vikas = new Employee();
            vikas.changeName("Ghostrider");
            vikas.getName();
            vikas.salary = 1234432;
            System.out.println(vikas.getSalary());
        }
    }
}
