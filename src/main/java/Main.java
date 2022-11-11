import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import parser.QuestionHandler;

public class Main {

  public static void main(String[] args)
      throws ParserConfigurationException, SAXException, IOException {


    SAXParserFactory factory = SAXParserFactory.newInstance();
    SAXParser saxParser = factory.newSAXParser();
    QuestionHandler questionHandler = new QuestionHandler();
    saxParser.parse("questions.xml", questionHandler);

 
  }
}
