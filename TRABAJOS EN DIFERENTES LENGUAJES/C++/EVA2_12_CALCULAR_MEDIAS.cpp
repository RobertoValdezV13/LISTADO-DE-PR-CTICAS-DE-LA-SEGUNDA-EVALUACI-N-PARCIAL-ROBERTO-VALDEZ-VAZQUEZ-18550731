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
    int suma, total, i;
    
    total = 0;
    for (i = 1; i <= 5; i++) {
        cout << "Ingrese la Edad " << i << endl;
        cin >> suma;
        total = total + suma;
    }
    double media;
    
    media = (double) total / 5;
    cout << "La Suma es " << total << endl;
    cout << "La Media es " << media << endl;
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
