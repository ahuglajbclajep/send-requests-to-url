package ahuglajbclajep.simpapp.sendreq;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SendRequests {

    public static void main(String[] args) {
        try {
            URL url = new URL(args[0]);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            System.out.println(connection.getResponseCode() + " " + connection.getResponseMessage());

        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("usage: java AutoAccess <URL>");

        } catch (MalformedURLException e){
            System.err.println("an unknown protocol is found");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}