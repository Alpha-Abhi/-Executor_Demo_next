import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
     	//Simple thread
		Runnable t = new Runnable(){
		 @Override
		 public void run() {
			 while(true) {
				 try {Thread.sleep(2000);}catch(Exception e) {System.out.println(e);}
			 System.out.println("thread running....."); 
			 }
		 }
		};
	//	t.start();
		
		
		
		//threads with ExecutorService

     ScheduledExecutorService ss = Executors.newSingleThreadScheduledExecutor();
     ss.scheduleAtFixedRate(new FromRunnable(),2, 5, TimeUnit.SECONDS);
    // ss.submit(new FromCallable());
     
     Future<Integer> ff = ss.submit(new FromCallable());
     System.out.println(ff.get());
		

	}

}
