package Capitulo2;

class RelLogOps {

    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;

        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("Não será executado");
        if(i >= j) System.out.println("Não será executado");
        if( i > j) System.out.println("Não será executado");

        b1 = true;
        b2 = false;

        if(b1 & b2) System.out.println("Não será executado");
        if(!(b1 & b2)) System.out.println("!(b1 & b2)");
        if(b1 | b2) System.out.println("b1 | b2 é verdadeiro");
        if(b1 ^ b2) System.out.println("b1 ^ b2 é verdadeiro");
    }
}