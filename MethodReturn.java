public class MethodReturn {
    public double displaySalary(double salary,double hra){
        double totalSalary = salary + hra;
        return totalSalary;
    }
    public static void main(String[] args) {
        MethodReturn obj = new MethodReturn();
        double totalSalary = obj.displaySalary(20000, 2000);
        System.out.println("Total salary is: " + totalSalary);
    }
}
