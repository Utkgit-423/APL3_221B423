// Main class to test polymorphism
class Main {
    public static void main(String[] args) {
        Mother m1 = new Child();  // Polymorphism
        m1.show();  // show() of Child is called
    }
}