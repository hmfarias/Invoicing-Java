/************************************************************
 * The persistent class for the INVOICE database table.
 * TABLE INVOICE:
 *     id INT PRIMARY KEY AUTO_INCREMENT,
 *     client_id INT,
 *     created_at DATETIME,
 *     total DECIMAL(11, 2)
 *
 ***********************************************************/

package edu.coderhouse.jpa.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "INVOICE")
public class Invoice {

    // FIELDS ------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CLIENT_ID", nullable = false)
    private Integer clientId;

    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "TOTAL", nullable = false, precision = 11, scale = 2)
    private BigDecimal total;


    // CONSTRUCTORS ------------------------------------------
    public Invoice(){};

    public Invoice(Integer clientId, LocalDateTime createdAt, BigDecimal total) {
        this.clientId = clientId;
        this.createdAt = createdAt;
        this.total = total;
    }

    //GETTERS AND SETTERS -------------------------------------
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
