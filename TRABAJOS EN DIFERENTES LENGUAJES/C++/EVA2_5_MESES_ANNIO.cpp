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

    cout << "Introduce un numero de mes" << endl;
    int iNumero;
    
    cin >> iNumero;
    if (iNumero == 12) {
        cout << "Diciembre" << endl;
    } else {
        if (iNumero == 11) {
            cout << "Noviembre" << endl;
        } else {
            if (iNumero == 10) {
                cout << "Octubre" << endl;
            } else {
                if (iNumero == 9) {
                    cout << "Septiembre" << endl;
                } else {
                    if (iNumero == 8) {
                        cout << "Agosto" << endl;
                    } else {
                        if (iNumero == 7) {
                            cout << "Julio" << endl;
                        } else {
                            if (iNumero == 6) {
                                cout << "Junio" << endl;
                            } else {
                                if (iNumero == 5) {
                                    cout << "Mayo" << endl;
                                } else {
                                    if (iNumero == 4) {
                                        cout << "Abril" << endl;
                                    } else {
                                        if (iNumero == 3) {
                                            cout << "Marzo" << endl;
                                        } else {
                                            if (iNumero == 2) {
                                                cout << "Febrero" << endl;
                                            } else {
                                                if (iNumero == 1) {
                                                    cout << "Enero" << endl;
                                                } else {
                                                    if (iNumero > 12) {
                                                        cout << "Numero fuera de rango" << endl;
                                                    } else {
                                                        if (iNumero < 1) {
                                                            cout << "Numero fuera de Rango" << endl;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
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
