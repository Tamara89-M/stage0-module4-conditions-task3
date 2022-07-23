package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double salary_variable = salary;
        if (salary < 0){
            System.out.println("wrong input!");
        }else if (salary <= 10000) {
            salary_variable -= salary_variable * 15/100;
            System.out.println(salary_variable);
        } else if (salary > 10000 && salary <= 20000) {

            salary_variable -= salary_variable * 18 / 100;
            System.out.println(salary_variable);
        } else {

            salary_variable -= salary_variable * 20 / 100;
            System.out.println(salary_variable);
        }
    }

    public static void main(String[] args) {
        SalaryCalculator s = new SalaryCalculator();
        s.calculateSalary(35000);
    }
}
