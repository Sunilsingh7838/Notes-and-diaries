public
class Thread_Sout {

    static final Object lock =new Object();

    public static
    void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(()->{
            synchronized (lock){
                System.out.println("Thread 1 : thread1 started........");
                try {
                Thread.sleep(5000);
                }catch (InterruptedException e){
                   e.printStackTrace();
                }
                System.out.println("Thread1 : thread1 Exicted......");
            }
        });
        Thread thread2 = new Thread(()->{
            synchronized (lock){
                System.out.println("Thread 2 : thread2 started......");
                try{
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Thread 2 : thread2 exicted........");
            }
        });
        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();
        System.out.println("Exicted............");
    }
}
