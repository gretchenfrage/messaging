package com.phoenixkahlo.messaging.server;

/*
 * Continuously makes sure all the clients are still connected by sending them empty messages
 * These messages will be rejected on the client end for being empty
 */
public class HeartBeat extends Thread {

	private Server server;
	
	public HeartBeat(Server server) {
		this.server = server;
		setPriority(MAX_PRIORITY);
	}
	
	@Override
	public void run() {
		while (true) {
			server.sendMessage("");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
