package hotel.websocket;

import java.io.IOException;
import java.util.ArrayList;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/socket")
public class AppServlet {

    // array of connecting clients
    private static ArrayList<Session> sessionList = new ArrayList<Session>();

    @OnOpen
    public void onOpen(Session session){
        // when new client connect: it will fire
        try{
            //send to all clients
            try{
                for(Session s : sessionList){
                    s.getBasicRemote().sendText("New user("+sessionList.size()+")");
                }
            }catch(IOException e){
                e.printStackTrace();
            }

            // add this client to array
            sessionList.add(session);
            session.getBasicRemote().sendText("Welcome to hotel socket!");

        }catch(IOException e){

        }
    }

    @OnClose
    public void onClose(Session session){
        // remove client from the list
        sessionList.remove(session);
    }

    @OnMessage
    public void onMessage(String msg){
        // when client send to server
        System.out.println("Message from client: " + msg);
        try{
            for(Session session : sessionList){
                session.getBasicRemote().sendText(msg);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
