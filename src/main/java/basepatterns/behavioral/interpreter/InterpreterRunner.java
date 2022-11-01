package basepatterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression mathTeacher = getMathTeacher();
        Expression englishMathTeacher = getEnglishMathTeacher();

        System.out.println("Does teacher know math: " + mathTeacher.interpret("math"));
        System.out.println("Does teacher know math and english: " + englishMathTeacher.interpret("math english"));

    }

    public static Expression getMathTeacher() {
        Expression math = new TerminalExpression("math");
        Expression mathSkills = new TerminalExpression("math skills");

        return new OrExpression(math, mathSkills);

    }

    public static Expression getEnglishMathTeacher() {
        Expression math = new TerminalExpression("math");
        Expression english = new TerminalExpression("english");

        return new AndExpression(math, english);

    }
}
