package com.aggregatorservice.service;

import com.proto.generated.CalculatorServiceGrpc;
import com.proto.generated.Input;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class AggregatorService {

    @GrpcClient("calculator-service")
    private CalculatorServiceGrpc.CalculatorServiceBlockingStub blockingStub;

    public Flux<Long> getAllDoubles(final int number){
        //  build input object
        Input input = Input.newBuilder()
                .setNumber(number)
                .build();

        return Flux.create(fluxSink -> {
            this.blockingStub.getAllDoubles(input)
                    .forEachRemaining(output -> fluxSink.next(output.getResult()));
            fluxSink.complete();
        });
    }
}
