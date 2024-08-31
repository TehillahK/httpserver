
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
      final ServerSocket server = new ServerSocket(8080);  
      System.out.println("listening on port 8080");
      while(true){
        try(Socket client = server.accept()){
            Date today = new Date();
            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n Hello World" ;
            client.getOutputStream()
                      .write(httpResponse.getBytes("UTF-8"));

        }
       
       
      

      }
      //server.close();
    }
    
}