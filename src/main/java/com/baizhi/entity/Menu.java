package com.baizhi.entity;

public class Menu {
    private Integer id;
    private String menuname;
    private String resourceurl;
    private Integer parent_id;
    private Integer lev;

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", menuname='" + menuname + '\'' +
                ", resourceurl='" + resourceurl + '\'' +
                ", parent_id=" + parent_id +
                ", lev=" + lev +
                '}';
    }

    public Menu() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getResourceurl() {
        return resourceurl;
    }

    public void setResourceurl(String resourceurl) {
        this.resourceurl = resourceurl;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public Menu(Integer id, String menuname, String resourceurl, Integer parent_id, Integer lev) {
        this.id = id;
        this.menuname = menuname;
        this.resourceurl = resourceurl;
        this.parent_id = parent_id;
        this.lev = lev;
    }
}
