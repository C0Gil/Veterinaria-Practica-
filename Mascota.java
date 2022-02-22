/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

/**
 *
 * @author gilbe
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private Diagnostico contenedor;

    public Mascota(String nombre, String especie, int edad, String fecha, String descripcion) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.contenedor = new Diagnostico(fecha, descripcion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Diagnostico getContenedor() {
        return contenedor;
    }

    public void setContenedor(Diagnostico contenedor) {
        this.contenedor = contenedor;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", especie=" + especie + ", edad=" + edad + ", contenedor=" + contenedor + '}';
    }        
    
}
