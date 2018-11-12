#include <iostream>
#include <sstream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

// Headers
string toString (double);
int toInt (string);
double toDouble (string);

int main() {
    cout << "¿Cual es tu edad?" << endl;
    int iEdad;
    
    cin >> iEdad;
    cout << "¿Tienes tu INE?" << endl;
    bool bINE;
    
    cin >> bINE;
    if (iEdad >= 18 && bINE == true) {
        cout << "Puedes entrar al antro" << endl;
    } else {
        cout << "¡Saquese de aqui!" << endl;
    }
    return 0;
}

// The following implements type conversion functions.
string toString (double value) { //int also
    stringstream temp;
    temp << value;
    return temp.str();
}

int toInt (string text) {
    return atoi(text.c_str());
}

double toDouble (string text) {
    return atof(text.c_str());
}
