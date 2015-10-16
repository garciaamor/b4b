
package boletin4b1;


public class Coche {
    //atributos siemmpre private
    private float kilom;
    private float litros;
    private float velMed;
    private float preGas;
    //constructores
    public Coche(){    
    }
    public Coche(float km, float lit, float vMed, float pGas){
    kilom=km;
    litros=lit;
    velMed=vMed;
    preGas=pGas; 
    }
    //metodos
    public void setkm (float km){
        kilom=km;             
    }
    public void setlit (float lit){
        litros=lit;             
    }
    public void setvMed (float vMed){
        velMed=(vMed);             
    }
    public void setpGas (float pGas){
        preGas=pGas;
    }
    public float getTempo (){
        return kilom/velMed;    
    }
    public float getvMed (){
        return (velMed);
    }
    public float ConsumoMedio(){
        return litros*100/kilom;
    }
    public float ConsumoEuros(){
        return litros*100/kilom/preGas;
    }
    
    
    
}
