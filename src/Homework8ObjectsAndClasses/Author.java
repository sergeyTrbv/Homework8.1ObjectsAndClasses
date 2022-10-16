package Homework8ObjectsAndClasses;

public class Author {

 private final String nameAuthor;
 private final String surnameAuthor;

 public Author(String nameAutor, String surnameAuthor) {
  this.nameAuthor = nameAutor;
  this.surnameAuthor = surnameAuthor;
 }

  public String getNameAuthor(){
   return  this.nameAuthor;
  }

  public String getSurnameAuthor(){
  return this.surnameAuthor;
  }

public String getFullNameAuthor(){
  return this.nameAuthor + " " + this.surnameAuthor;
}



}
