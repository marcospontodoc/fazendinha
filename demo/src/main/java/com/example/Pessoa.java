import java.util.Set;
import java.util.HashSet;

public class Pessoa{
   private String id;
   private Set<String> brinquedos;
   private String[] animaisAdotados;
   
   
   public boolean podeAdotar(){
    return this.animaisAdotados.lengh < 3;
   }

   public void adotar(){
    this.animaisAdotados.push(animal);
    animal.aoAdotar(this); 
   }
}