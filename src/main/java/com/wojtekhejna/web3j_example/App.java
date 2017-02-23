package com.wojtekhejna.web3j_example;

import java.util.concurrent.ExecutionException;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

public class App {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("Hello World!");

		Web3j web3 = Web3j.build(new HttpService());

		Web3ClientVersion clientVersion = web3.web3ClientVersion().sendAsync().get();

		if (!clientVersion.hasError()) {
			System.out.println("Client is running version: " + clientVersion.getWeb3ClientVersion());
		}
	}

}
