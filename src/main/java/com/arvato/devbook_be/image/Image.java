package com.arvato.devbook_be.image;

import jakarta.persistence.*;

@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "data", columnDefinition = "bytea")
    private byte[] content;

    @Column(name = "content_type", length = 100)
    private String contentType;

    public Image() { }

    public Image(byte[] content, String contentType) {
        this.content = content;
        this.contentType = contentType;
    }

    public Long getId() {
        return id;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
