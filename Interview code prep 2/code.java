class code{

    private volatile boolean flag = false;

    public void setFlag(boolean value) {
        flag = value;
    }

    public void printFlag() {
        System.out.println("Flag value: " + flag);
    }
    public static
    void main(String[] args) {
        code main = new code();

        // Thread 1 - updates the flag
        Thread t1 = new Thread(() -> {
            main.setFlag(true);
        });

        // Thread 2 - reads the flag
        Thread t2 = new Thread(() -> {
            while (!main.flag) {
                // Wait until the flag becomes true
            }
            main.printFlag();
        });

        t1.start();
        t2.start();
    }
}