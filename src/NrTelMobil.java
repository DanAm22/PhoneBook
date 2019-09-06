
import Exceptii.NumarTelefonExceptie;

public class NrTelMobil extends NrTel {

    public NrTelMobil(String numarTelefon) {
        super(numarTelefon);
        validareNumar();
    }

    @Override
    public void validareNumar() {
        // Exceptie pentru introducerea unui numar diferit fata de cele clasice
        if (!numarTelefon.substring(0, 2).equals("07")) {
            throw new NumarTelefonExceptie("Numarul introdus nu este un numar de telefon mobil!");
        }
    }

    @Override
    public int compareTo(Object o) {
        NrTelMobil another = (NrTelMobil) o;
        return numarTelefon.compareTo(another.numarTelefon);
    }

    public String toString() {
        return super.numarTelefon;
    }
}
