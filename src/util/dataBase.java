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
            j.put("nombre", "531328f8616c69133a350000");
            j.put("pregunta", "1");
            j.put("call_count", "0");
            j.put("rating", "3");
        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        JSONObject json = new JSONObject();
        try {
            json.put("email", "a@b.com");
            json.put("user_post_records", json);

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void setTipoPregunta() {

    }
}
