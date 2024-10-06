package DaoImp;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;

import model.TblProducto;

public class ProductoImp implements IProducto{

	public EntityManager em;
	public ProductoImp(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAMavenMarNoche");
		em = emf.createEntityManager();
	}
	
	public void RegistrarProducto(TblProducto producto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoJPAMavenMarNoche");
		EntityManager em = emf.createEntityManager();
		
		try {
			//Iniciamos transaccion
			em.getTransaction().begin();
			
			em.persist(producto);
			//Confirmamos la Transaccion
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
		
		
	}//Fin del método registrar

	public void ActualizarProducto(TblProducto producto) {
		
		
		try {
			em.getTransaction().begin();
			
			em.merge(producto);
			
			em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
		
	}//Fin del método Actualizar

	public void EliminarProducto(TblProducto producto) {
		
		
		 try {
			 em.getTransaction().begin();
			 TblProducto eliminarPro = em.find(TblProducto.class,producto.getIdproducto());
			 if(eliminarPro !=null){
				 em.remove(eliminarPro);
				 
				 System.out.print("Producto Eliminado");
			 }else{
				 System.out.print("El producto ya fue eliminado de la BD o no se encontro el ID ");
			 }
			 em.getTransaction().commit();
			
		} catch (RuntimeException e) {
			//em.getTransaction().isActive() em.getTransaction().rollback();
			
		}finally {
			em.close();
		}
		
	}

	public List<TblProducto> ListadoProducto() {
		
		
		List<TblProducto> listado = null;
		
		try {
			//Iniciar la Transacción
			em.getTransaction().begin();
			//Aplicamos consulta JPA (JAVA PERSISTENCE QUERY LANGUAGE )
			listado=em.createQuery("select c from TblProducto c",TblProducto.class).getResultList();
		
			//Confirmamos 
			em.getTransaction().commit();
			
		
		}catch(RuntimeException ex){
			ex.getMessage();
		}
		finally {
			em.close();
		}
		
		return listado;
	}

	public TblProducto BusacarProducto(TblProducto producto) {
		
		
		TblProducto  tblPro =null;
try{
		//Iniciar Transacción
		em.getTransaction().begin();
		//Recuperamos el ID del Cliente
		tblPro=em.find(TblProducto.class,producto.getIdproducto());
		if(tblPro !=null){
			System.out.print("     \t  \n ==== Cliente encontrado ==== \n\n");
		}else{
			System.out.print("\n Cliente NO encontrado :( ");
		}
		//Confirmamos Transacción
		em.getTransaction().commit();
		
		//retornamos el cliente
		}catch(RuntimeException e){
			e.getMessage();
		}finally {
			//cerramos 
			em.close();
		}
		return tblPro;
		
		
	}

	
}
