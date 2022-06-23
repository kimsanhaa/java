package jsonStudy;

public class json {
    int a;
    int b;

    public json(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {

        return "json{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        json json = new json(1,2);
        String s = json.toString();
        System.out.println(s);
        System.out.println("\\\"");
        System.out.println("\",\"");
        System.out.println();

    }
}
