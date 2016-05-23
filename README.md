# c_squared
A scripting-like programming language with the power of C++ and the ease of use of a language like Python! Perfect if you 
just want to bang out some quick code or test scripts with compatibility with any of your existing C++ code. Any valid C++ 
is valid C^2!

Projected example code would look like this:

```
def factorial(n):
  if (n equals 1):
    return 1
  return n * factorial(n-1)

def N = 5  
print factorial(N)

>> 120
```

However, the following would be both C++ compliant as well as C^2 compliant:

```c++
#include <iostream>

int factorial(int n) {
  if (n == 1) {
    return 1;
  }
  return n * factorial(n-1);
}

int main() {
  int N = 5;
  cout << factorial(N) << endl;
  return 0;
}

>> 120
```

Note: Still very much in early stages, and do keep in mind that this is a summer project for a learning CS student!
Constructive criticism and advice would be very much appreciated!
