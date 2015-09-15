package quienquieresermillonario;
//package util;

import app.Question;
import java.io.FileNotFoundException;
import util.dataBase;



public class start {
    public static void main(String[] args) throws FileNotFoundException{
        dataBase db = new dataBase();
        Question q = new Question();
        q.setDescription("En que año murio Jhon Lennon");
        db.setQuestion(q);
        //System.out.println("data");
    }
    
}
