package atividade1.app.models;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_db")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String address;
    private Date startDate;
    private Date finishDate;


public User(){}

//name
public void setName(String name){
    this.name = name;
}
public String getName(){
    return this.name;
}

//address
public void setAddress(String address){
    this.address = address;
}
public String getAddress(){
    return this.address;
}

//startDate
public void setStartDate(Date startDate){
    this.startDate = startDate;
}
public Date getStartDate(){
    return this.startDate;
}

//finishDate
public void setFinishDate(Date finishDate){
    this.finishDate = finishDate;
}
public Date getFinishDate(){
    return this.finishDate;
}

}
