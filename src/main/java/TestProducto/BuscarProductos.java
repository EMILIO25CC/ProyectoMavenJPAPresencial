package TestProducto;

import DaoImp.ProductoImp;
import model.TblProducto;

public class BuscarProductos {

	public static void main(String[] args) {
		
		
		TblProducto tblPro = new TblProducto();
		ProductoImp proImp = new ProductoImp();
		
		tblPro.setIdproducto(3);;
		TblProducto producto = proImp.BusacarProducto(tblPro);
		
		
		System.out.print("Producto: "+producto.getNomprod()+"\n"+"\n"+
				"Precio: "+producto.getPrecio()+"\n"+"\n"+
				"Cantidad: \t"+producto.getCantidad()+"\n"+"\n"+
				"Total: \t"+producto.getTotal()+"\n"+"\n"+
				"Cod.Barras: "+producto.getCodbarras()+"\n"+"\n"+
				"Nro.Lote: "+producto.getNrolote()+"\n"+"\n"+
				"Fecha.Ven: \t"+producto.getFechaven());
		
		 
	}//Fin del método main []

}//FIN DEL TEST
