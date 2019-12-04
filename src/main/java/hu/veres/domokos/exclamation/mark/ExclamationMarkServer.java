package hu.veres.domokos.exclamation.mark;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ExclamationMarkServer {
    public void start() throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new ExclamationMarkImpl())
                .build()
                .start();
        System.out.println("STARTED SERVER");
        server.awaitTermination();
    }
}
