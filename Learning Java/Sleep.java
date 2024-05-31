public class Sleep {
    public static void main(String[] args) throws InterruptedException {
        long beforeSleep = System.currentTimeMillis();
        Thread.sleep(3000);
        long afterSleep = System.currentTimeMillis();
        System.out.println(afterSleep - beforeSleep);
    }
}
