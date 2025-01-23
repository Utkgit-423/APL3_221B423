class Two extends One {
    Two(int x) {
        super(x); // Call the constructor of the superclass
        System.out.println("Two's constructor with value: " + x);
    }
}


// If you don't call super(x) in the Two class, 
// it will throw a compilation error because the One class does not have a default constructor.