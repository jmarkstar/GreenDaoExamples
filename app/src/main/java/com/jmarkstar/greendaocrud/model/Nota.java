package com.jmarkstar.greendaocrud.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

import java.util.Date;

/** Model
 * Created by jmarkstar on 19/05/2017.
 */
@Entity
public class Nota {

    //Especifica que el campo es el ID de la tabla y será auto-incrementado.
    @Id private Long id;

    @NotNull private String texto;
    @NotNull private Date date;

    @Generated(hash = 318617886)
    public Nota(Long id, @NotNull String texto, @NotNull Date date) {
        this.id = id;
        this.texto = texto;
        this.date = date;
    }

    @Generated(hash = 1022734805)
    public Nota() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
