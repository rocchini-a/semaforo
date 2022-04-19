public class Contatore {
    int valore;
    int passo;

    Contatore(int valore, int passo){
this.passo= passo;
this.valore= valore;
System.out.println("\n il contatore è nato e vale " + this.getValore());
    }
void incrementa(){
    valore += passo;
}

void decrementa(){
    valore -= passo;
}

int getValore(){
    return valore;
}
}
