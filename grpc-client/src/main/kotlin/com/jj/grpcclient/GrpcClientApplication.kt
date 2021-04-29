package com.jj.grpcclient

import io.grpc.ManagedChannelBuilder
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrpcClientApplication

suspend fun main(args: Array<String>) {
	runApplication<GrpcClientApplication>(*args)

	val channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build()
	val client = HelloClient(channel)
	client.sayHello("Josimar")
}

