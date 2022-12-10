public class Box<T>{
    T returns;

    public static <T> Box method(){
        Box<String> box = new Box<>();
        box.returns = "Generic class and method!";

        return box;
    }

    @Override
    public String toString() {
        return "Box" +
                "returns: " + returns ;
    }
}
