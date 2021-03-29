package Service;

import org.json.*;

import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;

public class JSONToXML {

    public static Boolean convert(String json, String root) throws JSONException, IOException {
        //JSONObject jsonObject = new JSONObject(json);
        String xml = "<?xml version=\"1.0\" encoding=\" ISO-8859-15\"?>\n<" + root + ">" ;
        JSONArray jsonarray = new JSONArray(json);
        for (int i = 0; i < jsonarray.length(); i++) {
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            xml += org.json.XML.toString(jsonobject);
        }
        xml += "</" + root + ">";
        FileWriter  fileWriter = new FileWriter("Admission.xml");
        fileWriter.write(xml);
        System.out.println(xml);
        if(xml.length()!=0){
            return true;
        }
        else{
            return false;
        }
    }
}
