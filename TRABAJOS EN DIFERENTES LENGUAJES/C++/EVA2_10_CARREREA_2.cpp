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
    bool servicio;
    bool residencias;
    bool materias;
    
    servicio = true;
    residencias = true;
    materias = true;

    if (servicio == true && residencias == true && materias == true) {
        cout << "Te puedes Titular" << endl;
    } else {

        cout << "No te puedes Titular" << endl;
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
