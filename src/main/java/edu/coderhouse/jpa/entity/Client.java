/************************************************************
 * The persistent class for the CLIENT database table.
 * TABLE CLIENT:
 *     id INT PRIMARY KEY AUTO_INCREMENT,
 *     name VARCHAR(80) NOT NULL,
 *     lastname VARCHAR(80),
 *     docnumber VARCHAR(11)
 *
 ***********************************************************/

package edu.coderhouse.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CLIENT")
public class Client {

    // FIELDS ------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME", nullable = false, length = 80)
    private String name;

    @Column(name = "LASTNAME", length = 80)
    private String lastname;

    @Column(name = "DOCNUMBER", length = 11)
    private String docNumber;

    // CONSTRUCTORS ------------------------------------------
    public Client(){};

    public Client(String name, String lastname, String docNumber) {
        this.name = name;
        this.lastname = lastname;
        this.docNumber = docNumber;
    }

    //GETTERS AND SETTERS -------------------------------------
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }
}

