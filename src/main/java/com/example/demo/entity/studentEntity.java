package com.example.demo.entity;
import jakarta.persistance.*;
import jakarta.validation.constraints.*;
@Entity
public class studentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @NotBlank(message="Name is not Valid")
    private String name;

@Email(message="Email format is not valid")
private String email;

public void setId(long id)
{
    this.id=id;
    
}
public long getId()
{
    return id;
}

public studentEntity(){
   
}
public studentEntity (long id,String name,String email){
    this.id=id;
    this.name=name;
    this.email=email;
}

}