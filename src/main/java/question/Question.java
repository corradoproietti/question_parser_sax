package question;

public abstract class Question {
    private String id;
    private QuestionType questionType;


public Question(QuestionType type){
    this.questionType = type;
}

public String getId(){
    return this.id;
}
    
}
