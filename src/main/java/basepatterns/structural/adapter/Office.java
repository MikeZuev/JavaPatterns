package basepatterns.structural.adapter;

public class Office {
    public static void main(String[] args) {
        JavaCoder javaCoder = new AdapterCppCoderToJavaCoder();

        javaCoder.writeJavaCode();
    }
}
