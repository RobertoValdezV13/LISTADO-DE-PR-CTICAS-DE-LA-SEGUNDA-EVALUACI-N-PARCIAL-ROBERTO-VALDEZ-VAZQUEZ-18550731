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
    int iAnnio;
    
    iAnnio = 1996;

    int iResi4;
    
    iResi4 = iAnnio % 4;

    int iResi100;
    
    iResi100 = iAnnio % 100;

    int iResi400;
    
    iResi400 = iAnnio % 400;

    if (iResi4 == 0 && (!(iResi100 == 0) && iResi400 == 0)) {
        cout << "Año Bisiesto" << endl;
    } else {
        cout << "Año No Bisiesto" << endl;
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
