package InterfaceUsage;

interface interfaceImplementation {
    void addition(int a, int b);
}

class Imple implements interfaceImplementation{
    public void addition(int a, int b) {
        System.out.println("addition :"+ a + b);
    }
}



