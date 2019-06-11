package Quotes;

public class Quote {

    protected String text;
    protected String author;
    protected String[] tags;
    protected String likes;


    public Quote( String  text){
        this.text = text;
        this.author = "Unkown";
        this.tags = new String[] {};
        this.likes = "0 likes";
    }

}
