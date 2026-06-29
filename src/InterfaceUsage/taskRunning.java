package InterfaceUsage;
import java.util.concurrent.*;

public class taskRunning {
    public static void main(String args[]){

        Executor executor = Executors.newSingleThreadExecutor();

        executor.execute(() -> {
            System.out.println("Task Running");
        });
    }
}
