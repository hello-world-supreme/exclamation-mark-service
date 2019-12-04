package hu.veres.domokos.exclamation.mark;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ExclamationMarkClient {
    private final ExclamationMarkServiceGrpc.ExclamationMarkServiceBlockingStub exclamationMarkServiceBlockingStub;

    public ExclamationMarkClient() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
        exclamationMarkServiceBlockingStub = ExclamationMarkServiceGrpc.newBlockingStub(channel);
    }

    public ExclamationMark.MessageResponse getExclamationMark(){
        return exclamationMarkServiceBlockingStub.getExclamationMark(ExclamationMark.MessageRequest.newBuilder().build());
    }
}
