package Mindful.Quote.Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import Mindful.Quote.Data.Interfaces.IDataManager;
import Mindful.Quote.Model.Quote;

public class JsonManager implements IDataManager{

    Gson gson = new Gson();
    String content;

    public JsonManager() throws IOException {
      //  content = Files.readString(FileSystems.getDefault().getPath("\\app\\src\\main\\java\\Mindful\\Quote\\DB\\db.json"), StandardCharsets.US_ASCII);
      content = Files.readString(Paths.get("app/src/main/java/Mindful/Quote/DB/db.json"));
       
    }
    public List<Quote> getQuotes() {
       return gson.fromJson(content, new TypeToken<List<Quote>>(){}.getType());
    } 

    @Override
    public List<Quote>setQuotes(String quote) { 
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getTotal() {
        return getQuotes().size();
    }
   
}

