package br.com.yann.servlet.rssreader.model;

public class Note {

  private String to;
  private String from;
  private String heading;
  private String body;

  public String getTo() {
    return this.to;
  }

  public void setTo(String to) {
    this.to = to;
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

  @Override
  public String toString() {
    return "{" +
        " to='" + getTo() + "'" +
        ", from='" + getFrom() + "'" +
        ", heading='" + getHeading() + "'" +
        ", body='" + getBody() + "'" +
        "}";
  }

}
