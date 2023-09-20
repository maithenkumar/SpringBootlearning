package com.demoapplication.demoforlearning.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document
public class Books {
        @Id
        private Integer id;
        private String bookName;
        private String des;
        private Integer yearofpublication;
        private String bookType;
        public Books(String bookName, Integer id, String des, Integer yearofpublication, String bookType) {
            this.bookName = bookName;
            this.id = id;
            this.des = des;
            this.yearofpublication = yearofpublication;
            this.bookType = bookType;
        }
        public String getBookName() {
            return bookName;
        }
        public void setBookName(String bookName) {
            this.bookName = bookName;
        }
        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
        public String getdes() {
            return des;
        }
        public void setdes(String des) {
            this.des = des;
        }
        public Integer getYearofpublication() {
            return yearofpublication;
        }
        public void setYearofpublication(Integer yearofpublication) {
            this.yearofpublication = yearofpublication;
        }
        public String getBookType() {
            return bookType;
        }
        public void setBookType(String bookType) {
            this.bookType = bookType;
        }
        

   
    
}
