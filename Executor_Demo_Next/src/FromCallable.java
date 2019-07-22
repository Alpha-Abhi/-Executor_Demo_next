import java.util.concurrent.Callable;

public class FromCallable implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		
		return 123456;
	}

}
