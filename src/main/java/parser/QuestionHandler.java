package parser;

import java.security.NoSuchAlgorithmException;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import question.Cloze;
import question.Description;
import question.MultipleChoice;
import question.Question;
import question.QuestionType;
import question.Quiz;

public class QuestionHandler extends DefaultHandler {

    private Quiz questions;
    private Question currentQuestion;
    private QuestionType qType;
    private StringBuilder element;

    public QuestionHandler() {
        this.questions = new Quiz();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (element == null) {
            element = new StringBuilder();
        } else {
            element.append(ch, start, length);
        }
    }

    @Override
    public void startDocument() throws SAXException {

        super.startDocument();
    }

    @Override
    public void startElement(String uri, String lName, String qName, Attributes attr) throws SAXException {

        switch (XmlTags.valueOf(qName.toUpperCase())) {
            case QUIZ:
                this.questions = new Quiz();

                break;
            case QUESTION:
                String type = attr.getValue("type");
                if (type == null)
                    break;
               
                this.qType =  QuestionType.valueOf(type.toUpperCase());
                switch (this.qType) {
                    case CLOZE:
                        this.currentQuestion = new Cloze(qType);
                        break;
                    case MULTICHOICE:
                        this.currentQuestion = new MultipleChoice(qType);
                        break;
                        case DESCRIPTION:
                        this.currentQuestion = new Description(qType);
                        break;
                }

                break;
            case TEXT:
               
                break;
            case NAME:
                

                break;
            case QUESTIONTEXT:
                

                break;
            case GENERALFEEDBACK:
                

                break;
            case DEFAULTGRADE:
                

                break;
            case PENALTY:
                

                break;
            case HIDDEN:
                

                break;
            case IDNUMBER:
                

                break;
            case TAGS:
              

                break;
            case TAG:
               

                break;
            case SINGLE:
             

                break;
            case SHUFFLEANSWERS:
              

                break;
            case ANSWERNUMBERING:
               

                break;
            case SHOWSTANDARDINSTRUCTION:
             

                break;
            case CORRECTFEEDBACK:
               

                break;
            case PARTIALLYCORRECTFEEDBACK:
                

                break;
            case INCORRECTFEEDBACK:
               

                break;

            default:
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (XmlTags.valueOf(qName.toUpperCase())) {
            case QUIZ:
                this.questions = new Quiz();

                break;
            case QUESTION:
             
                switch (this.qType) {
                    case CLOZE:
                       Cloze cloze = (Cloze) this.currentQuestion;
                       
                        break;
                    case MULTICHOICE:
                        this.currentQuestion = new MultipleChoice(qType);
                        break;
                        case DESCRIPTION:
                        this.currentQuestion = new Description(qType);
                        break;
                }

                break;
            case TEXT:
               
                break;
            case NAME:
                

                break;
            case QUESTIONTEXT:
                

                break;
            case GENERALFEEDBACK:
                

                break;
            case DEFAULTGRADE:
                

                break;
            case PENALTY:
                

                break;
            case HIDDEN:
                

                break;
            case IDNUMBER:
                

                break;
            case TAGS:
              

                break;
            case TAG:
               

                break;
            case SINGLE:
             

                break;
            case SHUFFLEANSWERS:
              

                break;
            case ANSWERNUMBERING:
               

                break;
            case SHOWSTANDARDINSTRUCTION:
             

                break;
            case CORRECTFEEDBACK:
               

                break;
            case PARTIALLYCORRECTFEEDBACK:
                

                break;
            case INCORRECTFEEDBACK:
               

                break;

            default:
                break;
        }
    }

    @Override
    public void endDocument() throws SAXException {
        // TODO Auto-generated method stub
        super.endDocument();
    }
}
