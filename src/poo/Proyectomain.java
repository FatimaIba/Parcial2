/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author fatii
 */
public class Proyectomain {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Clientes[] clientes;
        int tam;
        boolean num = false;
        int cliente;
        System.out.print("De que tamaño quieres la agenta:");
        tam = sc.nextInt();
        clientes = new Clientes[tam];

        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Clientes();
        }
        int resp = Integer.parseInt(sc.nextLine());
        while (resp != 0) {
            System.out.println("------MENU------");
            System.out.println("1. Agregar al cliente");
            System.out.println("2. Mostrar cliente ");
            System.out.println("3. Buscar cliente");
            System.out.println("0. Cerrar sistema");
            System.out.print("Eligue una opcion: ");
            resp = sc.nextInt();

        }
        while (num == false);
        System.out.println("El numero que ingresaste no se encuentra en el menu");

        switch (resp) {
            case 1:
                System.out.println("Codigo del cliente:" + 1);
                int codigoCliente = sc.nextInt();
                System.out.print("Ingresa el nombre:");
                String nombre = sc.nextLine();
                System.out.print("Introduce el apellido Paterno:");
                String apellidoPaterno = sc.nextLine();
                System.out.print("Introducir el apellido materno:");
                String apellidoMaterno = sc.nextLine();
                System.out.print("Ingresa el  numero de telefono:");
                String telefono = sc.nextLine();
                System.out.print("Ingresa la direccion:");
                String direccion = sc.nextLine();
        }
        break;

    

            case 2:
            for(int i=0; i<)
        

    }
}
