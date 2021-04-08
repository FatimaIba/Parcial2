/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author fatii
 */
public class Proyecto {

    private int codigoCliente;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String telefono;
    private String direccion;
    private int edad;
    private int Clientes[];
    private int tam;
    private int espacio;

    public Proyecto() {
    }

    public Proyecto(int codigoCliente, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String direccion, int edad, int Clientes[], int tam, int espacio) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
        this.Clientes = Clientes;
        this.tam = tam;
        this.espacio = espacio;
    }


    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public int getTam() {
        return tam;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public int[] getClientes() {
        return Clientes;
    }

    public void setClientes(int[] Clientes) {
        this.Clientes = Clientes;
    }



}
