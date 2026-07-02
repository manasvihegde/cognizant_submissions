class logger {
    private static logger instance;

    private logger() {} 

    public static logger getInstance() {
        if(instance == null)
            instance = new logger();

        return instance;
    }

    public static void main(String[] args) {
        logger logger1 = logger.getInstance();
        logger logger2 = logger.getInstance();

        System.out.println(logger1 == logger2); 
    }
}
