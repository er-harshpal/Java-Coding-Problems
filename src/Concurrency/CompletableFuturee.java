package Concurrency;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import static Concurrency.CompletableFuturee.sleep;


public class CompletableFuturee {

	public static void main(String[] args){

		ExecutorService executor = Executors.newFixedThreadPool(4);

		try {
			// CompletedFuture: It is the simplest factory method of CompletableFuture.
			// It creates completable future that is already completed with a given value.
			CompletableFuture<String> completed = CompletableFuture.completedFuture("Already Completed");
			System.out.println("completedFuture: "+completed.join());

			// runAsync()
			// It executes a task asynchronously in another threa dwithout returning any result
			CompletableFuture<Void> runTask =
					CompletableFuture.runAsync(() -> {
						System.out.println("runAsync: executing background task");
					}, executor);
			runTask.join();

			// SupplyAsync
			// It is a static method of CompletableFuture that executes a task asynchronously and it returns a value.
			CompletableFuture<String> supplyTask =
					CompletableFuture.supplyAsync(()->
					{
						sleep(1000);
						return "Java";
					},executor);

			// thenApply
			//It demonstrates how to transform the result of one asynchronous computation into another
			// It is used to transform the result of a completedCompletableFuture
			CompletableFuture<String> upperCase =
					CompletableFuture.supplyAsync(()-> "java", executor)
							.thenApply(String::toUpperCase);
			System.out.println("thenApply :"+ upperCase.join());

			//thenAccept()
			// It is used when you want to use the result of a previous CompletableFuture, but you don't want to return a new value
			CompletableFuture <Void> accept =
			        CompletableFuture.supplyAsync(()-> "Spring boot", executor)
			               .thenAccept(s -> System.out.println("thenAccept : "+s));
            accept.join();


			// thenRun()
			// Used to execute another task after the previous
			// CompletableFuture completes successfully:
			// it does not recieve prev result :
			// it does not return a new result
			CompletableFuture<Void> run =
					CompletableFuture.supplyAsync(()->"Task Finished", executor)
							.thenRun(()->
									System.out.println("thenRun-CleanUp Complete"));
			run.join();


			//then Compose():
			// It is used when the next operation
			// itself returns a CompletableFuture
			CompletableFuture<String> compose =
					CompletableFuture.supplyAsync(() -> "Harsh Pal", executor)
							.thenCompose(name ->
									CompletableFuture.supplyAsync(
											()-> name+"'s Orders",
											executor ));
			System.out.println("thenCompose : "+ compose.join());


			// thenCombine():
			// It is used when two independence
			// CompletableFutures and you want to wait for both to complete
			// and combine their results
			CompletableFuture<Integer> price =
			CompletableFuture.supplyAsync(()-> 1000, executor);
			CompletableFuture<Integer> discount =
			CompletableFuture.supplyAsync(()-> 200, executor);
			CompletableFuture<Integer> finalPrice =
					price.thenCombine(discount, (p, d) -> p-d);

			System.out.println("thenCombine : "+ finalPrice.join());


			//allOf()
			// It is used when used want to wait
			// for multiple Completable future to complete vefore proceeding.
			// Unlike combine which combines two  futures all of can wait for any number of futures
			CompletableFuture<String> f1 =
					CompletableFuture.supplyAsync(
							() -> {
								sleep(1000);
								return "A";
							}, executor);
			CompletableFuture<String> f2 =
					CompletableFuture.supplyAsync(
							() -> {
								sleep(2000);
								return "B";
							}, executor);
			CompletableFuture<String> f3 =
					CompletableFuture.supplyAsync(
							() -> {
								sleep(2000);
								return "C";
							}, executor);
			CompletableFuture<Void> all =
					CompletableFuture.allOf(f1, f2, f3);

			all.join();

			System.out.println("allOf : "
					+ f1.join() + " "
					+ f2.join() + " "
					+ f3.join() + " "
			);


			// anyOf
			// It is the opposite of allOf
			// all of waits for all the Futures
			// while the anyOf waits for the first future to complete
			CompletableFuture<Object> any =
					CompletableFuture.anyOf(f1, f2, f3);
			System.out.println("anyOf : " + any.join());


			// exceptionally

			CompletableFuture<Integer> exceptionFuture =
					CompletableFuture.supplyAsync(
							() -> 10/0, executor)
							.exceptionally(
									ex -> {
										System.out.println("Exception"+ex.getMessage());
										return 0;
									});
			System.out.println("exceptionally : "+ exceptionFuture.join());

			// handle
			CompletableFuture<Integer> handleFuture =
					CompletableFuture.supplyAsync(() -> 100, executor)
							.handle((result, ex) -> {

								if (ex != null)
									return 0;

								return result * 2;
							});

			System.out.println("handle : "
					+ handleFuture.join());

			// whenComplete()
			CompletableFuture<String> complete =
					CompletableFuture.supplyAsync(() -> "Completed", executor)
							.whenComplete((result, ex) -> {

								System.out.println(
										"whenComplete : Result = " + result);

							});

			System.out.println("Final : " + complete.join());
		}
		finally {
			executor.shutdown();
		}
	}
	static void sleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}



