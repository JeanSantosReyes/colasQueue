
package queuex;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author JEAN SANTOS
 */

public class QueueX {

    private String n;
    private Scanner teclado;
    private Queue cola;
    private String valorBuscado;

                public  QueueX() {
                this.cola = new LinkedList();
                }
         
                                    //METODO PARA INSERTAR EN QUEUE
                                    public void insertarQueue(){
                                    teclado = new Scanner(System.in);
                                    System.out.println("Ingrese dato:");
                                    n=teclado.next();
                                    this.cola.add(n); 
                                    }


                                    //METODO PARA ELIMINAR CABEZERA EN QUEUE
                                    public void eliminarQueue(){
                                    if (cola.isEmpty()){
                                    System.out.println("LA COLA ESTA VACIA");
                                    }else{
                                    this.cola.poll();
                                    System.out.println("SE HA ELIMINADO LA CABEZERA DEL QUEUE");
                                    }
                                    }


                                    //METODO PARA IMPRIMIR TODA LA COLA QUEUE
                                    public void imprimirQueue(){
                                    this.cola.peek();
                                    System.out.println("El elemento de la cabezera del QUEUE es:"+cola);
                                    }


                                    //METODO PARA IMPRIMIR CABEZERA QUEUE
                                    public void imprimirCabezeraQueue(){
                                    this.cola.peek();
                                    System.out.println("El elemento de la cabezera del QUEUE es:"+cola.peek());
                                    }


                                    //METODO PARA MOSTRAR TOTAL # ELEMENTOS
                                    public void numeroElementQueue(){
                                    System.out.println("El numero de datos en la cola es:"+cola.size());                  
                                    }


                                    //METODO PARA VACIAR QUEUE
                                    public void vaciarQueue(){
                                    cola.clear();
                                    System.out.println("Se ha eliminado la cola, COLA VACIA!");
                                    }
                                    
                                    
                                    //METODO PARA BUSCAR EN QUEUE
                                    public void buscarQueue(){
                                    System.out.println("INGRESAR ELEMENTO A BUSCAR EN QUEUE");
                                    teclado = new Scanner(System.in); 
                                    valorBuscado=teclado.next();
                                    if (cola.contains(valorBuscado)){
                                    System.out.println("El elemento si se encuentra en la cola");
                                    }
                                    else{
                                     System.out.println("El elemento NO se encuentra en la cola");
                                    }
                                    }
    
    
    public static void Menu(){
        System.out.println("\n\n\t\t\t================MENU QUEUE=================");
        System.out.println("\t\t\t=                                             =");
        System.out.println("\t\t\t= 1- INSERTAR ELEMENTO A LA COLA QUEUE        =");
        System.out.println("\t\t\t= 2- ELIMINAR ELEMENTO CABEZERA DEL QUEUE     =");
        System.out.println("\t\t\t= 3- MOSTRAR TODOS LOS ELEMENTOS DE QUEUE     =");
        System.out.println("\t\t\t= 4- MOSTRAR CABEZERA DEL QUEUE               =");
        System.out.println("\t\t\t= 5- NUMERO TOTAL DE ELEMENTOS DEL QUEUE      =");
        System.out.println("\t\t\t= 6- VACIAR TODA LA COLA QUEUE                =");
        System.out.println("\t\t\t= 7- BUSCAR ELEMENTO EN QUEUE                 =");
        System.out.println("\t\t\t= 8- SALIR                                    =");
        System.out.println("\t\t\t===============================================");
        System.out.print("\t\t\tIngrese Opcion: ");
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
       QueueX xxx = new QueueX();
       Scanner teclado=new Scanner(System.in);
       Queue cola=new LinkedList();//Usamos LinkedList o creamos la cola
         String dato;
         int opcion;
         
           do{
       
                     Menu();
                     opcion=teclado.nextInt();
                 switch(opcion){
                   case 1:
                       //CODIGO PARA INGRESAR EN QUEUE
                       xxx.insertarQueue();
                       break;
                       
                   case 2:
                       //CODIGO PARA ELIMINAR CABEZERA EN QUEUE
                       xxx.eliminarQueue();
                       break;           
                       
                   case 3:
                       //CODIGO PARA IMPRIMIR QUEUE
                       xxx.imprimirQueue();
                       break;
                       
                   case 4:
                       //CODIGO PARA IMPRIMIR CABEZERA QUEUE
                       xxx.imprimirCabezeraQueue();
                       break;
                   
                   case 5:
                       //CODIGO PARA MOSTRAR # ELEMENTOS
                       xxx.numeroElementQueue();
                       break;
                       
                   case 6:
                       //CODIGO PARA VACIAR TODO QUEUE
                       xxx.vaciarQueue();
                       break;
                       
                   case 7:
                       //CODIGO PARA BUSCAR EN QUEUE
                       xxx.buscarQueue();
                       break;    
                       
                    case 8: 
                        //CODIGO PARA SALIR 
                        System.exit(1);
                        break;
                          
                      default:
                        System.out.println("vuelva ingresar numero dentro del rango indicado");
                        break;
           }
    }while(opcion!=8);
        
           }
}
    
