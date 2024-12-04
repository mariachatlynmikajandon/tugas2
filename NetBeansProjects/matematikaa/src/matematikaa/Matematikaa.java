/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematikaa;

/**
 *
 * @author Hp
 */
public class Matematikaa {

    //overloading int pertambahan
    public int pertambahan(int a, int b){
        return a + b;
    }
    
    public int pertambahan(int a, int b, int c){
        return a + b + c;
    }
    
    public double pertambahan( double a, double b){
        return a + b;
        
    }
    
    public double pertambahan(double a, double b, double c){
        return a + b + c;
    }
    
  
    //method lain dengan overloading
    public int pengurangan (int a, int b) {
        return a - b;
    }
    
    public double pengurangan(double a, double b){
        return a -b;
    }
    
    public double pengurangan(double a, double b){
        return a - b;
    }
    
    public int perkalian(double a, double b){
        return (int) (a * b);
    }
    
    public double perkalian(double a, double b){
        return a * b;
    }
    
    public double pembagian( int a, int b){
        return(double) a / b;
    }
    
    public double pembagian(double a, double b){
        return a / b;
    }
    
    public int modulus(int a, int b){
        return a % b;     
    }
    
    public double modulus(double a, double b){
        return a % b;
    }
    
}
    

    
   
