package rmi.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.rmi.*;
import javax.naming.*;

@SpringBootApplication
public class Server {

	public static void main(String[] args) throws RemoteException, NamingException
	{
		System.out.println("Constructing server implementation...");
		OrderShipperImpl orderShipper = new OrderShipperImpl();

		System.out.println("Binding server implementation to registry...");
		Context namingContext = new InitialContext();
		namingContext.rebind("rmi:order_shipper", orderShipper);

		System.out.println("Waiting for invocations from clients...");
	}

}
