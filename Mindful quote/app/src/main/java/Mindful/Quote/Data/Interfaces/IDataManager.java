package Mindful.Quote.Data.Interfaces;

import java.util.List;

import Mindful.Quote.Model.Quote;

public interface IDataManager {
        List<Quote> getQuotes ();
        List<Quote> setQuotes (String quote);
        int getTotal ();      
}
