package Main;

import Cliente.Cliente;
import Cuenta.Ahorro;
import Cuenta.Corriente;
import Cuenta.Cuenta;
import Plataforma.Plataforma;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Plataforma plataforma = new Plataforma();
        Cliente clienteGeneral = new Cliente();
        Cuenta cuentaGeneral = new Cuenta();

        Cuenta cuenta1 = new Ahorro(123456, (float) 5.000, (float) 10.000, 5, (float) 3.5);
        Cuenta cuenta2 = new Corriente(223456, (float) 6.000, (float) 10.000, (float) 2.000, (float) 3.500, (float) 4.000);

        Cliente cliente = new Cliente("Jorge", "Perez", 1151);
        plataforma.agregarCliente(cliente);
        cliente.agregarCuenta(cuenta1);
        cliente.agregarCuenta(cuenta2);

        Cliente cliente2 = new Cliente("Claudia", "Gomez", 1152);
        plataforma.agregarCliente(cliente2);
        cliente2.agregarCuenta(cuenta1);

        Cliente cliente3 = new Cliente("Rene", "Higuita", 1153);
        plataforma.agregarCliente(cliente3);
        cliente3.agregarCuenta(cuenta2);

        Scanner sc = new Scanner(System.in);

        byte opcion = 1;
        while (opcion != 0) {
            System.out.println("""
                               Bienvenido al Banco 
                               1. Mostrar cuentas asignada. 
                               2. Determinar la cantidad de cuentas. 
                               3. Mostrar el saldo de la cuenta de ahorros y corriente. 
                               """);
            opcion = sc.nextByte();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Digite el RUT del cliente del que desea mostrar sus diferentes cuentas:");
                    int rut = sc.nextInt();
                    if (plataforma.existeCliente(rut) == true) {
                        plataforma.imprimirCuentasCliente(plataforma.obtenerObjetoCliente(rut));
                    }
                    else {
                        System.out.println("NO EXISTE EL CLIENTE EN EL SISTEMA!");
                    }
                    System.out.println();
                }

                case 2 -> {
                    System.out.println("Digite el RUT del cliente al que desea mostrar el numero (conteo) de cuentas:");
                    int rut = sc.nextInt();
                    if (plataforma.existeCliente(rut)) {
                        plataforma.contarCuentasCliente(plataforma.obtenerObjetoCliente(rut));
                    }
                    else {
                        System.out.println("NO EXISTE EL CLIENTE EN EL SISTEMA!");
                    }
                    System.out.println();
                }

                case 3 -> {
                    System.out.println("Digite el RUT del cliente del que desea mostrar sus saldos de cuenta:");
                    int rut = sc.nextInt();
                    System.out.println();
                }

                default ->
                    throw new AssertionError();
            }
        }

    }

}