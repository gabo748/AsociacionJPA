package data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "estudiante", schema = "test", catalog = "")
public class EstudianteEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idestudiante")
    private int idestudiante;
    @Basic
    @Column(name = "carnet")
    private String carnet;
    @Basic
    @Column(name = "nombres")
    private String nombres;
    @Basic
    @Column(name = "apellidos")
    private String apellidos;

    public EstudianteEntity(int idestudiante, String carnet, String nombres, String apellidos) {
        this.idestudiante = idestudiante;
        this.carnet = carnet;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public EstudianteEntity() {

    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstudianteEntity that = (EstudianteEntity) o;

        if (idestudiante != that.idestudiante) return false;
        if (carnet != null ? !carnet.equals(that.carnet) : that.carnet != null) return false;
        if (nombres != null ? !nombres.equals(that.nombres) : that.nombres != null) return false;
        if (apellidos != null ? !apellidos.equals(that.apellidos) : that.apellidos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idestudiante;
        result = 31 * result + (carnet != null ? carnet.hashCode() : 0);
        result = 31 * result + (nombres != null ? nombres.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        return result;
    }
}
