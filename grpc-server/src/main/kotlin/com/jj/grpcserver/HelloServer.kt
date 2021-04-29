package com.jj.grpcserver

import com.jj.grpc.HelloRequest
import com.jj.grpc.HelloResponse
import com.jj.grpc.HelloServiceGrpcKt
import io.grpc.Server
import io.grpc.ServerBuilder

class HelloServer(private val port: Int) {

    private val server: Server = ServerBuilder
        .forPort(port)
        .addService(HelloService())
        .build()

    fun start() {
        server.start()
        println("Server is running on port ${port}")
        Runtime.getRuntime().addShutdownHook(
            Thread {
                println("Shutting down gRPC server")
                this@HelloServer.stop()
                println("Server shut down")
            }
        )
    }

    private fun stop() {
        server.shutdown()
    }

    fun blockUntilShutdown() {
        server.awaitTermination()
    }

    private class HelloService: HelloServiceGrpcKt.HelloServiceCoroutineImplBase() {
        override suspend fun sayHello(request: HelloRequest): HelloResponse = HelloResponse
            .newBuilder()
            .setMessage("Hello, ${request.name}")
            .build()
    }
}


