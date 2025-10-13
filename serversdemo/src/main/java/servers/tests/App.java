import java.time.Duration;
import java.util.concurrent.*;

public class App 
{

    public static void main( String[] args )
    {
        // var service = Executors.newSingleThreadExecutor();
        // service.submit(new TaskSimulation("client 1", 1, TimeUnit.SECONDS));
        // service.submit(new TaskSimulation("client 2", 1, TimeUnit.SECONDS));
        // service.submit(new TaskSimulation("client 3", 1, TimeUnit.SECONDS));
        // service.submit(new TaskSimulation("client 4", 1, TimeUnit.SECONDS));
        // service.submit(new TaskSimulation("client 5", 1, TimeUnit.SECONDS));
        // Runtime.getRuntime().availableProcessors();
        var service = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 8; i++) {
            service.submit(new TaskSimulation("cliente "+i, 2, TimeUnit.SECONDS));
        }
        service.shutdownNow();
        
    }

    static class TaskSimulation implements Runnable {
        long amount;
        TimeUnit unit;
        String id;

        public TaskSimulation(String id, long duration, TimeUnit unit){
            this.id = id;
            this.amount = duration;
            this.unit = unit;
        }

        @Override
        public void run(){
            System.out.println(id + ": started");
            try {
                Thread.sleep(Duration.of(amount, unit.toChronoUnit()));
                System.out.println(id + ": ended");
            } catch (InterruptedException e) {
                System.out.println(id + ": interrumpimos antes de tiempo");
            }
        }
        
    }
}
