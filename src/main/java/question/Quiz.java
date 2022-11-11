package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import question.exceptions.QuestionNotFoundException;

public class Quiz {

    private Map<String, Question> questions;

    public Quiz() {
        this.questions = new HashMap<>();

    }

    public void addQuestion(Question q) {
        this.questions.put(q.getId(), q);
    }

    public Question getQuestionWithId(String id) throws QuestionNotFoundException {

        return this.questions.get(id);
    }
}
