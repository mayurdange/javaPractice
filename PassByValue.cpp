#include <iostream>
using namespace std;
//g++ PassByValue.cpp && ./a.out

class emp{
    public:
    char name;
    emp(char nameParam){
        name=nameParam;
    }
    void setName(char nameParam){
        name=nameParam;
    }
    char toString(){
        return name;
    }
};

void foo(emp a,emp b){
    a.setName('1');
    b= emp('2');
}

void fooRef(emp &a,emp &b){
    a.setName('1');
    b= emp('2');
}

int main()
{
    emp a('a');
    emp b('b');
    foo(a,b);
    cout << "after passbyVal a = " << a.toString() << " b = " << b.toString() << "\n";
    fooRef(a,b);
    cout << "after passByRef a = " << a.toString() << " b = " << b.toString() << "\n";
}