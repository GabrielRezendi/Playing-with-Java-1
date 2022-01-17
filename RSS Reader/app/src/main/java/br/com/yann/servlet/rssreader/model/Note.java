package br.com.yann.servlet.rssreader.model;

public class Note {
<<<<<<< HEAD

  //private String to;
=======
  
  private String to;
>>>>>>> 26b0477deae8ae2dee3513e49bc2c1ab6ce57965
  private String from;
  private String heading;
  private String body;
  private String outro;

  // public String getTo() {
  //   return this.to;
  // }

  // public void setTo(String to) {
  //   this.to = to;
  // }

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
     //   " to='" + this.to + "'" +
        ", from='" + this.from + "'" +
        ", heading='" + this.heading+ "'" +
        ", body='" + this.body + "'" +
        ", outro = "+this.outro+"'"+
        "}";
  }

}
