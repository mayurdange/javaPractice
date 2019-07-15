// to run:  javac PassByValue.java && java PassByValue
class PassByValue{
    public static void main(String[] args){
        emp a=new emp("a");
        emp b=new emp("b");
        foo(a,b);
        System.out.println(a);
        System.out.println(b);

        char ac='a';
        char bc='b';
        bar(ac,bc);
        System.out.println(ac);
        System.out.println(bc);

    }

    private static void foo(emp a,emp b){
        a.setName("1");
        b=new emp("2");
        System.out.println("This is inside foo method "+b);
    }

    private static void bar(char a,char b){
        a = 'q';
        b = 'e';
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