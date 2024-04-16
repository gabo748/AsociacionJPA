package data;

import org.eclipse.persistence.annotations.CascadeOnDelete;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "credencial", schema = "test", catalog = "")
@CascadeOnDelete
public class CredencialEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idcredencial")
    private int idcredencial;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "activo")
    private Boolean activo;
    @Basic
    @Column(name = "idestudiante")
    private Integer idestudiante;

    public CredencialEntity(String username, String password, Boolean activo, Integer idestudiante) {
        this.username = username;
        this.password = password;
        this.activo = activo;
        this.idestudiante = idestudiante;
    }

    public CredencialEntity() {

    }

    public int getIdcredencial() {
        return idcredencial;
    }

    public void setIdcredencial(int idcredencial) {
        this.idcredencial = idcredencial;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Integer idestudiante) {
        this.idestudiante = idestudiante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CredencialEntity that = (CredencialEntity) o;

        if (idcredencial != that.idcredencial) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (activo != null ? !activo.equals(that.activo) : that.activo != null) return false;
        if (idestudiante != null ? !idestudiante.equals(that.idestudiante) : that.idestudiante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idcredencial;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (activo != null ? activo.hashCode() : 0);
        result = 31 * result + (idestudiante != null ? idestudiante.hashCode() : 0);
        return result;
    }
}
