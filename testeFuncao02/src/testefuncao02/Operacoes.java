
package testefuncao02;

public class Operacoes {

    public static Integer contador(int i, int f){
        int s = 0;
        for(int c = i; c<=f; c++) {
            s += c;
        }
        return s;
    }
}
