package com.jj.grpcclient
import com.jj.grpc.HelloRequest
import com.jj.grpc.HelloServiceGrpcKt
import io.grpc.ManagedChannel
import java.io.Closeable
import java.util.concurrent.TimeUnit

class HelloClient(private val channel: ManagedChannel): Closeable {

    private val stub: HelloServiceGrpcKt.HelloServiceCoroutineStub =
        HelloServiceGrpcKt.HelloServiceCoroutineStub(channel)

    suspend fun sayHello(name: String) {
        val request = HelloRequest.newBuilder().setName(name).build()
        val response = stub.sayHello(request)
        println("Message: ${response.message}")
    }

    override fun close() {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS)
    }
}