// to run:  javac PassByValue.java && java PassByValue
class PassByValue{
    public static void main(String[] args){
        emp a=new emp("a");
        emp b=new emp("b");
        foo(a,b);
        System.out.println(a);
        System.out.println(b);
    }

private static void foo(emp a,emp b){
    a.setName("1");
    b=new emp("2");
}

}

class emp{
    String name;
    public emp(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
}