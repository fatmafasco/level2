package reader;

import com.google.gson.Gson;
import data.DataModel;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReaderDataFromJson {
    public DataModel raedJsonFile() throws FileNotFoundException {
        FileReader fileReader= new FileReader("data/testData.json");
        DataModel dataModel=new Gson().fromJson(fileReader,DataModel.class);
        return dataModel;
}}
