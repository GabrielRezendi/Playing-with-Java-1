/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package br.com.yann.servlet.rssreader;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.yann.servlet.rssreader.model.Note;

public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        XStream stream = new XStream(new DomDriver());

        stream.alias("note", Note.class);
        stream.allowTypes(new Class[] { Note.class });
        String url = "https://www.w3schools.com/xml/note.xml";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString());
        String xml = send.body();

        Note note = (Note) stream.fromXML(xml);
        System.out.println(note);

    }
}