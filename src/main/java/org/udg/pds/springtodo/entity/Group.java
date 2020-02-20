package org.udg.pds.springtodo.entity;

@Entity(name="usergroup")
public class Group {
  
  public Group() {
  }
  
  @NotNull
  private String name;
  
  @NotNull
  private String description; 
}
