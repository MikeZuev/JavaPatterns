package basepatterns.structural.adapter;

public class AdapterCppCoderToJavaCoder extends CppCoder implements JavaCoder{
    @Override
    public void writeJavaCode() {
        writeCppCode();
    }
}
