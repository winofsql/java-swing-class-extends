
public class MyClass {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MyClass() {
        setTitle("MyClass");
    }
    public MyClass(String v) {
        setTitle(v);
    }

    public static void print(String value) {
        System.out.println(value);
    }

}
