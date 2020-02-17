public class App {
    public static void main(String[] args) {
        Account account1=new Account("Shahin Zareian",2000,"INGB","INGB12345");
        Account account2=new Account("Mahdi Najafi",5000,"INGB","INGB56789");
        Account account3=new Account("koen Griffion",10000,"INGB","INGB34534");

        account1.add(1000);
        account2.remove(3000);
        account3.remove(15000);
        account1.add(1500);
        account1.remove(100);
        account3.add(5000);
        account2.remove(143);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        account2.transferTo(account3,500);
        account1.transferTo(account2,400);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);



    }
}
