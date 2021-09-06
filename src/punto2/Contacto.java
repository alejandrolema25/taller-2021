package punto2;

import java.util.List;

public class Contacto {
    public String nombreContacto;
    public long numeroDeContacto;
    public String apellidoDelContacto;
    public List<String>Contacto;
    public List<Contacto>mostrarContacto;
    public Contacto(){
        this.nombreContacto= nombreContacto;
        this.apellidoDelContacto= apellidoDelContacto;
        this.numeroDeContacto= numeroDeContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public long getNumeroDeContacto() {
        return numeroDeContacto;
    }

    public String getApellidoDelContacto() {
        return apellidoDelContacto;
    }
    public List<String>getContacto(){
        return Contacto;
    }
    public void setContacto(List<Contacto>mostarContacto){
        this.mostrarContacto=mostarContacto;

    }

}
