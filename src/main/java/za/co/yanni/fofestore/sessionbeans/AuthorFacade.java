package za.co.yanni.fofestore.sessionbeans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.co.yanni.fofestore.entities.Author;

/**
 *
 * @author fofekeney
 */
@Stateless
public class AuthorFacade extends AbstractFacade<Author> {

    @PersistenceContext(unitName = "yanniUnit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AuthorFacade() {
        super(Author.class);
    }
    
}
