//package PaymentSystem;
//import java.util.*;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//+
//import static java.util.concurrent.CompletableFuture.runAsync;
//import static jdk.internal.net.http.common.MinimalFuture.failedFuture;
//
//public class Payments {
//    public static void main(String[] args){
//
//    }
//}
//
//class PaymentDemo{
//
//    static class User{
//        private String userId;
//        private String name;
//        private String email;
//        User(String userId, String name, String email){
//            this.userId=userId;
//            this.name=name;
//            this.email=email;
//        }
//    }
//
//    static class PaymentRequest{
//        private User user;
//        private String orderId;
//        private double amount;
//        PaymentRequest(String orderId, User user, double amount){
//            this.orderId=orderId;
//            this.user=user;
//            this.amount=amount;
//        }
//    }
//
//    static class PaymentResponse{
//        private Status payStatus;
//        private String txnId;
//        private String orderId;
//        private User user;
//        PaymentResponse(Status payStatus, String txnId, String orderId, User user){
//            this.payStatus=payStatus;
//            this.txnId=txnId;
//            this.user=user;
//        }
//    }
//    enum Status {
//        SUCCESS,
//        FAILED,
//        PENDING
//    }
//
//
//    static class PaymentProcessService{
//        private PaymentResponse process(PaymentRequest request) {
//            if(request.amount <= 0 ){
//                throw new IllegalArgumentException("Amount is Not enough");
//            }
//            return new PaymentResponse(Status.SUCCESS,UUID.randomUUID().toString(),request.orderId, request.user);
//        }
//    }
//
//    static class OrderService{
//        private void prepareOrder(PaymentResponse res){
//            if(res.payStatus == Status.FAILED)
//                System.out.println("don't prepare order");
//            System.out.println("Prepare order for transactionId:"+res.txnId);
//        }
//    }
//
//    static class EmailService{
//        private void sendEmail(PaymentResponse res){
//            if(res.payStatus == Status.FAILED)
//                System.out.println("email failed");
//            System.out.println("Email Send");
//        }
//    }
//
//    static class PaymentOrchestrator {
//
//        private ExecutorService paymentExe;
//        private ExecutorService backgroundExe;
//
//        PaymentProcessService payService = new PaymentProcessService();
//        OrderService order = new OrderService();
//        EmailService email = new EmailService();
//
//        PaymentOrchestrator(){
//            paymentExe = Executors.newFixedThreadPool(2);
//            backgroundExe = Executors.newFixedThreadPool(2);
//        }
//
//
//    private CompletableFuture<String> process(PaymentRequest req){
//        return
//                CompletableFuture.supplyAsync(()->
//                payService.process(req),paymentExe)
//                .thenCompose(payResult -> {
//                    if (payResult.payStatus == Status.FAILED) { throw failedFuture( new RuntimeException("Payment Failed"));
//                    }
//
//                CompletableFuture<Void> orderProcess =
//                        CompletableFuture.runAsync(() -> order.prepareOrder(payResult), backgroundExe);
//
//                CompletableFuture<Void> emailProcess =
//                        CompletableFuture.runAsync(() -> email.sendEmail(payResult), backgroundExe);
//
//
//
//                    return CompletableFuture.allOf(orderProcess, emailProcess).
//                            thenApply( () ->  System.out.println("Okayy");)
//                        .exceptionally(ex -> System.out.println("Error Occurred while processing it" + ex.geMessages());
//                    );
//                }
//
//                static <T> CompletableFuture<T> failedFuture( throwable tw ) {
//                    CompletableFuture<T> future = new CompletableFuture<T>;
//                    return future.completeExceptionally(tw);
//                }
//
//                static class Shutdown {
//                    paymentExe.shutdown();
//                    backgroundExe.shutdown();
//                }
//
//
//        }
//    }
//}