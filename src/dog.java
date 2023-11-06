
public class dog {
    String nume;
    String rasa;
    public dog(String nume, String rasa) {
        this.nume = nume;
        this.rasa = rasa;
    }
    public static void main(String[] args){
        dog caine = new dog("Simba", "Akita American");
        System.out.println(caine.nume + " " + caine.rasa);
    }
}