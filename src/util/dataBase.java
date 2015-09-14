/*
 Esta clase es la que interactura con la base de datos
 */
package util;
//import org.json
import org.json.*;//  org.json.simple.JSONObject;
public class dataBase {
    public void setPregunta(app.Question p) {
        JSONObject j = new JSONObject();
        try {
            j.put("description", "");
            j.put("question", "");
            j.put("call_count", "");
            j.put("rating", "");
        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
//        JSONObject json = new JSONObject();
//        try {
//            json.put("email", "a@b.com");
//            json.put("user_post_records", json);
//
//        } catch (JSONException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
    }

    public void setTipoPregunta() {

    }
}
