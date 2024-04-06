package org.example;

import com.example.Counting;
import com.example.countingGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client
{
// Create two variables not limited to class
private static int currentValue = 0;
private static int recivVal = 0;
//Main client side of the programm
    private static void recVal()
    {
        //Send message to localhost. Use .plaintext to avoid need for certificate
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8080).usePlaintext().build();
        //Creating blocking stub for sync connection
        countingGrpc.countingBlockingStub stub = countingGrpc.newBlockingStub(channel);
        //build request to server, send values 1 and 30
        Counting.sendNumbers request = Counting.sendNumbers.newBuilder().setFirstValue(1).setLastValue(30).build();
        //get streaming responses via iterator
        Iterator<Counting.responseNumber> response = stub.countingNumbers(request);
        //output responses to console
        while (response.hasNext()) {
            recivVal = response.next().getResponseValue();
            System.out.println("server="+recivVal);
        }
    }
    private static void count()
    {
        //counter from 0 to 50
        for (int timer = 0; timer <= 50; timer++)
        {
            //show timer
            System.out.println("timer="+timer);
            //pass 1 sec
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //calc current value and output it
            currentValue = currentValue + recivVal +1;
            recivVal = 0;
            System.out.println("currentValue="+currentValue);
        }
    }
    public static void main(String[] args)
        {
            //use parallel processing for async job

            ExecutorService executor;
            executor = Executors.newFixedThreadPool(/* nThreads= */ 3);
            CompletableFuture<Void> recivedNumbers = CompletableFuture.runAsync(client::recVal,executor);
            CompletableFuture<Void> counting = CompletableFuture.runAsync(client::count,executor);

        }

}
