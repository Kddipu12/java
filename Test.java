

class Test{
public void finalize(){
System.out.println("Object Memory is released");
}
public static void main(String args[]){
Test t = new Test(); t = null; System.gc();
} 
}