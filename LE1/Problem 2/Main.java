// Main class to test method overriding
class Main {
    public static void main(String args[]) {
        // Creating an object of the Mother class
        Mother m = new Mother();
        m.show(); // This will call the show() method from the Mother class

        // Creating an object of the Child class
        Child ch = new Child();
        ch.show(); // This will call the overridden show() method from the Child class

        // Creating a Mother reference pointing to a Child object
        Mother m2 = new Child();
        m2.show(); // This will call the overridden show() method from the Child class due to dynamic method dispatch
    }
}