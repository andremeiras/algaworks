package war;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Cliente;
import model.TipoPessoa;

public class App 
{
    public static void main( String[] args ){

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoPU");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction tran = manager.getTransaction();
        
        tran.begin();
        Cliente cliente = new Cliente();
        cliente.setNome("João das Couves");
        cliente.setEmail("joao@couve.com");
        cliente.setDocumentoReceitaFederal("123.123.123.-12");
        cliente.setTipo(TipoPessoa.FISICA);
        tran.commit();
    }
}
