package app;
/*
 * Preguntas
 */
public class Question {
    //Respuestas(Answer)
    //Preguntas(Question)
    String description; //Aca va el nombre de la pregunta
    //String name;
    //Questions
    //int askType; 
    int answerPosition;//Respuesta de a pregunta (en que posicion esta la respuesta
    int complexity; //Nivel de dificultad
    int clasification; //Tipo de pregunta (historia, geografia, biologia
    Answer[] answers = new Answer[4]; 

    
//Aca deben ir las cuatro posibles respuestas


    public String getDescription() {
        return description;
    }

    public int getAnswerPosition() {
        return answerPosition;
    }

    public int getComplexity() {
        return complexity;
    }

    public int getClasification() {
        return clasification;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAnswerPosition(int answerPosition) {
        this.answerPosition = answerPosition;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public void setClasification(int clasification) {
        this.clasification = clasification;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }
}
