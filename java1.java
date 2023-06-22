import java.util.HashMap;
import java.util.Map;

public class java1 {
    public static void main(String[] args) {
        String json = "{\"name\":\"Ivanov\",\"country\":\"Russia\",\"city\":\"Moscow\",\"age\":\"null\"}";
        System.out.println(getWhere(json));
    }

    public static String getWhere(String json) {

        String[] values = json.split("[^a-zA-Z0-9]+");    
        Map<String, String> map = new HashMap<String,String>();
        for (int i = 1; i <= values.length-1; i+=2) {
            map.put(values[i], values[i+1]);
        }

        StringBuilder where = new StringBuilder();
        where.append("WHERE ");

        for (Map.Entry<String,String> pairs : map.entrySet()) {

            if (pairs.getValue().equals("null") != true) 
            {
                where.append(pairs.getKey() + " == " + "\"" + pairs.getValue() + "\"" + " and ");
            }
        }

        where.delete(where.length()-5, where.length());
        return where.toString();
    }
}
