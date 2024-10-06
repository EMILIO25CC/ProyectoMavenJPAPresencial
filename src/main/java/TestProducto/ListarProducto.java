package TestProducto;

import DaoImp.ProductoImp;
import java.util.List;
import model.TblProducto;
public class ListarProducto {

	public static void main(String[] args) {
		

				ProductoImp proImp = new ProductoImp();
				
				List<TblProducto> listado=proImp.ListadoProducto();
				//Aplicamos un bucle
				for(TblProducto lis:listado){
					//Imprimimos por pantalla
					System.out.print("\n Producto: "+lis.getNomprod()+
									"\n Precio: "+lis.getPrecio()+
									"\n Cantidad "+lis.getCantidad()+
									"\n Total "+lis.getTotal()+
									"\n Cod.Barras "+lis.getCodbarras()+
									"\n Nro.Lote "+lis.getNrolote()+
									"\n FechaVen: "+lis.getFechaven()+"\n\n");
					
	
				}

	}
}