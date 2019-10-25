package za.co.yanni.fofestore.sessionbeans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.co.yanni.fofestore.entities.Book;

/**
 *
 * @author fofekeney
 */
@Stateless
public class BookFacade extends AbstractFacade<Book> {

    @PersistenceContext(unitName = "yanniUnit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookFacade() {
        super(Book.class);
    }
    
}
