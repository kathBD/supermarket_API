package com.marketapi.persistence.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable {

    @Column (name = "id_compra")
    private Integer idCompra;

    @Column (name = "id_producto")
    private Integer idProductp;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProductp() {
        return idProductp;
    }

    public void setIdProductp(Integer idProductp) {
        this.idProductp = idProductp;
    }
}
