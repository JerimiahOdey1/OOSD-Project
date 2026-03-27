package edu.oosd.restservices.RestApi;

public class Greeting {
    private long id;
    private String content;

    // Constructor
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    // Getter for id
    public long getId() {
        return id;
    }

    // Getter for content
    public String getContent() {
        return content;
    }
}
