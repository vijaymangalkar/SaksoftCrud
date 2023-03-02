package com.ex.saksoft.Model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
//@Table(name="Data_Model")
public class SakModel {
	
	
@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
private int id;
private String firstName;
private String lastName;
private String email;
private int age;

}
