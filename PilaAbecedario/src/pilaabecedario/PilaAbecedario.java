package pilaabecedario;
import java.util.Scanner;
public class PilaAbecedario {


    public static void main(String[] args) {
//leer la informacion desde el teclado con el objeto "ob"
Scanner ob=new Scanner(System.in);
/*Declarar variables "tope"(tope que se inicializa en 0),"tam"(tamaño del vector),
 "opt"(para saber la opcion que ingresa el usuario)*/
int opt;//variable opcion
//inicializar varibale tope en 0(cero)
char tope=0; 
//vector 
char pila[]=new char[27];
//el "do" sirve como un cliclo de repetición crea un menu 
do
{
    System.out.println("\n1. - Agregar \n"
    +"2. - Llenar\n"
    +"3. - Mostrar\n"
    +"4. - Eliminar\n"
    +"9. - Salir\n");
    switch(opt=ob.nextInt()){
        //agregar
        case 1:
            if(tope<=27){
            System.out.println("Ingrese dato:");
            //El dato se guarda en la posicion de la varible tope, en la primera iteracion seria 0(cero)         

            pila[tope]=ob.next().charAt(0);
  //Aumentamos una unidad a tope para guardar el siguiente valor en la siguiente posicion         
  tope++;
            }
            //nos indicara con el mansaje "pila llena"
         else{
             System.out.println("-----Pila llena-----");
         }
            break;
            //Llenar 
        case 2:
            for (char i='a'; i<='z'; i++){
                
                System.out.print(" "+i);
            }
            break;
            //Mostrar
        case 3:
            if(tope>0){
                System.out.println("Los elementos de la pila son:");
                /*Iniciamos con "tope-1", por que el vector inicia en la posicion 0(cero)
                 si no lo hacesmos estaremos mostrando una posición vacia o que no existe    
                 */
                for (int i=tope-1; i>=0; i--){
                    System.out.print(" "+pila[i]);
                }
            }
            else {
                        System.out.println(".....Pila Vacia......");
                    }
            break;
            //Eliminar
        case 4:
             if (tope != 0) {
                        /*tope nos indica  la posicion en la que vamos a guardar un valor
                         por eso le restamos una unidad para sobre escribir un dato            
                         */
                        System.out.println("Eliminando el ultimo valor");
                        tope--;
                    } else {
                        System.out.println("No hay elementos a eliminar...");
                    }
            break;            
    }
}

while(opt !=5);
        }
    
}
