package br.com.yann.servlet.rssreader.model;

public class Note {
  private String To;
  private String from;
  private String heading;
  private String body;

  public String getTo() {
    return this.To;
  }

  public void setTo(String To) {
    this.To = To;
  }

  public String getFrom() {
    return this.from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getHeading() {
    return this.heading;
  }

  public void setHeading(String heading) {
    this.heading = heading;
  }

  public String getBody() {
    return this.body;
  }

  public void setBody(String body) {
    this.body = body;
  }
  
}
