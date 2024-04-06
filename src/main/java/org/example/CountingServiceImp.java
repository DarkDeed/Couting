package org.example;

import com.example.Counting;
import com.example.countingGrpc;
import io.grpc.stub.StreamObserver;

public class CountingServiceImp extends countingGrpc.countingImplBase
{
    //Getting sendNumbers request
    @Override
    public void countingNumbers(Counting.sendNumbers request, StreamObserver<Counting.responseNumber> responseObserver) {
        //Running for loop with start/end numbers
        for (int f = request.getFirstValue(); f <= request.getLastValue(); f++)
        {
            //building response
            Counting.responseNumber response = Counting.responseNumber.newBuilder().setResponseValue(f).build();
            responseObserver.onNext(response);
            //waiting 2 sec
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
        responseObserver.onCompleted();
    }
}
