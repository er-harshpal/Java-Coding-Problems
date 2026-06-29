package InterfaceUsage;

interface interf {
    public static void m1(){
        System.out.println("m1");
    };
}
class Test implements interf{
    public static void main(){
        interf.m1();
    }
}

















//        interface child extends interf {
//          public static void main(String args[]){
//              interf i = new interf(){
//                public void add(int a, int b){}
//              };
//              i.add(10,30);
//          }
//        }