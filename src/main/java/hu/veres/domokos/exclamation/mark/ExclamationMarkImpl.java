package hu.veres.domokos.exclamation.mark;

import io.grpc.stub.StreamObserver;

public class ExclamationMarkImpl extends ExclamationMarkServiceGrpc.ExclamationMarkServiceImplBase {
    @Override
    public void getExclamationMark(ExclamationMark.MessageRequest request, StreamObserver<ExclamationMark.MessageResponse> responseObserver) {
        System.out.println("GOT CALLED!!!");
        ExclamationMark.MessageResponse messageResponse = ExclamationMark.MessageResponse.newBuilder().setMessage("!").build();
        responseObserver.onNext(messageResponse);
        responseObserver.onCompleted();
    }
}
