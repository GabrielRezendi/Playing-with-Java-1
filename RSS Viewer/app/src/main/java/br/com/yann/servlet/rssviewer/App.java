/** 
 * Main class of the application
 * @author Yann Gabriel
 * @version 1.00
*/
package br.com.yann.servlet.rssviewer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.yann.servlet.rssviewer.model.Note;

public class App {
   
    public static void main(String[] args) {
        XStream stream = new XStream(new DomDriver());
        String Xml = "ttps://www.w3schools.com/xml/note.xml";
        stream.alias("note", Note.class);
        Note note = (Note) stream.fromXML(Xml);

        System.out.println(note);

        
    }
}
