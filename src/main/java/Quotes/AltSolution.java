package Quotes;
import com.google.gson.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AltSolution {

    //field
    private int size;
    private List<String> attributes = null;
    private List<JsonObject> quoteList = new ArrayList<JsonObject>();
    //field's setter getter
    public int getSize() {
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public List<JsonObject> getQuoteList(){
        return this.quoteList;
    }
    //constructor which accepts file path as parameter
    AltSolution(){
        String[] att = new String[]{"tags","author","likes","text"};
        attributes = Arrays.asList(att);
    }
    AltSolution(String path){
        this.setSize(0);
        printJA(jsonFileToJsonArray(path));
        String[] att = new String[]{"tags","author","likes","text"};
        attributes = Arrays.asList(att);
    }
    //converts file to Json Array call private fn
    public JsonArray jsonFileToJsonArray(String path){
        try{
            return convert(path);
        }
        catch (Exception ex){
            System.out.println(ex.toString());
        }
        return null;
    }
    //does the conversion
    private JsonArray convert(String path) throws FileNotFoundException {
        try{
            return new Gson().fromJson(new FileReader(path),JsonArray.class);
        }
        catch (Exception ex){
            throw new FileNotFoundException();
        }
    }
    //prints all the things in Json File call print JA ; to make it work uncomment sout
    public void printJsonArray(JsonArray jsonArray){
        if(jsonArray == null){

        }
        else{
            printJA(jsonArray);
        }
    }
    //O(n*n) to make it work uncomment sout
    public void printJA(JsonArray objectArray){
        //each item in array is an object
        for(Object item: objectArray){
            //convert item to Json Object such that we can use .get()
            JsonObject jObj = (JsonObject) item;
            this.quoteList.add(jObj);
            JsonObject jsonObject = new JsonObject();
            //tags is an array
            JsonArray tags = (JsonArray) jObj.get("tags");
            //each tag itself is an object
            for(Object tag : tags){
                //System.out.println("Tag: " + tag.toString());
            }
            //System.out.println("Author: "+ jObj.get("author"));
            //System.out.println("Likes: " + jObj.get("likes"));
            //System.out.println("Text: " + jObj.get("text"));
            this.size++;
        }
    }
    //get tag/author/text/likes at given index
    public String getValue(String attribute, int index){
        if(index <0){
            throw new InvalidParameterException("Index can't be lower can zero");
        }
        else if(attribute==""){
            throw new InvalidParameterException("Attribute can't be empty");
        }
        else if(!this.attributes.contains(attribute)){
            throw new InvalidParameterException("Attribute can't only be \"tags\",\"author\",\"likes\",\"text\"");
        }
        else{
            return getValuesAtIndex(attribute,index);
        }
    }
    //get tag/author/text/likes at given index
    private String getValuesAtIndex(String attribute ,int index) {
        return getQuoteList().get(index).get(attribute).toString();
    }
}
