interface DefaultInterface {
    void PrintName();

    default void PrintAge() {
        System.out.print("22");
    }

    static void printAddress() {
        System.out.print("Meno");

    }
}

class DefaultInterfaceImpl implements DefaultInterface {


    public void PrintName() {
          System.out.println("Hello World");
    }

    @Override
    public void PrintAge() {
        DefaultInterface.super.PrintAge();
    }
}