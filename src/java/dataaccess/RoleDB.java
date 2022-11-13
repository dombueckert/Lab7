package dataaccess;

import java.util.List;
import javax.persistence.*;
import models.Role;

public class RoleDB {
    EntityManagerFactory emFactory = DBUtil.getEmFactory();
    public List<Role> getAll() throws Exception {
        EntityManager em = emFactory.createEntityManager();
        return em.createNamedQuery("Role.findAll", Role.class).getResultList();
    }
}
