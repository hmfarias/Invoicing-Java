/************************************************************
 * The persistent class for the PRODUCT database table.
 * TABLE PRODUCT:
 *     id INT PRIMARY KEY AUTO_INCREMENT,
 *     description VARCHAR(255) NOT NULL,
 *     code VARCHAR(50),
 *     stock INT,
 *     price DECIMAL(11, 2)
 *
 ***********************************************************/

package edu.coderhouse.jpa.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "PRODUCT")
public class Product {

    // FIELDS ------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DESCRIPTION", nullable = false, length = 255)
    private String description;

    @Column(name = "CODE", length = 50)
    private String code;

    @Column(name = "STOCK")
    private Integer stock;

    @Column(name = "PRICE", precision = 11, scale = 2)
    private BigDecimal price;

    // CONSTRUCTORS ------------------------------------------
    public Product(){};

    public Product(String description, String code, Integer stock, BigDecimal price) {
        this.description = description;
        this.code = code;
        this.stock = stock;
        this.price = price;
    }

    //GETTERS AND SETTERS -------------------------------------
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
