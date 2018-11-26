package com.baizhi.entity;

import javax.xml.crypto.Data;

public class Product {
    private Integer book_id;
    private Integer cid;
    private String book_name;
    private Double book_price;
    private Data groundingDate;
    private String book_state;
    private Integer inventory;
    private String author;
    private String press;
    private Integer editNum;
    private Data print_date;
    private Integer print_count;
    private String ISBN;
    private String word_count;
    private String page_count;
    private String style;
    private String page;
    private String pack;
    private Integer salenum;
    private Double custome_score;
    private String recommend;
    private String messages;
    private String author_msg;
    private String list;
    private String media_comment;
    private String imagePath;
    private String series_name;
    private Double Dangprice;
    private String product_image;
    private Category category;
    private String category_name;

    @Override
    public String toString() {
        return "Product{" +
                "book_id=" + book_id +
                ", cid=" + cid +
                ", book_name='" + book_name + '\'' +
                ", book_price=" + book_price +
                ", groundingDate=" + groundingDate +
                ", book_state='" + book_state + '\'' +
                ", inventory=" + inventory +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", editNum=" + editNum +
                ", print_date=" + print_date +
                ", print_count=" + print_count +
                ", ISBN='" + ISBN + '\'' +
                ", word_count='" + word_count + '\'' +
                ", page_count='" + page_count + '\'' +
                ", style='" + style + '\'' +
                ", page='" + page + '\'' +
                ", pack='" + pack + '\'' +
                ", salenum=" + salenum +
                ", custome_score=" + custome_score +
                ", recommend='" + recommend + '\'' +
                ", messages='" + messages + '\'' +
                ", author_msg='" + author_msg + '\'' +
                ", list='" + list + '\'' +
                ", media_comment='" + media_comment + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", series_name='" + series_name + '\'' +
                ", Dangprice=" + Dangprice +
                ", product_image='" + product_image + '\'' +
                ", category=" + category +
                ", category_name='" + category_name + '\'' +
                '}';
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Product(Integer book_id, Integer cid, String book_name, Double book_price, Data groundingDate, String book_state, Integer inventory, String author, String press, Integer editNum, Data print_date, Integer print_count, String ISBN, String word_count, String page_count, String style, String page, String pack, Integer salenum, Double custome_score, String recommend, String messages, String author_msg, String list, String media_comment, String imagePath, String series_name, Double dangprice, String product_image, Category category) {
        this.book_id = book_id;
        this.cid = cid;
        this.book_name = book_name;
        this.book_price = book_price;
        this.groundingDate = groundingDate;
        this.book_state = book_state;
        this.inventory = inventory;
        this.author = author;
        this.press = press;
        this.editNum = editNum;
        this.print_date = print_date;
        this.print_count = print_count;
        this.ISBN = ISBN;
        this.word_count = word_count;
        this.page_count = page_count;
        this.style = style;
        this.page = page;
        this.pack = pack;
        this.salenum = salenum;
        this.custome_score = custome_score;
        this.recommend = recommend;
        this.messages = messages;
        this.author_msg = author_msg;
        this.list = list;
        this.media_comment = media_comment;
        this.imagePath = imagePath;
        this.series_name = series_name;
        Dangprice = dangprice;
        this.product_image = product_image;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product() {
        super();
    }

    public Product(Integer book_id, Integer cid, String book_name, Double book_price, Data groundingDate, String book_state, Integer inventory, String author, String press, Integer editNum, Data print_date, Integer print_count, String ISBN, String word_count, String page_count, String style, String page, String pack, Integer salenum, Double custome_score, String recommend, String messages, String author_msg, String list, String media_comment, String imagePath, String series_name, Double dangprice, String product_image) {
        this.book_id = book_id;
        this.cid = cid;
        this.book_name = book_name;
        this.book_price = book_price;
        this.groundingDate = groundingDate;
        this.book_state = book_state;
        this.inventory = inventory;
        this.author = author;
        this.press = press;
        this.editNum = editNum;
        this.print_date = print_date;
        this.print_count = print_count;
        this.ISBN = ISBN;
        this.word_count = word_count;
        this.page_count = page_count;
        this.style = style;
        this.page = page;
        this.pack = pack;
        this.salenum = salenum;
        this.custome_score = custome_score;
        this.recommend = recommend;
        this.messages = messages;
        this.author_msg = author_msg;
        this.list = list;
        this.media_comment = media_comment;
        this.imagePath = imagePath;
        this.series_name = series_name;
        Dangprice = dangprice;
        this.product_image = product_image;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Double getBook_price() {
        return book_price;
    }

    public void setBook_price(Double book_price) {
        this.book_price = book_price;
    }

    public Data getGroundingDate() {
        return groundingDate;
    }

    public void setGroundingDate(Data groundingDate) {
        this.groundingDate = groundingDate;
    }

    public String getBook_state() {
        return book_state;
    }

    public void setBook_state(String book_state) {
        this.book_state = book_state;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Integer getEditNum() {
        return editNum;
    }

    public void setEditNum(Integer editNum) {
        this.editNum = editNum;
    }

    public Data getPrint_date() {
        return print_date;
    }

    public void setPrint_date(Data print_date) {
        this.print_date = print_date;
    }

    public Integer getPrint_count() {
        return print_count;
    }

    public void setPrint_count(Integer print_count) {
        this.print_count = print_count;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getWord_count() {
        return word_count;
    }

    public void setWord_count(String word_count) {
        this.word_count = word_count;
    }

    public String getPage_count() {
        return page_count;
    }

    public void setPage_count(String page_count) {
        this.page_count = page_count;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public Integer getSalenum() {
        return salenum;
    }

    public void setSalenum(Integer salenum) {
        this.salenum = salenum;
    }

    public Double getCustome_score() {
        return custome_score;
    }

    public void setCustome_score(Double custome_score) {
        this.custome_score = custome_score;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getAuthor_msg() {
        return author_msg;
    }

    public void setAuthor_msg(String author_msg) {
        this.author_msg = author_msg;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getMedia_comment() {
        return media_comment;
    }

    public void setMedia_comment(String media_comment) {
        this.media_comment = media_comment;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getSeries_name() {
        return series_name;
    }

    public void setSeries_name(String series_name) {
        this.series_name = series_name;
    }

    public Double getDangprice() {
        return Dangprice;
    }

    public void setDangprice(Double dangprice) {
        Dangprice = dangprice;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }
}
