package pays;

import javax.persistence.*;

/**
 * Created by Laura on 08/11/2015.
 */
@Entity
@Table(name = "pays", schema = "", catalog = "mespays")
public class Pays {
    private String nomPays;
    private String nomCapitale;
    private long nbHabitants;

    @Id
    @Column(name = "NOM_PAYS")
    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    @Basic
    @Column(name = "NOM_CAPITALE")
    public String getNomCapitale() {
        return nomCapitale;
    }

    public void setNomCapitale(String nomCapitale) {
        this.nomCapitale = nomCapitale;
    }

    @Basic
    @Column(name = "NB_HABITANTS")
    public long getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(long nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pays that = (Pays) o;

        if (nbHabitants != that.nbHabitants) return false;
        if (nomPays != null ? !nomPays.equals(that.nomPays) : that.nomPays != null) return false;
        if (nomCapitale != null ? !nomCapitale.equals(that.nomCapitale) : that.nomCapitale != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nomPays != null ? nomPays.hashCode() : 0;
        result = 31 * result + (nomCapitale != null ? nomCapitale.hashCode() : 0);
        result = 31 * result + (int) (nbHabitants ^ (nbHabitants >>> 32));
        return result;
    }
}
