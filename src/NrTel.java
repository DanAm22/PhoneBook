
import Exceptii.NumarTelefonExceptie;

public abstract class NrTel implements Comparable {

    String numarTelefon;

    public NrTel(String numarTelefon) {
        // Exceptie pentru lungimea numarul de telefon diferita de 10 cifre
        if (numarTelefon.length() != 10) {
            throw new NumarTelefonExceptie("Numarul de telefon nu este format din 10 cifre!");
        }

        char[] listaCharTel = numarTelefon.toCharArray(); // Convertim String-ul numarTelefon intr-o lista de caractere pentru a determina daca acesta contine doar cifre
        for (int i = 0; i < listaCharTel.length; i++) {
            if (!Character.isDigit(listaCharTel[i])) {
                throw new NumarTelefonExceptie("Numarul de telefon introdus nu poate sa contina cifre");
            }
        }
        this.numarTelefon = numarTelefon;
    }

    public abstract void validareNumar();

    @Override
    public boolean equals(Object o) {
        NrTel another = (NrTel) o;
        return numarTelefon.equals(another.numarTelefon);
    }

    @Override
    public String toString() {
        return numarTelefon;
    }

    @Override
    public int compareTo(Object o) {
        NrTel another = (NrTel) o;
        return numarTelefon.compareTo(another.numarTelefon);
    }
}
