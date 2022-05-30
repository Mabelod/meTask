package home;

public class Fine {
    public static void main(String[] args) {
            int salary = 45000;
            int counter = 7;
            int fine = 300;
            int allowance = 0;
            if (counter > 1){
                for (int i = 1;  i <= counter - 1; i++) {
                    allowance = allowance + (i * 100);
                }
            }
            fine = (fine * counter) + allowance;
            System.out.println("Зарплата = " + salary);
            salary -= fine;
            System.out.println("Штраф = " + fine);
            System.out.println("Зарплата с вычетом штрафа = " + salary);
    }
}
