package TestProducto;


import java.util.Date;

import DaoImp.ProductoImp;

import model.TblProducto;

public class RegistrarProducto {

	public static void main(String[] args) {
		
		TblProducto tblpro = new TblProducto();
		ProductoImp proimp = new ProductoImp();
		
		tblpro.setNomprod("USB");
		tblpro.setPrecio(3.5);
		tblpro.setCantidad(4);
		tblpro.setTotal(tblpro.getPrecio()*tblpro.getCantidad());
		tblpro.setCodbarras("77778888");
		tblpro.setNrolote("lote4569");
		Date fecha= new Date();
		Date fechasql = new Date(fecha.getTime());
		tblpro.setFechaven(fechasql);
		
		proimp.RegistrarProducto(tblpro);
		
		System.out.print(" \n\n Producto Registrado");
		
		
		tblpro.setIdproducto(1);
		
		
		//===========================================================================================
	
		
		
	}

}
