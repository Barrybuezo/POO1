package org.example;
import org.example.models.clienteModel;
import org.example.models.mecanicoModel;
import org.example.models.repuestosModel;
import org.example.models.vehiculoModel;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        mecanicoModel mecanico = new mecanicoModel();
        clienteModel cliente = new clienteModel();
        vehiculoModel vehiculo = new vehiculoModel();
        repuestosModel repuesto = new repuestosModel();

        int continuar;

        do{
            System.out.println("Bienvenido");
            System.out.println("---MENÚ---");
            System.out.println("1. Registro de mecanico");
            System.out.println("2. Registro de Cliente");
            System.out.println("3. Registro de Vehiculo");
            System.out.println("4. Registro de Repuestos");
            System.out.println("5. Detalles de pago");
            System.out.println("0. Salir");
            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    System.out.println("Ingrese los datos del mecanico:");

                    System.out.print("Nombre: "); mecanico.setNombre(sc.nextLine());
                    System.out.print("Direccion: "); mecanico.setDireccion(sc.nextLine());
                    System.out.print("Telefono: "); mecanico.setTelefono(sc.nextLine());
                    System.out.print("DPI: "); mecanico.setDpi(sc.nextLine());
                    System.out.print("Especialidad: "); mecanico.setEspecialidad(sc.nextLine());
                    System.out.print("Edad: "); mecanico.setEdad(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Ingese los datos del cliente");

                    System.out.print("Nombre: "); cliente.setNombre(sc.nextLine());
                    System.out.print("Direccion: "); cliente.setDireccion(sc.nextLine());
                    System.out.print("Telefono: "); cliente.setTelefono(sc.nextLine());
                    System.out.print("Nit: "); cliente.setNit(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Ingrese los datos del vehiculo");

                    System.out.print("Marca: "); vehiculo.setMarca(sc.nextLine());
                    System.out.print("Tipo: "); vehiculo.setTipo(sc.nextLine());
                    System.out.print("Modelo: "); vehiculo.setModelo(sc.nextLine());
                    System.out.print("Placa: "); vehiculo.setPlaca(sc.nextLine());
                    System.out.print("Año: "); vehiculo.setAnio(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Ingrese los datos del repuesto");
                    System.out.print("ID: "); repuesto.setId(sc.nextLine());
                    System.out.print("Nombre: "); repuesto.setNombre(sc.nextLine());
                    System.out.print("Fecha de ingreso: "); repuesto.setFechaIngreso(sc.nextLine());
                    System.out.print("Precio: "); repuesto.setPrecio(sc.nextDouble());
                    break;
                case 5:
                    System.out.println("Detalles de pago");
                    System.out.println("Cliente: " + cliente.getNombre());
                    System.out.println("Precio del repuesto: " + repuesto.getPrecio());
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no valida");
            }

            do{
                System.out.println("Desea continuar?");
                System.out.println("SI(1) \nNO(2)");continuar = sc.nextInt();
                if(continuar < 1 || continuar > 2){
                    System.out.println("Opción no valida");
                }
            }while(continuar < 1 || continuar > 2);

        }while(continuar != 2);
    }
}
