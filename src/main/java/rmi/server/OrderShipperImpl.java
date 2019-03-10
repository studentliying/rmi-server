package rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OrderShipperImpl extends UnicastRemoteObject implements OrderShipper
{
   public OrderShipperImpl() throws RemoteException {}

   public String shipOrder(RmiOrder order)
   {     
      return "Processing";
   }
    
}
 