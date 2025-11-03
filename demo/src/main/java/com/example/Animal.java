import java.util.List;


public class Animal {
    private String nome;
    private String especie;
    private String[] brinquedosFavoritos;
    
    public Animal(String nome, String especie, Sting[] brinquedosFavoritos){
        this.nome = nome;
        this.especie = especie;
        this.brinquedosFavoritos = brinquedosFavoritos;
    }

    public void aoAdotar() {}

}

public class Jabuti extends Animal {
    public Jabuti(String nome, List<String> brinquedosFavoritos) {
        super(nome, "Jabuti", brinquedosFavoritos);
    }
}

public class Gato extends Animal {
    public Gato(String nome, List<String> brinquedosFavoritos) {
        super(nome, "Gato", brinquedosFavoritos);
    }
}

public class Cao extends Animal {
    public Cao(String nome, List<String> brinquedosFavoritos) {
        super(nome, "Cao", brinquedosFavoritos);
    }
}