package br.com.siecola.aws_project01.model;

public class ProductEvent {
    private Long prodcuctId;
    private String code;
    private String username;
    private String description;

    public Long getProdcuctId() {
        return prodcuctId;
    }

    public void setProdcuctId(Long prodcuctId) {
        this.prodcuctId = prodcuctId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
