/*
 Esta clase es la que interactura con la base de datos
 */
package util;
//import org.json
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//import java.io.PrintWriter;
import org.json.*;//  org.json.simple.JSONObject;
public class dataBase {
    public void guardar() throws FileNotFoundException{
        PrintWriter printWriter = new PrintWriter("src/data/biologia.js");
        printWriter.println("Jeffrey David Rios Mora");
        printWriter.close();
//        
    }
    public boolean setQuestion(app.Question p) throws FileNotFoundException{
        JSONObject j = new JSONObject();
        try {
            j.put("description", p.getDescription());
            //j.put("question", "");
            j.put("call_count", "");
            j.put("rating", "");
            this.guardar();
            System.out.println("Finalizado");
//            PrintWriter printWriter = new PrintWriter("data/biologia.js");
//            printWriter.println("Jeffrey David Rios Mora");
//            printWriter.close();            
        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            System.out.println(e1.getMessage());
        }
        System.out.println(j.toString());
        
        return true;
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
