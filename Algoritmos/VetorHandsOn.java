import java.util.Scanner;
public class VetorHandsOn{
public static void main(String[] args) {
    
    Scanner ls = new Scanner (System.in);
    int escolha, a = 0;
    do {
        System.out.println("Digite 1, 2, 3, 4");
        escolha = ls.nextInt();    
        switch(escolha){

        case 1:
        int[] vetor1 = {3, 5, 4, 2, 2, 5, 3, 2, 5, 9};
int[] vetor2 = {7, 15, 20, 0, 18, 4, 55, 23, 8, 6};

int[] intercalado = new int[20];

int j = 0;
for (int i = 0; i < 10; i++) {
    intercalado[j++] = vetor1[i];
    intercalado[j++] = vetor2[i];
}

for (int i = 0; i < intercalado.length; i++) {
    System.out.print(intercalado[i] + " ");
}
        break;
        
        case 2:
int[] vetor = new int[8];
for (int i = 0; i < vetor.length; i++) {
    System.out.print("Digite um número: ");
    vetor[i] = ls.nextInt();
}

int[] positivos = new int[8];
int[] negativos = new int[8];

int pos = 0;
int neg = 0;

for (int i = 0; i < vetor.length; i++) {
    if (vetor[i] >= 0) {
        positivos[pos++] = vetor[i];
    } else {
        negativos[neg++] = vetor[i];
    }
}

System.out.print("Positivos: ");
for (int i = 0; i < pos; i++) {
    System.out.print(positivos[i] + " ");
}

System.out.print("\nNegativos: ");
for (int i = 0; i < neg; i++) {
    System.out.print(negativos[i] + " ");
}
break;
        case 3:
int[] vetora = new int[10];
for (int i = 0; i < vetora.length; i++) {
    System.out.print("Digite um número: ");
    vetora[i] = ls.nextInt();
}

System.out.println("Números primos e suas posições:");

for (int i = 0; i < vetora.length; i++) {
    int num = vetora[i];
    boolean primo = true;

    if (num <= 1) {
        primo = false;
    } else {
        for (int k = 2; k <= Math.sqrt(num); k++) {
            if (num % k == 0) {
                primo = false;
                break;
            }
        }
    }

    if (primo) {
        System.out.println("Número: " + num + " | Posição: " + i);
    }
}
break;
        case 4:
        int[] numeros = new int[6];
        int somaPares = 0;
int qtdImpares = 0;

// Leitura dos números
for (int i = 0; i < numeros.length; i++) {
    System.out.print("Digite um número: ");
    numeros[i] = ls.nextInt();
}

// Exibindo pares
System.out.print("Números pares: ");
for (int i = 0; i < numeros.length; i++) {
    if (numeros[i] % 2 == 0) {
        System.out.print(numeros[i] + " ");
        somaPares += numeros[i];
    }
}

System.out.println("\nSoma dos pares: " + somaPares);

System.out.print("Números ímpares: ");
for (int i = 0; i < numeros.length; i++) {
    if (numeros[i] % 2 != 0) {
        System.out.print(numeros[i] + " ");
        qtdImpares++;
    }
}

System.out.println("\nQuantidade de ímpares: " + qtdImpares);
break;
        default:
        a++;
        break;
        }
    } while (a == 1);


    ls.close();

}
}