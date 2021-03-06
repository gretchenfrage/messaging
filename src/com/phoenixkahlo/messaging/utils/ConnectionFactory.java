package com.phoenixkahlo.messaging.utils;
import java.net.Socket;

/*
 * Represents something a Waiter can call upon to generate connections when clients are accepted
 */
public interface ConnectionFactory {

	void createConnection(Socket socket);

}
