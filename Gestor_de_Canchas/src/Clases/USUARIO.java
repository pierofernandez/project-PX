/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author SAMIR
 */
public class USUARIO {
    
    private PERSONA persona;
    private CONTACTO contacto;
    private DATOS datos;

    public USUARIO(PERSONA persona, CONTACTO contacto, DATOS datos) {
        this.persona = persona;
        this.contacto = contacto;
        this.datos = datos;
    }

    public PERSONA getPersona() {
        return persona;
    }

    public void setPersona(PERSONA persona) {
        this.persona = persona;
    }

    public CONTACTO getContacto() {
        return contacto;
    }

    public void setContacto(CONTACTO contacto) {
        this.contacto = contacto;
    }

    public DATOS getDatos() {
        return datos;
    }

    public void setDatos(DATOS datos) {
        this.datos = datos;
    }
    
    
    
}
