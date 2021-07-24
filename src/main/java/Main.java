import java.lang.*;

public class Main {

    public static void main(String[] args) {
        ThreadGroup group1 = new ThreadGroup("group");
        MyThread my = new MyThread();
        System.out.println("создание потоков");
        Thread thread1 = new Thread(group1, my,"Поток 1");
        Thread thread2 = new Thread(group1, my,"Поток 2");
        Thread thread3 = new Thread(group1,my,"Поток 3");
        System.out.println("запуск потоков");
        thread1.start();
        thread2.start();
        thread3.start();
        try{
            Thread.sleep(15000);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        group1.interrupt();
        System.out.println("Завршение потоков");

    }

}
