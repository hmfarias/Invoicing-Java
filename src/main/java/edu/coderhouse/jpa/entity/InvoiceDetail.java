/************************************************************
 * The persistent class for the INVOICE_DETAIL database table.
 * TABLE INVOICE_DETAIL::
 *     id INT PRIMARY KEY AUTO_INCREMENT,
 *     invoice_id INT,
 *     amount INT,
 *     product_id INT NOT NULL,
 *     price DECIMAL(11, 2),
 *     description VARCHAR(255) NOT NULL
 *
 ***********************************************************/

package edu.coderhouse.jpa.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "INVOICE_DETAIL")
public class InvoiceDetail {

    // FIELDS ------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "INVOICE_ID")
    private Integer invoiceId;

    @Column(name = "AMOUNT", nullable = false)
    private Integer amount;

    @Column(name = "PRODUCT_ID", nullable = false)
    private Integer productId;

    @Column(name = "PRICE", precision = 11, scale = 2)
    private BigDecimal price;

    @Column(name = "DESCRIPTION", nullable = false, length = 255)
    private String description;

    // CONSTRUCTORS ------------------------------------------
    public InvoiceDetail() {}

    // Constructor con todos los parámetros
    public InvoiceDetail(Integer invoiceId, Integer amount, Integer productId, BigDecimal price, String description) {
        this.invoiceId = invoiceId;
        this.amount = amount;
        this.productId = productId;
        this.price = price;
        this.description = description;
    }

    //GETTERS AND SETTERS -------------------------------------
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
