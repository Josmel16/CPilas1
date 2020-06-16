
package CPila;

import java.util.Scanner;

public class CPila {
    
    static Scanner teclado = new Scanner(System.in);
    int tope;
    int[]pila;
    int max;
    
    public CPila(){
    
        this.tope=0;
        this.max=100;
        this.pila = new int[this.max+1];
        
}
    public CPila(int Max){
        this.tope=0;
        this.max=Max;
        this.pila= new int[this.max+1];
        
    }
    
    public int getTope(){
        return tope;
    }
    
    public void vaciarPila(){
        this.tope=0;
    }
    
    public boolean IsPilaLlena(){
        if(this.max==this.tope){
            return true;
        }else{
            return false;
        }
       
    }
    
    public boolean IsPilaVacia(){
        if (this.tope==0) {
            return true;
        } else {
            return false;
        }
       
    }
    
    public void InsertarPila(){
        if (this.IsPilaLlena()) {
            System.out.println("La pila esta llena: ");
            
        } else {
            int item;
            System.out.println("Inserte el elemento a ingresar: ");
            item=teclado.nextInt();
            this.pila[this.tope]=item;
            this.tope++;
            System.out.println("El item: "+item+"Se inserto la pila: \n");
        }
    }
    
    public void EliminarPila(){
        if (this.IsPilaVacia()) {
            System.out.println("La Pila esta vacia");
        } else {
            int item=this.pila[this.tope-1];
            this.tope--;
            System.out.println("el item: "+item+" Se elimino de la Pila\n");
        }
    }
    
    public void mostrarPila(){
        if (this.IsPilaVacia()) {
            System.out.println("La pila esta vacia mo hay datos que mostrar: ");
        } else {
            System.out.println("\tElementos de la pila: ");
            System.out.println("========================");
            for (int i = 0; i < this.tope; i++) {
                System.out.println(this.pila[i]+"<--");
                
            }
        }
    }
    
    public void PilaVacia(){
        if (this.IsPilaVacia()) {
            System.out.println("La Pila esta vacia");
        }else{
            System.out.println("La pila esta vacia...");
        }
    }
    
    
    public void PilaLlena(){
        if (this.IsPilaLlena()) {
            System.out.println("La Pila esta con elementos");
        }else{
            System.out.println("La pila esta vacia...");
        }
    }
    
    public void cimaPila(){
        int max = 0;
        
            for (int i = 0; i <this.tope; i++) {
                max=this.pila[i];
            }
            System.out.println("La sima de la pila es : "+max);
        
    }
    
    public void Tamañopila(){
        int tam=0;
        for (int i = 0; i <this.tope; i++) {
            tam=this.tope;
        }
        System.out.println("El tamaño de la de la pila es : "+tam);
    }
}
