import org.json.*;

public class JSONToXML {
    public static void main(String[] args) throws JSONException {
        String json = "[{\"Element\":{\"id\":1,\"type\":\"text\",\"name\":\"First Name\"}},{\"Element\":{\"id\":2,\"type\":\"text\",\"name\":\"Last Name\"}},{\"Element\":{\"id\":3,\"type\":\"text\",\"name\":\"Age\"}},{\"Element\":{\"id\":4,\"type\":\"text\",\"name\":\"Degree\"}},{\"Element\":{\"id\":5,\"type\":\"text\",\"name\":\"Address\"}},{\"Element\":{\"id\":6,\"type\":\"text\",\"name\":\"Father's Name\"}}]";
        //Convert JSON to XML
        String xml = convert(json, "root"); // This method converts json object to xml string
        System.out.println(xml);
    }

    public static String convert(String json, String root) throws JSONException {
        //JSONObject jsonObject = new JSONObject(json);
        String xml = "<?xml version=\"1.0\" encoding=\" ISO-8859-15\"?>\n<" + root + ">" ;
        JSONArray jsonarray = new JSONArray(json);
        for (int i = 0; i < jsonarray.length(); i++) {
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            xml += org.json.XML.toString(jsonobject);
        }
        xml += "</" + root + ">";
        return xml;
    }
}
