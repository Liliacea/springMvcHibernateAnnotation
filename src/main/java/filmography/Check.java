package filmography;

import filmography.config.HibernateConfig;
import filmography.dao.FilmDAOImpl;
import filmography.model.Film;
import org.hibernate.SessionFactory;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Check {
    public static void main(String[] args) {
        HibernateConfig config = new HibernateConfig();
FilmDAOImpl filmDAO = new FilmDAOImpl((SessionFactory) config.sessionFactory());

Film film = new Film();
film.setId(GenerationType.AUTO.ordinal());
film.setTitle("aaa");
film.setGenre("ddd");
film.setYear(1234);
film.setWatched(true);

filmDAO.add(film);
    }
}
