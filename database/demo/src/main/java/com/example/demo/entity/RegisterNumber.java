package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "register_number")
public class RegisterNumber 
{
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private long id;

      private String regno;
      
      public String getRegno() {
        return regno;
    }

      public void setRegno(String regno) {
          this.regno = regno;
      }

      @Column(name = "regno")
      public long getId() {
          return id;
      }

      public void setId(long id) {
          this.id = id;
      }

}
