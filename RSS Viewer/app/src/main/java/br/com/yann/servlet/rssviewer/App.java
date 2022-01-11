/** 
 * Main class of the application
 * @author Yann Gabriel
 * @version 1.00
*/
package br.com.yann.servlet.rssviewer;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


import br.com.yann.servlet.rssviewer.model.Note;

public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        XStream stream = new XStream(new DomDriver());
        // try (FileReader xml = new
        // FileReader("app/src/main/resources/example/note.xml")) {
        // Note note = (Note) stream.fromXML(xml);
        // } catch (IOException e) { e.printStackTrace();
        // }
        //stream.alias("note", Note.class);
        stream.allowTypes(new Class[] {Note.class}); //class allowed to serelize
  
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.w3schools.com/xml/note.xml"))
                .build();
        HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString());
        String xml = send.body();

        Note note = (Note) stream.fromXML(xml);
        System.out.println(note);

    }
}
