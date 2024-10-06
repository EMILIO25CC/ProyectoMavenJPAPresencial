package TestProducto;

import DaoImp.ProductoImp;
import model.TblProducto;

public class EliminarProducto {

	public static void main(String[] args) {
		
		TblProducto tblPro = new TblProducto();
		ProductoImp proImp = new ProductoImp();
		
		tblPro.setIdproducto(1);
		
		proImp.EliminarProducto(tblPro);

	}

}
