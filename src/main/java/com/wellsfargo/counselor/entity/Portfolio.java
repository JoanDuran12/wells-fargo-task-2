package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(Client client, String creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {

        return portfolioId;
    }

    public Client getClient() {

        return client;
    }

    public String getCreationDate() {

        return creationDate;
    }

    public void setCreationDate(String creationDate) {

        this.creationDate = creationDate;
    }
}
