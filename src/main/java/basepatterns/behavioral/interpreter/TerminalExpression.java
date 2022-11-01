package basepatterns.behavioral.interpreter;

public class TerminalExpression implements Expression{

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String string) {
        if(string.contains(data)) {
            return true;
        }
        return false;
    }
}

