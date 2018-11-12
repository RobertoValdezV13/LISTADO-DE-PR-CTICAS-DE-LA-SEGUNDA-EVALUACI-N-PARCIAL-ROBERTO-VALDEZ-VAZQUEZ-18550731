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
    cout << "¿Que calificación obtuvo en Fundamentos de Programación?" << endl;
    double califa;
    
    cin >> califa;
    cout << "Tu calificación es" << endl;
    cout << califa << endl;
    if (califa>= 70) {
        cout << "Materia aprobada" << endl;
    } else {
        cout << "Materia reprobada" << endl;
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
