package TestProducto;

import DaoImp.ProductoImp;
import model.TblProducto;

public class ActualizarProducto {

	public static void main(String[] args) {
		
		//Test Actualizar Cliente
		
				TblProducto tblPro= new TblProducto();
				ProductoImp proImp= new ProductoImp();
				
				tblPro.setIdproducto(1);
				tblPro.setNomprod("Atun");
				tblPro.setPrecio(6.2);
				tblPro.setCantidad(8.9);
				tblPro.setTotal(9.63);
				tblPro.setCodbarras("999999999");
				tblPro.setNrolote("lote8558");
				tblPro.setFechaven(null);
				
				proImp.ActualizarProducto(tblPro);
				
				System.out.print("Datos Actualizado en la BD");

	}

}
