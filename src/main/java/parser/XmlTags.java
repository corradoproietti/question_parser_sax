package parser;

public enum XmlTags {
    QUIZ("quiz"),
    QUESTION("question"),
    NAME("name"),
    ANSWER("answer"),
    FEEDBACK("feedback"),
    QUESTIONTEXT("questiontext"),
    TEXT("text"),
    GENERALFEEDBACK("generalfeedback"),
    DEFAULTGRADE("defaultgrade"),
    PENALTY("penalty"),
    HIDDEN("hidden"),
    IDNUMBER("idnumber"),
    TAGS("tags"),
    TAG("tag"),
    SINGLE("single"),
    SHUFFLEANSWERS("shuffleanswers"),
    ANSWERNUMBERING("answernumbering"),
    SHOWSTANDARDINSTRUCTION("showstandardinstruction"),
    CORRECTFEEDBACK("correctfeedback"),
    PARTIALLYCORRECTFEEDBACK("partiallycorrectfeedback"),
    INCORRECTFEEDBACK("incorrectfeedback");

    private final String xmlTag;

    private XmlTags(String tag) {
        this.xmlTag = tag;
    }

    @Override
    public String toString() {

        return this.xmlTag;
    }
}
